package testNG_Test_Cases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestNG_ITestResult {
  @Test
  public void testLogin() {
	  System.out.println("Testing the user Login function.");
	  Assert.assertTrue(true);
  }
  
  @Test
  public void testDashboard() {
	  System.out.println("Testing the user Dashboard section.");
	  Assert.assertTrue(false);
  }
  
  @Test
  public void testProfile() {
	  System.out.println("Testing the user Profile section.");
	  Assert.assertTrue(true);
  }
  
  @AfterMethod
  public void afterMethod(ITestResult testResult) {
	  if(testResult.getStatus() == testResult.FAILURE) {
		  System.out.println("Failed : " + testResult.getMethod().getMethodName());
	  }
	  
	  if(testResult.getStatus() == testResult.SUCCESS) {
		  System.out.println("Success : " + testResult.getName());
	  }
  }

}
