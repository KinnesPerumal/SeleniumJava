package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils._01_DataUtils;

public class _08_LeanDataProvider {//extends _01_DataUtils we can use this way for 1 method

	@Test(dataProvider = "loginData", dataProviderClass = _01_DataUtils.class)//dirtly pass methodname for dataprovier name
	public void test(String data[]) throws InterruptedException {//inside parameter can use like, String data[]
		System.out.println(data[0]);
		System.out.println(data[1]);

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(data[0]);
		driver.findElement(By.id("password")).sendKeys(data[1]);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); 
		driver.quit();

	}


}
