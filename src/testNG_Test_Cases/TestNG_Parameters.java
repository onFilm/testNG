package testNG_Test_Cases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TestNG_Parameters {
	
  @Test
  @Parameters({"a","b"})
  public void parameters(int a, int b) {
	 int result = a+b;
	 System.out.println("Sum of the "+a+" and "+b+" is : "+result); 
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
}

}
