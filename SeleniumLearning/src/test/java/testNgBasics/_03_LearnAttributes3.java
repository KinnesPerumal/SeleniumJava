package testNgBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _03_LearnAttributes3 {

	@Test(invocationCount = 3, invocationTimeOut = 15000 )
	public void main() {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://en.wikipedia.org/wiki/Facebook");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Crickets=driver.findElements(By.xpath("//*[contains(text(),'facebook') or contains(text(),'Facebook')]"));
		System.out.println(Crickets.size());
		driver.quit();

	}

}
