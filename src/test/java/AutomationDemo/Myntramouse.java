
package AutomationDemo;


import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.interactions.Actions;

public class Myntramouse {
	RemoteWebDriver driver;
	
	@Test
	public void browserLanch() {
	
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com//");

		// ChromeOptions opt = new ChromeOptions();
		// opt.addArguments("--disable-notifications");
		// RemoteWebDriver driver = new ChromeDriver(opt);

		// WebDriverManagerException.chromedriver().setup();

		// RemoteWebDriver driver = new ChromeDriver();
		// WebDriverManager.chromedriver().setup();

		driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglasses"+Keys.ENTER ) ;
		
		driver.findElementByClassName("common-radioIndicator").click();

			driver.findElementByClassName("myntraweb-sprite filter-search-iconSearch sprites-search").sendKeys("polaroid");

	}

}
