package learn;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _19_InteractWithActiveElement {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://www.facebook.com/");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("kns@gmail.com", Keys.TAB, "Password", Keys.ENTER);
		
	}

}
