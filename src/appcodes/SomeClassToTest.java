package appcodes;

public class SomeClassToTest {
	
	public int sumOfTwoNumbers( int a , int b) {
		return a+b;
	}
	
	public int DivideByZeroOfTwoNumbersWithTryCatch(int i, int j) {
		int result;
		try {
			result=i/j;
		} catch (ArithmeticException e) {
			return 0;
		}
		return result;
	}
	
	public String[] getStudentData() {
		String[] studentData = {"BITS","Bangalore","Prajwal"};
		return studentData;
	}

}
