package com.testNG.qspiders_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB 
{
	@Test
	public void testB()
	{
		Reporter.log("Juice", true);
	}
	@Test
	public void testC()
	{
		Reporter.log("Lassi", true);
	}
}
