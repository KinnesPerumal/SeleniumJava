package lean.properties.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * Properties properties = new Properties(); properties.load(new
		 * FileInputStream("./SelFrench.properties")); String prop =
		 * properties.getProperty("Welcome"); System.out.println(prop);
		 */
		
		Properties properties = new Properties();
		properties.load(new FileInputStream("./locators.properties"));
		System.setProperty("webdriver.chrome.driver", "./Drivers/Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get(properties.getProperty("URL"));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(properties.getProperty("userName"));
		driver.findElement(By.id("password")).sendKeys(properties.getProperty("password"));
		driver.findElement(By.id("submit")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1")).getText());
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}
}
