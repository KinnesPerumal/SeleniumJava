package org.learn.utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends Report{
	
	@BeforeTest
	void setData() {
		description="first test";
		author = "Kinnes";
		catogery = "Reg";
		
	}
	
	@Test
	void myTest() {
		System.out.println("Test Begins");
		stepReport("pass", "Some Description");;
		System.out.println("Test ends");
	}
}
