package org.learn.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		
		//Blank Html
		ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		//report
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest test = extent.createTest("TC001 - Search Product");
		test.assignAuthor("Kinnes");
		test.assignCategory("Smoke");
		test.pass("Enter the product Name");
		test.pass("Check if the product is listed");
		test.pass("Add Product to cart");
		
		ExtentTest test2 = extent.createTest("TC001 - Payment");
		test2.pass("Navigate to Payment Page");
		test2.fail("Payment Failed",
				MediaEntityBuilder
				.createScreenCaptureFromPath("./snaps/img1.png")
				.build()
				);
		
		//save the test - Lastly call 
		extent.flush();
		
		

	}

}
