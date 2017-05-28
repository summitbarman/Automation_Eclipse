package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiTime_Login 
{
	@Parameters({"url"})
	@Test
	public static void main(String url) throws InterruptedException
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		String aTitle=driver.getTitle();
		String eTitle="actiTIME - Enter Time-Track";
		if(aTitle.equals(eTitle))
		{
//			System.out.println("Result is PASS");
			Reporter.log("Result is PASS", true);
		}
		else
		{
//			System.out.println("Result is FAIL");
			Reporter.log("Result is FAIL", true);
		}
	}
}
