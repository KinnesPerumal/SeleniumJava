package learn;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_LoginTest {

	public static void main(String[] args) {
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening the chromeDriver
		ChromeDriver driver = new ChromeDriver();
		//load the Url
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//click login button
		driver.findElement(By.linkText("Log in")).click();
		//enter email id
		driver.findElement(By.name("email")).sendKeys("kinnesperumal09@gmail.com");
		//enter pass
		driver.findElement(By.name("password")).sendKeys("K@Kinnes009");
		//click login
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
		

	}

}