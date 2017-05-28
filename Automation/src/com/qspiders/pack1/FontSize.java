package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FontSize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.id("username"));
		String fsize=un.getCssValue("font-size");
		String ftype=un.getCssValue("font-type");
		String fcolor=un.getCssValue("color");
		System.out.println(fsize);
		System.out.println(ftype);
		System.out.println(fcolor);
		
	}
}
