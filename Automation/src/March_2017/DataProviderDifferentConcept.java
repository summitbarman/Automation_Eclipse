package March_2017;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderDifferentConcept 
{	
	@Test(dataProviderClass=DemoC.class, dataProvider="getdata")
	public void testA(String un,String pwd)
	{
		Reporter.log("Create : "+un+"-"+pwd,true);
	}
}

