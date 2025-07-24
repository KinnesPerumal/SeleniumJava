package learn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _22_LearnWebTable {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://letcode.in/table");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table = driver.findElement(By.id("simpletable"));
		List<WebElement> headers= table.findElements(By.tagName("th"));
		for (WebElement header : headers) {
			System.out.println(header.getText());
		}
		List<WebElement> allRows = table.findElements(By.cssSelector("tbody tr"));
		int size = allRows.size();
		System.out.println(size);
		/*
		 * for(WebElement row:allRows) { List<WebElement> tableDatas =
		 * row.findElements(By.tagName("td")); WebElement firstColumn =
		 * tableDatas.get(0); System.out.println(firstColumn.getText()); }
		 */
		for(int i=0;i<size;i++) {
			List<WebElement> rows= allRows.get(i).findElements(By.tagName("td"));
			WebElement lastname =rows.get(1);
			String text = lastname.getText();
			System.out.println(text);
			if(text.equals("Man")) {
				rows.get(3).findElement(By.tagName("input")).click();
				break;
			}
			
		}
		
		
//		driver.quit();
		
	}

}
