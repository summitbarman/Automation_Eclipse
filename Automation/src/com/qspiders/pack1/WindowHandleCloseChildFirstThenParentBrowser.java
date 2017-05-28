package com.qspiders.pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleCloseChildFirstThenParentBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		String pwh=driver.getWindowHandle();
		driver.navigate().to("https://www.naukri.com/");
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			
		}
		driver.close();
		driver.switchTo().window(pwh);
		driver.close();
	}
}
