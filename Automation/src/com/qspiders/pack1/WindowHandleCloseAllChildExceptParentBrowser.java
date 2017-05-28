package com.qspiders.pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleCloseAllChildExceptParentBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		String pw=driver.getWindowHandle();
		Set<String> allWH=driver.getWindowHandles();
		allWH.remove(pw);
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			driver.close();
			/*if(!pw.equals(wh))
			{
				driver.close();
			}
			*/
		}
		
	}
}
