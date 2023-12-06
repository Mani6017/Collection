package testNGWithKoushit;

import org.testng.annotations.Test;

public class LearnAttributes2 {


	//Depends on method
	@Test()
	public void signUp() {
		System.out.println("sign up");  
	}
	@Test(dependsOnMethods = "signUp", priority = -1)
	public void logIn() {
		System.out.println("log in"); 
	}
	@Test(dependsOnMethods = "logIn")
	public void searchProduct() {
		System.out.println("search product");
	}

	@Test(/* dependsOnMethods = "searchProduct" */priority = 3)
	public void addToCart() {
		System.out.println("add to cart");
	}

	@Test(/* dependsOnMethods = "addToCart" */priority = 4)
	public void logOut() {
		System.out.println("log out");
	}



}
