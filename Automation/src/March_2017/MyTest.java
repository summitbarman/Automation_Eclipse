package March_2017;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class MyTest 
{
	@Test
	public void testA()
	{
		Reporter.log("testA()",true);
		Excel.setCellValue("testA", "PASS");
	}
	@Test
	public void testB()
	{
		Reporter.log("testB()",true);
		Excel.setCellValue("testB", "FAIL");
		Assert.fail();
	}
}
