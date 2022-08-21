package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoomSession1 {
	public static void main(String[] args) {
		
	//To add driver to the code
	WebDriverManager.edgedriver().setup();
	
	//open a browser
	EdgeDriver driver = new EdgeDriver();
	
	//To load an url
	driver.get("http://leaftaps.com/opentaps");
	
	//To maximize the browser
	driver.manage().window().maximize();
	
	//To find the element
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	
	WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
	elementPassword.sendKeys("crmsfa");
	
	WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
	WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
	String text = elementWelcomeMessage.getText();
	System.out.println(text);
	
	if(text.contains("Welcome")) {
		System.out.println("Login Successfull");
		
	}else {
		System.out.println("Login is failed");
	}
	
	WebElement elementCRMSFA = driver.findElement(By.className("decorativeSubmit"));
	elementLogin.click();
	
			
	
	
	
	}
}
