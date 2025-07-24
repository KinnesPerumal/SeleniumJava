package learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _15_HandleDropDown {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/dropdowns");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//select by visible text//single dropdown
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select myFruit = new Select(fruits);
		myFruit.selectByVisibleText("Orange");
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-dropdown/section/div/div/div[1]/div/div/div[1]/div/div[2]/div/p")).getText());
		List<WebElement> allFruits = myFruit.getOptions();
		for(WebElement f:allFruits) {
			System.out.println(f.getText());
		}
		
		//select a option then print selected value
		WebElement country = driver.findElement(By.id("country"));
		Select myCountry = new Select(country);
		myCountry.selectByValue("India");
		System.out.println(myCountry.getFirstSelectedOption().getText());

		//select multiple dropdown
		WebElement superHeros = driver.findElement(By.id("superheros"));
		Select myHero = new Select(superHeros);
		System.out.println("Is Multiple: "+myHero.isMultiple());
		myHero.selectByValue("ta");
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-dropdown/section/div/div/div[1]/div/div/div[2]/div/div[2]/div/p")).getText());
		myHero.selectByIndex(3);
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/app-dropdown/section/div/div/div[1]/div/div/div[2]/div/div[2]/div/p")).getText());
		List<WebElement> allHeros = myHero.getAllSelectedOptions();
		for(WebElement el:allHeros) {
			System.out.println(el.getText());
		}
//		myHero.deselectByValue("bt"); is used only multiple select
	}

}
