package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTestBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.id("username"));
		if(un.isDisplayed())
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}
	}
}
