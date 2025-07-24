package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _12_DargAndDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://jqueryui.com/draggable/");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("draggable"));
		Actions builder = new Actions(driver);
		int x = element.getLocation().getX();
		int y = element.getLocation().getY();
		builder.dragAndDropBy(element, x+50, y+90).perform();
	}

}
