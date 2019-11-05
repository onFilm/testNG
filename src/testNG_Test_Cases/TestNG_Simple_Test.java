package testNG_Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Simple_Test {
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
}
