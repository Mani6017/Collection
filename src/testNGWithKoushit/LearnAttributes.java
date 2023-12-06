package testNGWithKoushit;

import org.testng.annotations.Test;

public class LearnAttributes {
	// if we use minus it will come like a graph sequence..
	  @Test(priority = -1)
      public void signUp() {
          System.out.println("sign up");  
      }
	  @Test(priority = 2)
      public void logIn() {
		  System.out.println("log in"); 
      }
	  @Test(priority = 3)
      public void searchProduct() {
		  System.out.println("search product");
      }
	  @Test(priority = 4)
      public void addToCart() {
		  System.out.println("add to cart");
      }
	  @Test(priority = -5)
      public void logOut() {
		  System.out.println("log out");
      }
	
	
	
}
