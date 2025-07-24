package learn;

import org.openqa.selenium.firefox.FirefoxDriver;

public class _02_LaunchFirefox {

	public static void main(String[] args) {
		
		//Property set and driver path set
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		//opening Firefox
		FirefoxDriver driver = new FirefoxDriver();//it is constructor
		driver.close();		

	}

}