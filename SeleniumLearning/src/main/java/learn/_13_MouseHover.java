package learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _13_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening chrome driver
		ChromeDriver driver = new ChromeDriver();
		//open url
		driver.get("https://www.flipkart.com/goat-sale-is-live-at-store?fm=neo%2Fmerchandising&iid=M_b53fb894-580d-403d-867e-3766d08b865b_1_VMDN1VE1AUK9_MC.D7M05PTZUYRA&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Top%2BOffers_D7M05PTZUYRA&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=D7M05PTZUYRA");
		//maximizing browse
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/a[2]")).click();
	}

}
