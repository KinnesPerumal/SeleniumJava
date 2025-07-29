package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_HandlingInputs {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/edit");
		//maximizing browser
		driver.manage().window().maximize();
		//enter full name
//		driver.findElement(By.id("fullName")).sendKeys("Kinnes");
//		//append a text
//		driver.findElement(By.id("join")).sendKeys(" Person",Keys.TAB);//it is appending
//		//get a text
//		String myValue =  driver.findElement(By.id("getMe")).getAttribute("value");
//		System.out.println(myValue);
//		//clear the text
//		driver.findElement(By.id("clearMe")).clear();
//		//confirm the edit field is disable
//		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
//		System.out.println(isEdit);
//		//confirm text is read only
//		String isReadOnly= driver.findElement(By.id("dontwrite")).getAttribute("readonly");
//		System.out.println(isReadOnly);
//		//quite browser
////		driver.quit();

	}

}