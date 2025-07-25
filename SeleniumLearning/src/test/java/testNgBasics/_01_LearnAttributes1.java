package testNgBasics;

import org.testng.annotations.Test;

public class _01_LearnAttributes1 {

	@Test(priority = -1)
	public void singUp() {
		System.out.println("signUp");
	}
	@Test()//it convert 0 priority
	public void login() {
		System.out.println("login");
	}
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(priority = -5)
	public void signOut() {
		System.out.println("signOut");
	}
}
