package AutomationDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class redbus {

@Test

public void busSearch() {
	
		//Browser Launch 
		System.setProperty("webdriver.chrome.driver", "D:/Chrome/chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElementById("src").sendKeys("Chennai");
		driver.findElementById("dest").sendKeys("Bangalore");
		driver.findElementById("onward_cal").click();
		driver.findElementByClassName("next").click();
		driver.findElementByXPath("(//td[@class='wd day'])[2]").click();	
	//	driver.findElementByClassName("fl button").click();
		driver.findElementById("search_btn").click();
		
		
		//td
		//driver.findElementById("dest").sendKeys("Bangalore");
		
		
	
		//driver.findElementByClassName("next").click();
	
		
		
		
		
		
		
		
}
}
