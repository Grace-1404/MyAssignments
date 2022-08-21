package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		////To add driver to the code
		WebDriverManager.chromedriver().setup();
	
	//To open browser
    ChromeDriver driver = new ChromeDriver();
    
	//To launch URL
    driver.get("http://leaftaps.com/opentaps/control/login");
    
    //To maximize the browser
    driver.manage().window().maximize();
    
    //Enter UserName and Password Using Id Locator
    WebElement elementUsername = driver.findElement(By.id("username"));
    elementUsername.sendKeys("Demosalesmanager");
    WebElement elementPassword = driver.findElement(By.id("password"));
    elementPassword.sendKeys("crmsfa");
    
  //Click on Login Button using Class Locator
  	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
  	elementLogin.click();
	
  	//Click on CRM/SFA Link
  	WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
  	elementCRMSFA.click();
	
  	//Click on Leads Button/Create lead
  	WebElement elementLead = driver.findElement(By.linkText("Leads"));
  	elementLead.click();
  	
  	WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
  	elementCreateLead.click();
	
  	//Enter CompanyName Field Using id Locator
  	WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	elementCompanyName.sendKeys("TCS");
	
	//Enter FirstName Field Using id Locator
	WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
	elementFirstName.sendKeys("Grace");
	
	//Enter LastName Field Using id Locator
	WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
	elementLastName.sendKeys("MartinMinoson");
	
	//Enter First Name Local Field Using id Locator
	WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	elementFirstNameLocal.sendKeys("GAC");
	
	//Enter Department Field 
	WebElement elementDepartment = driver.findElement(By.name("departmentName"));
	elementDepartment.sendKeys("Credit Card");
	
	//Enter Description Field 
	WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
	elementDescription.sendKeys("Credit Card Payments");
	
	//Enter your email in the E-mail address Field
	WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
	elementEmailAddress.sendKeys("graceamirtha.c@gmail.com");
	
	//Select State/Province as NewYork Using Visible Text
	WebElement elementState = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select state = new Select(elementState);
	state.selectByVisibleText("New York");
	
	//Click on Create Button
	WebElement elementSubmit = driver.findElement(By.name("submitButton"));
	elementSubmit.click();
	
	//Get the Title of Resulting Page
	String title = driver.getTitle();
	
	if(driver.getTitle().contains("View Lead | opentaps CRM"))
	{
		System.out.println("Lead Created Successfully");
	}
	else {
		System.out.println("Lead Creation Failed");
		
	}
		
	
	
	
	
	
	
	
	}	
	
}
