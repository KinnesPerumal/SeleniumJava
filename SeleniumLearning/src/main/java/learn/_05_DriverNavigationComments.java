package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_DriverNavigationComments {

	public static void main(String[] args) throws InterruptedException {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/button");
		//maximizing browser
		driver.manage().window().maximize();
		//get url
		String url=driver.getCurrentUrl();
		System.out.println("Button page URL: "+url);
		//click go to home
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Goto Home']")).click();
		//home url
		String homeUrl=driver.getCurrentUrl();
		System.out.println("Home page URL: "+homeUrl);
		//navigate to back page
		Thread.sleep(3000);
		driver.navigate().back();
		System.out.println("Return to buttons page: "+driver.getCurrentUrl());
		//refresh the page
		driver.navigate().refresh();
		System.out.println("Refreshed");
		//go to next url
		driver.navigate().to("https://letcode.in/");
		System.out.println("Home page");
		
//		Navigation nav = driver.navigate();
//		nav.back();
//		nav.forward();
//		nav.refresh();
//		nav.to(homeUrl);//passing url

	}

}
