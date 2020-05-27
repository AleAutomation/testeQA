package amedigital.testweb.core;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	@Before
	public WebDriver getDriver() {
		if(driver == null) {
			createDriver();
		}
		return driver;
	}

	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void killDriver() {
		if(driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
