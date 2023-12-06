
package practiceTestNG;

import org.junit.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGITestResultDemo {
// checking previous execution of method
	@Test
	public void testMethod1() {
		System.out.println("Running ----testMethod1");
		Assert.assertTrue(false);
	}
	@Test
	public void testMethod2() {
		System.out.println("Running ----testMethod2");
		Assert.assertTrue(true);

	}
	
	
	// Listener
	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		
	
		if(testResult.getStatus() == ITestResult.FAILURE) {
		System.out.println("Failed result " + testResult.getName());
	}
	if(testResult.getStatus() == ITestResult.SUCCESS) {
	System.out.println("[passed result " + testResult.getName());
	}
	}
}

