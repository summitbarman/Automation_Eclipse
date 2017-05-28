package com.qspiders.pack1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleToPrintTitle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			String title=driver.getTitle();
			System.out.println(title);
		}
	}
}
/*	Output->
	Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com
	Tech Mahindra
	Amdocs
*/