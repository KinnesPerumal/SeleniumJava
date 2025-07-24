package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _17_Validations {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
//		driver.get("https://letcode.in/button");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		 * //Is Displayed element is visible or not WebElement btn1 =
		 * driver.findElement(By.id("home"));
		 * System.out.println("Home btn: "+btn1.isDisplayed());
		 * 
		 * //is Enabled - element is intractable
		 * driver.navigate().to("https://letcode.in/edit"); WebElement edit =
		 * driver.findElement(By.id("noEdit"));
		 * System.out.println("Is enabled or not: "+edit.isEnabled());
		 * driver.navigate().to("https://letcode.in/button"); WebElement btn =
		 * driver.findElement(By.id("isDisabled"));
		 * System.out.println("btn enabled or not: "+btn.isEnabled());
		 * 
		 * driver.navigate().to("https://semantic-ui.com/elements/button.html");
		 * WebElement disableBtn = driver.findElement(By.xpath(
		 * "//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[21]/button")); String
		 * attribute = disableBtn.getAttribute("class");
		 * System.out.println("it is enabled: "+attribute.contains("disabled"));
		 */

		//is Selected - radio or check box is selected or not
		driver.navigate().to("https://letcode.in/radio");
		WebElement ele = driver.findElement(By.xpath("(//label[@class='checkbox']//input)[1]"));
		System.out.println("checkbox selected or not: "+ele.isSelected());
		
		//check radio button
		WebElement eleBtn = driver.findElement(By.id("foo"));
		System.out.println("Radio btn check: "+eleBtn.isSelected());
		
		
		
//		driver.quit();
	}

}
