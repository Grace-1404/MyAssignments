package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	
	public static void main(String[] args) throws InterruptedException {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				Thread.sleep(2000);
				String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				System.out.println(leadID);
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				driver.findElement(By.linkText("Delete")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				String text = driver.findElement(By.className("x-paging-info")).getText();
				System.out.println(text);
				if(text.equalsIgnoreCase("No records to display"))
				{
					System.out.println("Text matched");
					}
					else{
					System.out.println("Text not matched");
					}
				driver.close();
				
				
		
		
		
	}

}
