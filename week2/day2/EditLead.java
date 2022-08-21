package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Grace");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title="View Lead";
		String title2 = driver.getTitle();
		if (title.equalsIgnoreCase(title2)){
			System.out.println("Title matched");
		}
		else{
				System.out.println("Title not matched");
			}
		
		driver.findElement(By.linkText("Edit")).click();
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("TCSS");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		boolean displayed = driver.findElement(By.id("viewLead_companyName_sp")).isDisplayed();
		System.out.println(displayed);
		driver.close();
		
	}
			
		
		
		
		
		
		
		
	}


