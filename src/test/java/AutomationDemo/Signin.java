package AutomationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Signin {
	@Test
public void SiginaccountMethod() {
		
		//Browser Launch 
		System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementByClassName("login").click();
		
		driver.findElementById("email").sendKeys("mindumadhi@gmail.com");
		driver.findElementById("passwd").sendKeys("PassWord1");
		driver.findElementById("SubmitLogin").click();
		
		
		
		driver.findElementByClassName("common-radioIndicator").click();

//		System.out.println(title); // will return "the Title of SPAN"
//		System.out.println(label); // will return "The Text"
}
	
@Test
public void CreateAccountMethod() {
		
		//Browser Launch 
		System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		//Clicking the button
		driver.findElementByClassName("login").click();
		
		//Entering data in Edit box
		driver.findElementById("email_create").sendKeys("mindumadhi@gmail.com");
		
		driver.findElementById("SubmitCreate").click();
		
		// Select MR
		
		driver.findElementById("uniform-id_gender1").click();
		//First NAme
		driver.findElementById("customer_firstname").sendKeys("Indumadhi");
		
		//LastName
		driver.findElementById("customer_lastname").sendKeys("Mahalingam");
		
		//Password
		driver.findElementById("passwd").sendKeys("PassWord1");


		//Selecting a value from a dropdown field.
		WebElement days = driver.findElementById("days");
		Select dateObj = new Select(days);
		dateObj.selectByValue("25");
		
		WebElement month = driver.findElementById("months");
		Select monthObj = new Select(month);
		//monthObj.selectByValue("April");
		monthObj.selectByValue("4");
		
		WebElement year = driver.findElementById("years");
		Select yearObj = new Select(year);
		yearObj.selectByValue("1989");
		
		
		
		
		driver.findElementById("firstname").sendKeys("Indumadhi");
		driver.findElementById("lastname").sendKeys("Mahalingam");
		driver.findElementById("company").sendKeys("academy");
		driver.findElementById("company").sendKeys("academy");
		
		driver.findElementById("address1").sendKeys("#10,Street ");
		driver.findElementById("address2").sendKeys("jhdgjdh");
		driver.findElementById("city").sendKeys("Pondy");
		
		
		WebElement state = driver.findElementById("id_state");
		Select stateObj = new Select(state);
		stateObj.selectByValue("4");
		
		driver.findElementById("postcode").sendKeys("56002");
		
		//WebElement country = driver.findElementById("uniform-id_country");
		//Select countryObj = new Select(country);
		//countryObj.selectByValue("1");
		
		driver.findElementById("other").sendKeys("Opp to school");
		driver.findElementById("phone").sendKeys("646546565");
		driver.findElementById("phone_mobile").sendKeys("646546565");
	
		
		driver.findElementById("alias").sendKeys("#878, hdkfj");
		
		driver.findElementById("submitAccount").click();
		
		
		String details = driver.findElementById("contact-link").getText();
		System.out.println(details);
	}

	}


