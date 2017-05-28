package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VarifyAllignment 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		int x1=driver.findElement(By.id("username")).getLocation().getX();
		int x2=driver.findElement(By.name("pwd")).getLocation().getX();
		System.out.println(x1);
		System.out.println(x2);
		if(x1==x2)
		{
			System.out.println("test id pass");
		}
		else
		{
			System.out.println("test is failed");
		}
		int h1=driver.findElement(By.id("username")).getSize().getHeight();
		int h2=driver.findElement(By.name("pwd")).getSize().getHeight();
		System.out.println(h1);
		System.out.println(h2);
		if(h1==h2)
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}
		int wdt1=driver.findElement(By.id("username")).getSize().getWidth();
		int wdt2=driver.findElement(By.name("pwd")).getSize().getWidth();
		System.out.println(wdt1);
		System.out.println(wdt2);
		if(wdt1==wdt2)
		{
			System.out.println("test id pass");
		}
		else
		{
			System.out.println("test is failed");
		}
	}
}
