package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test fail: " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestResult result) {
		
	}

}
