package Instances;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MYListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String onstart = result.getMethod().getMethodName();
		System.out.println(onstart);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String ontestfailure = result.getMethod().getMethodName()+"---->onTestFailure";
		System.out.println(ontestfailure);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish");
	}

}
