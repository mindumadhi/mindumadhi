package AutomationDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	RemoteWebDriver driver;

@Test

	public void browserLanch() {
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");

		//Launch URL
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.myntra.com/");
	
	//In searchbox , enter sunglasses and hit enter button

	driver.findElementByClassName("desktop-searchBar").sendKeys("Sunglass" + Keys.ENTER);


	
	//Select men in left side

	WebElement clickButton = driver.findElementByXPath("//input[@value='men,men women']");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	// for click
	jse.executeScript("arguments[0].click();", clickButton);
	 
	

	// type Polaroid in search box
	
			driver.findElementByClassName("filter-search-filterSearchBox").click();
			driver.findElementByClassName("filter-search-inputBox").sendKeys("Polaroid" + Keys.ENTER);
			
		//	driver.findElementByClassName("common-checkboxIndicator").click();
			
		WebElement clickButton2= driver.findElementByXPath("//div[@class='common-checkboxIndicator']");
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
			
         jse2.executeScript("arguments[0].click();", clickButton2);
			
			
			
	
	// Print rectangle product size
			
		String count = driver.findElement(By.xpath("//h4[@class='product-sizes']/..]")).getText();
			System.out.println(count);
			
			// click similar product
			
			driver.findElementByXPath("//div[@class='image-grid-similarColorsCta product-similarItemCta']").click();
			
	//driver.findElementByClassName("filter-search-filterSearchBox").click();
	//driver.findElementByClassName("filter-search-inputBox").sendKeys("Polaroid" + Keys.ENTER);

	
	
	

}
}
