package com.testNG.qspiders_1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	@BeforeSuite
	public void m7()
	{
		Reporter.log("Idli", true);
	}
	@AfterSuite
	public void m8()
	{
		Reporter.log("vada", true);
	}
	@BeforeTest
	public void m5()
	{
		Reporter.log("Dahi", true);
	}
	@AfterTest
	public void m6()
	{
		Reporter.log("Sambar", true);
	}
	@BeforeClass
	public void m3()
	{
		Reporter.log("Pongal", true);
	}
	@AfterClass
	public void m4()
	{
		Reporter.log("Chatni", true);
	}
	@BeforeMethod
	public void m1()
	{
		Reporter.log("Chai", true);
	}
	@AfterMethod
	public void m2()
	{
		Reporter.log("Biscuit", true);
	}
}
