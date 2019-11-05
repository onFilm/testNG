package testNG_Test_Cases;

import org.testng.Assert;
import org.testng.annotations.Test;
import appcodes.SomeClassToTest;

public class TestSomeClassToTestMethods {
	
	SomeClassToTest obj;
	
	public TestSomeClassToTestMethods() {
		// TODO Auto-generated constructor stub
		 obj= new SomeClassToTest();
	}
	
	@Test
	public void testSumOfTwoNumbers() {
		int result = obj.sumOfTwoNumbers(5, 10);
		System.out.println("The sum of 5 and 10 is :" + result);
		Assert.assertEquals(result, 15);
	}
	
	@Test
	public void testDivideByZeroWithTryCatch() {
		int result = obj.DivideByZeroOfTwoNumbersWithTryCatch(5, 0);
		System.out.println("The divide of 5 and 0 is [returns zero if you divide a number by zero]:" + result);
		Assert.assertEquals(result, 0);
	}

}
