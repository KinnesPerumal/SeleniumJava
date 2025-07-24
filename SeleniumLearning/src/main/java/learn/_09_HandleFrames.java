package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/frame");
		//maximizing browser
		driver.manage().window().maximize();
		//switch to the frame
		WebElement firstFrame = driver.findElement(By.xpath("//*[@id=\"firstFr\"]"));
		driver.switchTo().frame(firstFrame);
		driver.findElement(By.name("fname")).sendKeys("Kinnes");
		driver.findElement(By.name("lname")).sendKeys("Perumal");
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("kns.009@gmail.com");
		//parent frame
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String txt = driver.findElement(By.xpath("/html/body/app-root/app-frame/section/div/div/div[2]/app-learning-point/div/div[1]/div/span")).getText();
		System.out.println("Parent frame text: "+txt);

	}

}
