package learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_HandleButtons {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://letcode.in/button");
		//maximizing browser
		driver.manage().window().maximize();
		//get the X and Y cordinates	
//		driver.findElementById("position").getLocation();
		WebElement ele = driver.findElement(By.id("position"));
		Point point = ele.getLocation();//it is retun pointers
		int x = point.getX();
		int y = point.getY();
		System.out.println("x = > "+x+" y = > "+y);
		
		//find the color of the button
		WebElement btnColor = driver.findElement(By.id("color"));
		String color = btnColor.getCssValue("background-color");
		System.out.println("Background clr : "+color);
		
		//find the height & width of the button
		Rectangle rect = driver.findElement(By.id("property")).getRect();
		System.out.println("button width: "+rect.getWidth());
		System.out.println("button height: "+rect.getHeight());
		System.out.println("button point: "+rect.getPoint());
		Dimension dime = rect.getDimension();
		System.out.println("button width: "+dime.getWidth());
		System.out.println("button height: "+dime.getHeight()); 
		
		//confirm button is disable
		boolean isDisabled =   driver.findElement(By.id("isDisabled")).isEnabled();
		System.out.println(isDisabled);
		
		
		
		
		

	}

}
