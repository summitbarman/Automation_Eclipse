package March_2017;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListener implements ITestListener 
{
	public static int passCount=0;
	public static int failCount=0;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		passCount++;
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		try 
		{
			ScreenShot.screenShot();
		}
		catch (AWTException | IOException e) 
		{
			e.printStackTrace();
		}
		failCount++;
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("passCount is : "+passCount,true);
		Reporter.log("failCount is : "+failCount,true);
	}

}
