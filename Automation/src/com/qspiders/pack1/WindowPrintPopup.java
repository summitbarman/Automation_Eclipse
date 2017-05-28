package com.qspiders.pack1;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowPrintPopup 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost/login.do");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL+"P").perform();
		Runtime.getRuntime().exec("E:/print.exe");
	}
}
