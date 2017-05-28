package March_2017;

import org.testng.annotations.DataProvider;

public class DemoC 
{
	@DataProvider
	public static String[][] getdata()
	{
		String[][] data=new String[2][2];
		data[0][0]="a";
		data[0][1]="x";
		data[1][0]="b";
		data[1][1]="y";
		return data;
	}
}
