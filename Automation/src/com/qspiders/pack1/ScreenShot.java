package com.qspiders.pack1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://ebclj.blogspot.in/2016/12/different-comapny-q-a.html");
		RemoteWebDriver r=(RemoteWebDriver)driver;
		File srcFile=r.getScreenshotAs(OutputType.FILE);
		File destFile=new File("D:/interview.png");
		FileUtils.copyFile(srcFile, destFile);
	}
}
