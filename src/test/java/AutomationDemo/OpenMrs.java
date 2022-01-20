package AutomationDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMrs {
		RemoteWebDriver driver;
	
	@Test 
	public  void browserLanch() throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		
		// login - 
		//
		driver.findElementById("username").sendKeys("Admin");
		driver.findElementById("password").sendKeys("Admin123");
		driver.findElementById("Isolation Ward").click();
		driver.findElementByXPath("//input[@id='loginButton']").click();
		//click register a patient 
		driver.findElementByXPath("//a[@class='btn btn-default btn-lg button app big align-self-center'][3]").click();
		//first name/ last name
		driver.findElementByXPath("//input[@name='givenName']").sendKeys("Alex");
		driver.findElementByXPath("//input[@name='familyName']").sendKeys("Smith");
		driver.findElementById("next-button").click();
		driver.findElementByXPath("//option[@value='M']").click();
		driver.findElementByXPath("//button[@id='next-button']").click();
		
		driver.findElementByXPath("//input[@name='birthdateDay']").sendKeys("10");
		// select month
				WebElement month= driver.findElementByXPath("//Select[@id='birthdateMonth-field']");
				Select obj= new Select(month);
				obj.selectByValue("5");
				
	driver.findElementById("birthdateYear-field").sendKeys("1975");
	driver.findElementById("next-button").click();
	
	driver.findElementById("address1").sendKeys("33 fake st");
	driver.findElementById("address2").sendKeys("xy nagar");
	driver.findElementById("cityVillage").sendKeys("Chennai");
	driver.findElementById("stateProvince").sendKeys("Tamil Nadu");
	driver.findElementById("country").sendKeys("India");
	driver.findElementById("postalCode").sendKeys("600001");
	driver.findElementById("next-button").click();
	
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9863534652");
	
	driver.findElementById("next-button").click();

	WebElement relationship= driver.findElementByXPath("//select[@id='relationship_type']");
	Select obj1= new Select(relationship);
	obj1.selectByValue("8d91a210-c2cc-11de-8d13-0010c6dffd0f-A");

	driver.findElementByXPath("//input[@placeholder='Person Name']").sendKeys("Pearson"); 
	driver.findElementById("next-button").click();
driver.findElementById("submit").click();

//// got  to home 

driver.findElementByXPath("//i[@class='icon-home small']").click();

// find patient search


driver.findElementByXPath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']").click();
driver.findElementById("patient-search").sendKeys("alex");

File PatientRecord= driver.getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(PatientRecord, new File ("./snapshot/screenshot2.jpeg"));

System.out.println("screenshot 2 taken");

driver.close();

		
	}
	
	@Test
	
	public void UpdateRecord() {
	// browser
	WebDriverManager.chromedriver().setup();
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	driver = new ChromeDriver();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	//login
	driver.findElementById("username").sendKeys("Admin");
	driver.findElementById("password").sendKeys("Admin123");
	driver.findElementById("Isolation Ward").click();
	driver.findElementByXPath("//input[@id='loginButton']").click();
	// find patient search
	
	driver.findElementByXPath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']").click();
	driver.findElementById("patient-search").sendKeys("100J35"+ Keys.ENTER);
	driver.findElementByXPath("//div[contains(@class,'gender-age col-auto')]//span[@id='edit-patient-demographics']").click();
	
	driver.findElementByXPath("//input[@name='middleName']").sendKeys("M");
	driver.findElementById("next-button").click();
	driver.findElementById("next-button").click();
    driver.findElementByXPath("//input[@id='birthdateDay-field']").clear();
	driver.findElementByXPath("//input[@id='birthdateDay-field']").sendKeys("12");
	driver.findElementById("next-button").click();
	driver.findElementById("registration-submit").click();
	
	
	
	
	
	driver.close();
	
}
	@Test
	
	public void DeleteRecord() {
		
		// browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		//login
		driver.findElementById("username").sendKeys("Admin");
		driver.findElementById("password").sendKeys("Admin123");
		driver.findElementById("Isolation Ward").click();
		driver.findElementByXPath("//input[@id='loginButton']").click();
		
		// find patient search
		
		driver.findElementByXPath("//a[@id='coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension']").click();
		driver.findElementById("patient-search").sendKeys("100J35"+ Keys.ENTER);
		driver.findElementByXPath("(//div[@class='col-11 col-lg-10'])[17]").click();
		driver.findElementById("delete-reason").sendKeys("Patient moved to other section");
		driver.findElementByXPath("(//button[@class='confirm right'])[6]").click();
	}
	
}


	
		
		