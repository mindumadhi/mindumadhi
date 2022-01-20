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

public class Snapdeal {
	RemoteWebDriver driver;

	@Test

	public void browserLanch() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		RemoteWebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com//");

		// Goto All Offers- Use Action
		Actions actionObj = new Actions(driver);
		WebElement Alloffers = driver.findElementByClassName("catText");
		actionObj.moveToElement(Alloffers).perform();

		// to Select Fast Track
		WebElement FastTrack = driver.findElementByXPath("//span[text()='Fastrack']");
		actionObj.moveToElement(FastTrack).click().build().perform();

		// Select watches for Women

		WebElement womenWatch = driver.findElementByXPath("//div[text()='Watches For Women']");
		actionObj.moveToElement(womenWatch).click().build().perform();
		
		
		
		
		// driver.findElementByXPath("// input[text()='Search by Brand']").click();

		// click brand
		
		WebElement search = driver.findElementByXPath("//i[@class='sd-icon sd-icon-search-under-catagory search-icon']");
		actionObj.moveToElement(search).sendKeys("Redux").build().perform();
		
		driver.findElementByXPath("//label[@for='Brand-Redux']").click();
		
		
		// driver.findElementByClassName("sd-input js-searchable-box").click();
		//WebElement search = driver.findElementByXPath("//input[@placeholder='Search by Brand']").click();

		// driver.findElementByClassName("linkTest").click();

		// WebElement submitClick = driver.findElementById("category1Data");
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		// jse.executeScript("arguments[0].click();", submitClick);
		// driver.findElementByClassName("linkTest").click();

		// click Fast Track

	}
}
