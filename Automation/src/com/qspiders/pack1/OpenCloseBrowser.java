package com.qspiders.pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenCloseBrowser 
{
	public static void test(WebDriver driver)
	{
		driver.get("file:///D:/my%20java%20project/Demo.html");
		driver.getTitle();
		
		/*driver.navigate().to("http://www.yahoo.com");
		driver.getTitle();*/
		
		/*driver.navigate().to("http://192.168.10.1/index.asp");
		driver.getTitle();*/
		
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();*/
	}
	
	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver","D:/my java project/javaproject/Automation/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		test(new ChromeDriver());*/
		
		System.setProperty("webdriver.ie.driver", "D:/my java project/javaproject/Automation/IEDriverServer.exe");
		test(new InternetExplorerDriver());
	}

}
