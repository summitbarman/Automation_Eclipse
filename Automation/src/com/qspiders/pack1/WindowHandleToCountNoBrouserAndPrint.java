package com.qspiders.pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleToCountNoBrouserAndPrint 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		Set<String> wh=driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		for(String allWH:wh)
		{
			System.out.println(allWH);
		}
	}
}
