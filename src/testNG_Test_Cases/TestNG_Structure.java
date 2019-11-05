package testNG_Test_Cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Structure {

	//Hierarchy 

	/*
	 * Suite
	 * 		Test
	 * 			Class
	 * 				Method
	 * 
	 */

	//Execution priority

	/*
	 * Before Suite
	 * 		Before Test
	 * 			Before Class
	 * 				Before Method
	 * 					@Test   - Test Case 1
	 * 				After Method
	 * 				Before Method
	 * 					@Test	-	Test Case 2
	 * 				After Method
	 * 					....
	 *  			Before Method
	 * 					@Test  -  Nth Test
	 * 				After Method
	 * 			After Class
	 * 		After Test
	 * After Suite
	 * 
	 */

	@Test
	public void testcase () {
		System.out.println("This is a test case");
	}


	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Test Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Test Method");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
