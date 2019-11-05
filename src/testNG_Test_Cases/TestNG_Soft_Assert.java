package testNG_Test_Cases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import appcodes.SomeClassToTest;

public class TestNG_Soft_Assert {

	SomeClassToTest obj;

	public TestNG_Soft_Assert() {
		// TODO Auto-generated constructor stub
		obj = new SomeClassToTest();
	}

	@Test
	public void testSoftAssets() {
		
		String[] studentData = obj.getStudentData();
		SoftAssert verifyStudentData = new SoftAssert();
		System.out.println("Adding the value at 0th index to Soft Assert :");
		verifyStudentData.assertEquals(studentData[0], "BITS");
		System.out.println("Adding the value at 1st index to Soft Assert :");
		verifyStudentData.assertEquals(studentData[1], "Bengaluru");
		System.out.println("Adding the value at 2nd index to Soft Assert :");
		verifyStudentData.assertEquals(studentData[2], "Prajwal");
		
		System.out.println("Soft Asserting the values");
		verifyStudentData.assertAll();
		
	}
}
