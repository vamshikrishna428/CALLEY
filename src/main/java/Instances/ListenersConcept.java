package Instances;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersConcept extends BaseClass implements ITestListener {
	@Override
	public final void onTestFailure(ITestResult result){
		String name = result.getName();
		screenShotMethod(name+".jpg");
	}
}
