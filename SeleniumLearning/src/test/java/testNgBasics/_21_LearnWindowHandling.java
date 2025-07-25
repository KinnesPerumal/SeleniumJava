package testNgBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _21_LearnWindowHandling {

	@Test
	public void windowHandling() {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://letcode.in/window");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(list.get(0));
		driver.close();
		Set<String> winHs= driver.getWindowHandles();
		list.clear();
		list.addAll(winHs);
		driver.switchTo().window(list.get(0));
		driver.navigate().to("https://letcode.in/window");
		driver.findElement(By.id("multi")).click();
		Set<String> mulWins = driver.getWindowHandles();
		
		List<String> mulList = new ArrayList<String>(mulWins);
		System.out.println(mulList.size());
		int n = mulList.size();
		for(int i=0;i<n;i++) {
			driver.switchTo().window(mulList.get(i));
			System.out.println(driver.getTitle());
		}
		driver.quit();
	

	}

	public static void main1(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://letcode.in/window");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("home")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println("First Window: "+windowHandle);
		Set<String> windowHandles= driver.getWindowHandles();
		System.out.println("All Windows: "+windowHandles);
		List<String> myList= new ArrayList<String>(windowHandles);	
		driver.switchTo().window(myList.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(myList.get(0));
		driver.close();
		Set<String> windoHandles2=driver.getWindowHandles();
		myList.clear();
		myList.addAll(windoHandles2);
		driver.switchTo().window(myList.get(0));
		System.out.println(driver.getCurrentUrl());

	}
}
