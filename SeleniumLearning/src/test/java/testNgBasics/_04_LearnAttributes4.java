package testNgBasics;

import org.testng.annotations.Test;

public class _04_LearnAttributes4 {

	@Test(priority = 1)
	public void signUp() {
		System.out.println("signUp");
	}
	@Test()
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("searchProduct");
	}
}
