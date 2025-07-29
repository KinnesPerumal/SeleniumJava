package org.learn.pages;

import org.learn.seleniumBase.learnBase;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends learnBase{

	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	//	RemoteWebDriver driver =null;
	//locators

	public boolean getUserNameLabel(){
		return driver.findElement(By.xpath("//b[normalize-space(text())='Username']")).isDisplayed();
	}
	public boolean getPasswordLabel(){
		return driver.findElement(By.xpath("//b[normalize-space(text())='Password']")).isDisplayed();
	}

	//actions
	/** 
	 * @discription - get the data from user
	 * @param username - pas the user to be login
	 * @return 
	 */
	public LoginPage enterUserName(String username){
		driver.findElement(By.name("username")).sendKeys(username);
		return this;
	}

	public LoginPage enterPassword(String password){
		driver.findElement(By.name("password")).sendKeys(password);
		return this;
	}

	public DashBoardPage clickLogin(){
		driver.findElement(By.xpath("//input[@class='button']")).click();
		return new DashBoardPage();
	}

	public ForgotPasswordPage clickForgotPassword(){
		driver.findElement(By.xpath("(//div[@id='loginPanel']//a)[1]")).click();
		return new ForgotPasswordPage();
	}
	/**
	 * @description - this function is used to login into the bank application
	 * @param username
	 * @param password
	 */
	public void login(String username, String password) {
		enterUserName(username);
		enterPassword(password);
		clickLogin();

	}
}
