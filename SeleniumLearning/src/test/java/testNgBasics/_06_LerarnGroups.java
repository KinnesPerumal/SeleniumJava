package testNgBasics;

import org.testng.annotations.Test;

public class _06_LerarnGroups {
	
	@Test(groups = {"smoke"})
	public void singUp() {
		System.out.println("signUp");
	}
	@Test(groups = {"reg"})//it convert 0 priority
	public void login() {
		System.out.println("login");
	}
	@Test(groups = {"sanity"})
	public void searchProduct() {
		System.out.println("searchProduct");
	}
	@Test(groups = {"smoke"})
	public void addToCart() {
		System.out.println("addToCart");
	}
	@Test(groups = {"reg"})
	public void signOut() {
		System.out.println("signOut");
	}
}
