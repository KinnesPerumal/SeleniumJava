package org.learn.seleniumBase;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class learnBase {

	String URL = "https://parabank.parasoft.com/parabank/index.htm";

	protected RemoteWebDriver driver = null;
	@BeforeMethod
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);	
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();		
	}
}
