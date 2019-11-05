package base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Base Test Suite -> Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Base Test Suite -> Before Class");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("Base Test Suite -> After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Base Test Suite -> After Suite");
	}

}
