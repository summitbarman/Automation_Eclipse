package com.qspiders.pack1;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopup 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("3.0.1")).click();
		Runtime.getRuntime().exec("D:\\Script1.exe");
	}
}
