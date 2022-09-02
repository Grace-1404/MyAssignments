package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Enter the username 
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("Password#123");
		
		//click on the login button
		driver.findElement(By.id("Login")).click();
		
		//click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//span[text() = 'Learn More']")).click();
		
		//Switch to the next window using Windowhandles.
		Set<String> window1 = driver.getWindowHandles();
		List<String> W1 = new ArrayList <String>(window1);
		driver.switchTo().window(W1.get(1));
		//click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text() = 'Confirm']")).click();
		//Get the title
		System.out.println(driver.getTitle());
		
		//Get back to the parent window
		
		driver.switchTo().window(W1.get(0));
		
		//close the browser
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
