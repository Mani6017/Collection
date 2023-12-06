package testNGWithKoushit;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnAttributes3 {
	  @Test(description = "this is used to sign up")
      public void signUp() {
          System.out.println("sign up");  
      }
	  @Test()
      public void logIn() {
		  System.out.println("log in");
		  throw new NoSuchElementException("no succh element");
      }
	  @Test(dependsOnMethods = "testNGWithKoushit.LearnAttributes3.logIn", alwaysRun = true)
      public void searchProduct() {
		  System.out.println("search product");
      }
	  
	
	
	
}
