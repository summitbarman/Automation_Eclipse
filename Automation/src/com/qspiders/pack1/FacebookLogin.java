package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("summitbarman87@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("**********");
//		driver.findElement(By.cssSelector("input[value='Log In'")).click();
		driver.findElement(By.cssSelector("input[value='Log In'")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		String aTitle=driver.getTitle();
		String eTitle="pageTitle";
		if(aTitle.equals(eTitle))
		{
			System.out.println("Test Result Is PASS");
		}
		else
		{
			System.out.println("Test Result Is FAIL");
		}
	}
}
