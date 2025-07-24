package learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _20_LearnFindElements {

	public static void main(String[] args) {
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

	}

	public static void main1(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://letcode.in/edit");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> lables = driver.findElements(By.tagName("label"));
		WebElement lastelement = lables.get(lables.size()-1);
		System.out.println("LastElement: "+lastelement.getText());
		int size = lables.size();
		if(size==6) {
			System.out.println("Test Case Passed");
		}else {
			System.out.println("Test Case Failed");
		}
		for (WebElement lable : lables) {
			System.out.println(lable.getText());
		}
		driver.quit();



	}

}
