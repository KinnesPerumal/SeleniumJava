package org.learn.test;

import org.learn.seleniumBase.Locators;
import org.learn.seleniumBase.SeleniumBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends SeleniumBase {
	
	@BeforeMethod
	void lauch() {
		setUp("https://practice.expandtesting.com/login");
	}

	@AfterMethod
	void closingbrowser() {
		quit();
	}
	@Test
	 void login(){
		type(element(Locators.id, "userna"),"practice");
		type(element(Locators.id, "password"), "SuperSecretPassword!");
		click(element(Locators.xpath, "//button[text()='Login']"));
		System.out.println("Test Completed");
		
		
	}
}
