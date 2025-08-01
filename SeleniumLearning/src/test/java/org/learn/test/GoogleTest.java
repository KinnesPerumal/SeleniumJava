package org.learn.test;

import org.learn.seleniumBase.Browser;
import org.learn.seleniumBase.SeleniumBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends SeleniumBase{
	
	@Test
	void searchKinnes() throws InterruptedException {
		setUp(Browser.CHROME, "https://www.google.com/");
//		WebElement search = element("name", "q");
//			type(locators("name", "q"), "Kinnes", Keys.ENTER);
		Thread.sleep(3000);
		quit();
		
	}
}
