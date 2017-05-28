package com.testNG.qspiders_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertConcept 
{
	@Test
	public void testScript()
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		String expectedTitle="actiTIME - Log";
		String actualTitle=driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle);
		driver.quit();
		sa.assertAll();
	}
}
