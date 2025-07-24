package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class _25_LearnThrowVsThrows {

	public void code() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		_25_LearnThrowVsThrows lts = new _25_LearnThrowVsThrows();
//		lts.code();
		lts.test();
	}

	public void test() {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://letcode.in/window");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			driver.findElement(By.id("homse")).click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("Element no found");
			throw new RuntimeException();
		}
		driver.quit();
		
		
	}

}
