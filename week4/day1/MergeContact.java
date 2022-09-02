package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	
	public static void main(String[] args)  {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
	//	Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts using Xpath Locator
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on Widget of From Contact
		driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		
		Set<String> window1 = driver.getWindowHandles();
		List<String> W1 = new ArrayList <String>(window1);
		driver.switchTo().window(W1.get(1));
		
		
	  //Click on First Resulting Contact
		driver.findElement(By.linkText("DemoCustomer")).click();
		driver.switchTo().window(W1.get(0));
        System.out.println(window1);
		
		//Click on Widget of To Contact
        
		driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[2]")).click();
		Set<String> window2 = driver.getWindowHandles();
		List<String> W2 = new ArrayList <String>(window2);
		System.out.println(window2);
		driver.switchTo().window(W2.get(1)); 
		
       
		
		//Click on Second Resulting Contact
		driver.findElement(By.linkText("DemoLBCust")).click();
		driver.switchTo().window(W2.get(0));
        System.out.println(window2);
		
		
		//Click on Merge button using Xpath Locator
        driver.switchTo().window(W2.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Accept the Alert
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		//Thread.sleep(1000);
		
		
		//Verify the title of the page
		System.out.println("Title page:" +driver.getTitle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
