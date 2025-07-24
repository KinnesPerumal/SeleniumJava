package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _11_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.id("div1"));
		WebElement target = driver.findElement(By.id("div2"));
		//we can use action constructor for drag and drop
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
	}

}
