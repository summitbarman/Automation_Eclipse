package com.qspiders.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginScript 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setUsername();
		l.setPassword();
		l.clickBtn();
	}
}
