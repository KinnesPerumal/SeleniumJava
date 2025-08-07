package org.learn.seleniumBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Return;

public class SeleniumBase implements SeleniumAPI {

	int durations = 60;
	int maxWaitTime = 10;
	RemoteWebDriver driver = null;
	WebDriverWait wait = null;

	public void setUp(String url) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(durations));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

	}

	public void setUp(Browser browserName, String url) {
		switch (browserName) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case EDGE:
			System.setProperty("webdriver.edge.driver", "./Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.err.println("driver not setup");
			break;
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(durations));
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(maxWaitTime));

	}

	public void close() {
		driver.close();

	}

	public void quit() {
		driver.quit();

	}

	public WebElement element(Locators type, String value) {
		switch (type) {
		case id:
			return driver.findElement(By.id(value));
		case name:
			return driver.findElement(By.name(value));
		case xpath:
			return driver.findElement(By.xpath(value));
		case link:
			return driver.findElement(By.linkText(value));

		default:
			break;
		}
		return null;
	}

	public void switchToWindow(int i) {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(i));
	}

	public void selectValue(WebElement ele, String value) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByValue(value);

	}

	public void selectText(WebElement ele, String text) {
		WebElement element = isElementVisible(ele);
		new Select(element).deselectByVisibleText(text);
	}

	public void selectIndex(WebElement ele, int position) {
		WebElement element = isElementVisible(ele);
		new Select(element).selectByIndex(position);
	}

	public void click(WebElement ele) {
		WebElement element = wait.withMessage("Element is not clickable")
				.until(ExpectedConditions.elementToBeClickable(ele));
		element.click();

	}

	public void type(WebElement ele, String testData) {
		WebElement element = isElementVisible(ele); // ctrl+2+M
		element.clear();
		element.sendKeys(testData);
	}

	// Method for explicit wait
	private WebElement isElementVisible(WebElement ele) {
		WebElement element = wait.withMessage("Element is not Visible").until(ExpectedConditions.visibilityOf(ele));
		return element;
	}

	public void type(WebElement ele, String testData, Keys keys) {
		WebElement element = isElementVisible(ele);
		element.clear();
		element.sendKeys(testData, keys);
	}

	public void appendText(WebElement ele, String testData) {
		WebElement element = isElementVisible(ele);
		element.sendKeys(testData);

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public String getURL() {
		return driver.getCurrentUrl();
	}

	public boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}

}
