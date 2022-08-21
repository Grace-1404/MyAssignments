package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateFacebookAccount {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Grace");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("M");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("12345678");
		
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("123456789");
		
		// Step 11: Handle all the three drop downs
		WebElement elementdropDown1 = driver.findElement(By.id("day"));
		Select date = new Select(elementdropDown1);
		date.selectByVisibleText("4");
		
		WebElement elementdropDown2 = driver.findElement(By.id("month"));
		Select month = new Select(elementdropDown2);
		month.selectByVisibleText("Mar");
		
		WebElement elementdropDown3 = driver.findElement(By.id("year"));
		Select year = new Select(elementdropDown3);
		year.selectByVisibleText("1997");

		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
		
	}
}
