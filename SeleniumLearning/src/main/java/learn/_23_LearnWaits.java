package learn;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _23_LearnWaits {

	public static void main(String[] args) {
		//property set
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//opening ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		//open Url
		driver.get("https://www.flipkart.com/ajy/~cs-7d5gd723be/pr?sid=ajy&collection-tab-name=BBD+2024+Noise+Smartwatches&pageCriteria=default&param=5781&hpid=Y8tEWNmThOXtFwc8qea15Kp7_Hsxr70nj65vMAAFKlc%3D&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InZhbHVlQ2FsbG91dCI6eyJtdWx0aVZhbHVlZEF0dHJpYnV0ZSI6eyJrZXkiOiJ2YWx1ZUNhbGxvdXQiLCJpbmZlcmVuY2VUeXBlIjoiVkFMVUVfQ0FMTE9VVCIsInZhbHVlcyI6WyJGcm9tIOKCuTEsMDk5Il0sInZhbHVlVHlwZSI6Ik1VTFRJX1ZBTFVFRCJ9fSwiaGVyb1BpZCI6eyJzaW5nbGVWYWx1ZUF0dHJpYnV0ZSI6eyJrZXkiOiJoZXJvUGlkIiwiaW5mZXJlbmNlVHlwZSI6IlBJRCIsInZhbHVlIjoiU01XR0VIN1YzTlJHVlBROSIsInZhbHVlVHlwZSI6IlNJTkdMRV9WQUxVRUQifX0sInRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIk5vaXNlIFNtYXJ0d2F0Y2hlcyJdLCJ2YWx1ZVR5cGUiOiJNVUxUSV9WQUxVRUQifX19fX0%3D");
		//maximizing browse
		driver.manage().window().maximize();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*//Explicit Wait
		 * driver.findElement(By.id("accept")).click(); WebDriverWait wait = new
		 * WebDriverWait(driver, Duration.ofSeconds(30)); Alert until =
		 * wait.until(ExpectedConditions.alertIsPresent());
		 * System.out.println(until.getText()); until.accept();
		 * 
		 * // driver.switchTo().alert().accept();
		 */		
		//Invisibility
//		wait.until(ExpectedConditions.visibilityOf(null));//inside null give webelement
//		wait.until(ExpectedConditions.invisibilityOf(null));i//nside null give webelement
		System.out.println(driver.getTitle());
		driver.findElement(By.className("W5mR4e")).click();
		
		
		
		driver.quit();

	}

}
