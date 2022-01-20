package AutomationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OceanAcademy {
	RemoteWebDriver driver;
	
	@Test
	public void actionClassDemo() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://oceanacademy.in/");

		
			
		//Action Class 
		

		Actions actionObj = new Actions(driver);
		
		WebElement courses = driver.findElementById("cour");
		actionObj.moveToElement(courses).perform();
		

		
		WebElement SpecificCourse = driver.findElementByXPath("//ul[@id='dview']/li[3]/a");
		actionObj.moveToElement(SpecificCourse).click().build().perform();
			
	}
	
	private void launchurl(String string) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void alertsDemo() throws InterruptedException {
		launchurl("https://oceanacademy.in/");

		driver.findElementByXPath("(//i[contains(@class,'fa fa-phone')])[1]/..").click();
		
		Thread.sleep(5000);
				
		WebElement submitBUtton = driver.findElementByXPath("//button[text()='submit']");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//for click
		jse.executeScript("arguments[0].click();", submitBUtton);
		
		//for page scrolldown
		jse.executeScript("arguments[0]. scrollIntoView(true);", submitBUtton);
			
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		
	}


}
