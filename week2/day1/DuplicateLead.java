package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	  	elementCRMSFA.click();
	  	
	  	WebElement elementLead = driver.findElement(By.linkText("Leads"));
	  	elementLead.click();
	  	
	  	
	  	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
	  	elementCreateLead.click();
	  	
	  	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TCS");
		
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Grace");
		
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("MartinMinoson");
		
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("GAC");
		
		WebElement elementDepartment = driver.findElement(By.name("departmentName"));
		elementDepartment.sendKeys("Credit Card");
		
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Credit Card Payments");
		
		WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailAddress.sendKeys("graceamirtha.c@gmail.com");
		
		
		WebElement elementState = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(elementState);
		state.selectByVisibleText("New York");
		
		WebElement elementSubmit = driver.findElement(By.name("submitButton"));
		elementSubmit.click();
		
		String title = driver.getTitle();
		
		if(driver.getTitle().contains("View Lead | opentaps CRM"))
		{
			System.out.println("Lead Created Successfully");
		}
		else {
			System.out.println("Lead Creation Failed");
			
		}
		WebElement elementDuplicate = driver.findElement(By.linkText("Duplicate Lead"));
		elementDuplicate.click();
		
		WebElement elementNewCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementNewCompanyName.clear();
		elementNewCompanyName.sendKeys("CTS");
		
		WebElement elementNewFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementNewFirstName.clear();
		elementNewFirstName.sendKeys("Gray");
		
		WebElement elementNewSubmit = driver.findElement(By.className("smallSubmit"));
		elementNewSubmit.click();
		
		String title2 = driver.getTitle();
		
		if(driver.getTitle().contains("View Lead | opentaps CRM"))
		{
			System.out.println("Lead Duplicated Successfully");
		}
		else {
			System.out.println("Lead Duplication Failed");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
