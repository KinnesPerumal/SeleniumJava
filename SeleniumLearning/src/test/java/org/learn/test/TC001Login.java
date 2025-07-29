package org.learn.test;

import org.learn.pages.LoginPage;
import org.learn.seleniumBase.learnBase;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001Login extends learnBase{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001";
	}

	@Test(dataProvider = "data")
	public void loginTest(String[] data){//string us, string pass
		/*
		 * LoginPage lp = new LoginPage(); lp.enterPassword(null);
		 * lp.enterPassword(null);
		 */
		
		LoginPage lp = new LoginPage(driver);
		boolean usernameLabel = lp.getUserNameLabel();
		Assert.assertEquals(usernameLabel, true);
		boolean passwordLabel = lp.getPasswordLabel();
		Assert.assertTrue(passwordLabel);
		
		
		new LoginPage(driver)
		.enterUserName(data[0])
		.enterPassword(data[1])
		.clickLogin();
	}
}
