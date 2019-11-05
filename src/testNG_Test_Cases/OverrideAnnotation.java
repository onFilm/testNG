package testNG_Test_Cases;

import base.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OverrideAnnotation extends BaseTest {
	
	@Test
	public void test() {
		
		System.out.println("This is test");
		
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite --> OverrideAnnotation");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class --> OverrideAnnotation");
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
		System.out.println("After Class --> OverrideAnnotation");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite --> OverrideAnnotation");
	}


}
