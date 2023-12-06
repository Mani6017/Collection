package practiceTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_SoftAsserts {
// @Test
// public void hardAssertMethod() {
//	 System.out.println("\nRunning Test -> testSum");
//	 int result = SumNumbers(1,2);
//	 Assert.assertEquals(result, 2);
//	 System.out.println("\nLine after assert 1");
//	 Assert.assertEquals(result, 3);
//	 System.out.println("\nLine after assert 2");
// }
	
	
 @Test
 public void softAssertMethod() {
	 SoftAssert sa = new SoftAssert();
	 
	 Reporter.log("Running test using soft assert ", true);
	 System.out.println("\nRunning Test -> testSum");
	 int result = SumNumbers(1,2);
	 sa.assertEquals(result, 2);
	 System.out.println("\nLine after assert 1");
	 sa.assertEquals(result, 3);
	 System.out.println("\nLine after assert 2");
 }

private static int SumNumbers(int i, int j) {
	// TODO Auto-generated method stub
	return i+j;
}

	


	
	
}
