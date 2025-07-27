package testNgBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _08_LeanDataProvider {
	@DataProvider(name = "loginData")
	public String[][] getData() {
		String [][] data = new String[2][2];
		data[0][0] = "student";
		data[0][1] = "Password123";
		data[1][0] = "student";
		data[1][1] = "Password123";
		return data;
		
	}
	@Test(dataProvider = "loginData")
	public void test(String uName, String Password) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
}
