package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_ITestListener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart --> Test Starting");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess --> Test Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure --> Test failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped --> Test skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage --> Test within percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart --> Test Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish --> Test Starting");
		
	}

}
