package learn;

import org.openqa.selenium.chrome.ChromeDriver;

public class _01_LaunchChrome {

	public static void main(String[] args) {
		
		//Property set and driver path set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome
		ChromeDriver driver = new ChromeDriver();//it is constructor
		driver.close();
		

	}

}