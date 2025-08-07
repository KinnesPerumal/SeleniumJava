package org.learn.seleniumBase;

import org.openqa.selenium.WebElement;

public interface SeleniumAPI {
	
	/**
	 * This will launch the chrome browse with the given URL
	 * @author kinnes
	 * @param url
	 * @exception NullPointerException
	 */
	void setUp(String url);
	
	/**
	 * Tis method will launch the given browser with given URL
	 * @author kinnes
	 * @param url
	 * @param browserName
	 */
	void setUp(Browser browserName, String url);
	
	/**
	 * this function is close the activate browser
	 * @author kinnes
	 */
	void close();
	
	/**
	 * This function is quit the driver instance
	 * @author kinnes
	 */
	
	void quit();
	
	/**
	 * This Method is used to find any weblement with in the page
	 * @param type - element type Eg: Id, Name or Linktest
	 * @param value - element value
	 * @return Webelement
	 */
	WebElement element(Locators type, String value);
	
	/**
	 * This methos is used to swith to multiple widow
	 * @param i - window index
	 */
	void switchToWindow(int i);
	
	/**
	 * This methos is used to select dropdown with given values
	 * @author kinnes
	 * @param ele
	 * @param value
	 */
	void selectValue(WebElement ele, String value);
	
	/**
	 * This methos is used to select dropdwon with the given text
	 * @author kinnes
	 * @param ele
	 * @param text
	 */
	void selectText(WebElement ele, String text);
	
	/**
	 * This methos is used to select dropdown with the given index
	 * @param ele
	 * @param position
	 */
	void selectIndex(WebElement ele, int position);
	
	/**
	 * This function will wait until the element is clickable and then click
	 * @param ele
	 */
	
	void click(WebElement ele);
	
	/**
	 * This function will wait until the element is ready and clear the exisitng and pass values
	 * @param ele
	 */
	
	void type(WebElement ele, String testData);
	
	/**
	 * This function will wait until the element is ready and gets the input
	 * @param ele
	 * @param Testdata
	 */
	
	void appendText(WebElement ele, String testData);
	
	/**
	 * This funciton retrun the active page title
	 * @return
	 */
	
	String getTitle();
	
	/**
	 * This function return the active page URL
	 * @return String
	 */
	
	String getURL();
	
	/**
	 * This function retrun the element is visible or not
	 * @return
	 */
	
	boolean isDisplayed(WebElement ele);
	
	
}
