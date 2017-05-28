package March_2017;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept 
{
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[3][2];
		data[0][0]="a";
		data[0][1]="x";
		data[1][0]="b";
		data[1][1]="y";
		data[2][0]="c";
		data[2][1]="z";
		return data;
	}
	@Test(dataProvider="getData")
	public void testA(String un,String pwd)
	{
		Reporter.log("Create : "+un+" _ "+pwd,true);
	}
}
