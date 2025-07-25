package testNgBasics;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class _04_LearnAttributes4 {

	@Test(enabled = false, alwaysRun = true)
	public void signUp() {
		System.out.println("signUp");
	}
	@Test(description = "Login sucessfully")
	public void login() {
		System.out.println("login");
		throw new NoSuchElementException();
	}
	@Test(dependsOnMethods = "login", alwaysRun = true)
	public void searchProduct() {
		System.out.println("searchProduct");
	}
}
