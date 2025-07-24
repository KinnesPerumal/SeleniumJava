package learn;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _14_RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://practice.expandtesting.com/context-menu#google_vignette");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Right Click
		WebElement ele = driver.findElement(By.id("hot-spot"));
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}

}
