package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _16_GetTextAndGetAttribute {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/edit");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//get text
		String txt = driver.findElement(By.tagName("h1")).getText();
		System.out.println(txt);
		
		WebElement texts = driver.findElement(By.xpath("/html/body/app-root/app-edit/section/div/div/div[1]/div/div"));
		System.out.println(texts.getText());
		//get attribute
		WebElement attribute = driver.findElement(By.id("join"));
		System.out.println(attribute.getAttribute("value"));

		System.out.println(attribute.getAttribute("id"));
		
		String attribute2 = driver.findElement(By.id("fullName")).getAttribute("placeholder");
		System.out.println(attribute2);
		
		driver.close();
		driver.quit();	
	}

}
