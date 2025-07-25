package testNgBasics;

import org.testng.annotations.Test;

public class _02_LearnAttributes2 {

	@Test(priority = 1)
	public void signUp() {//signup is independent so it is run first
		System.out.println("signUp");
	}
	@Test(dependsOnMethods = "signUp")
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "login", priority = -1)
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("addToCart");
		throw new RuntimeException();
	}
	@Test(dependsOnMethods = "addToCart")
	public void signOut() {
		System.out.println("signOut");
	}
}
