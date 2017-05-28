package com.testNG.qspiders_2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB 
{
//	@Test(priority=3)
	@Test(dependsOnMethods={"logout"})
	public void login()
	{
		Reporter.log("Enter un,pw and Click Login", true);
		Assert.fail();
	}
//	@Test(dependsOnMethods={"login"})
//	@Test(priority=1,dependsOnMethods={"login"})
	@Test(dependsOnMethods={"login"})
	public void logout()
	{
		Reporter.log("Click Logout", true);
	}
}
