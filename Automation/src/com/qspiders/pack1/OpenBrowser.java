package com.qspiders.pack1;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver; 

public class OpenBrowser 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webDriver.chrome.driver","D:/my java project/javaproject/Automation/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.youtube.com");
		System.out.println(driver.getTitle());
		//alternate way to enter the url
		driver.navigate().to("http://www.fb.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
//		driver.close();
		//alternate way to close the browser
		driver.quit();
	}
}
