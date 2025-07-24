package learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/alert");
		//maximizing browser
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.id("accept")).click();
		Alert alert =  driver.switchTo().alert();
		String simpleText = alert.getText();
		System.out.println("Simple alert Text: "+simpleText);
		alert.accept();
		//confirm alert
		driver.findElement(By.id("confirm")).click();
		String CAlrtTxt= alert.getText();
		System.out.println("Confirm alert Text: "+CAlrtTxt);
		alert.dismiss();
		//prompt alert
		driver.findElement(By.id("prompt")).click();
		alert.sendKeys("Kinnes");
		System.out.println(alert.getText());
		alert.accept();
		String promptTxt=driver.findElement(By.id("myName")).getText();
		System.out.println(promptTxt);
	}

}