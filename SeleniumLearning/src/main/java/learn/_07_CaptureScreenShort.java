package learn;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class _07_CaptureScreenShort {

	public static void main(String[] args) throws IOException {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/button");
		//maximizing browser
		driver.manage().window().maximize();
		//taking screenshort full driver screen
		File fileSrc = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snaps/img1.png");
		FileHandler.copy(fileSrc, destination);
		//taking screenshort of a button or element
		WebElement ele = driver.findElement(By.id("color"));
		File eleSrc = ele.getScreenshotAs(OutputType.FILE);
		File eleDes = new File("./snaps/img2.png");
		FileHandler.copy(eleSrc, eleDes);
		//taking screenshort of a section
		WebElement selEle = driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div/div/div"));
		File selSrc = selEle.getScreenshotAs(OutputType.FILE);
		File selDes = new File("./snaps/img3.png");
		FileHandler.copy(selSrc, selDes);
		

	}

}