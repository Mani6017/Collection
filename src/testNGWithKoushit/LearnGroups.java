package testNGWithKoushit;

import org.testng.annotations.Test;

public class LearnGroups {
	  @Test(groups = {"smoke"})
      public void signUp() {
          System.out.println("sign up");  
      }
	  @Test(groups = {"reg"})
      public void logIn() {
		  System.out.println("log in"); 
      }
	  @Test(groups = {"sanity"})
      public void searchProduct() {
		  System.out.println("search product");
      }
	  @Test(groups = {"smoke"})
      public void addToCart() {
		  System.out.println("add to cart");
      }
	  @Test(groups = {"sanity"})
      public void logOut() {
		  System.out.println("log out");
      }
	
	
	
}
