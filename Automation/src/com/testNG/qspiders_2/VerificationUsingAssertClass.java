package com.testNG.qspiders_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationUsingAssertClass 
{
	@Test
	public void ver()
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		String expectedTitle="actiTIME - Logi";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
	}
	
}
