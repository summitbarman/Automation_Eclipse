package com.qspiders.pack1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandleCloseChildFirstThenParentBrowser1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.naukri.com/");
		String Pt=driver.getTitle();
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
		}
		driver.close();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			String at=driver.getTitle();
			if(at.equals(Pt))
			{
				driver.close();
				break;
			}
		}
	}
}
