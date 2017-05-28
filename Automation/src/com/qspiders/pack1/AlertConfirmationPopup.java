package com.qspiders.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertConfirmationPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.irctc.com/Emp_Login.jsp");
		driver.findElement(By.name("Login")).click();
		try
		{
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert is displaying");
			String text=alert.getText();
			System.out.println(text);
//			alert.dismiss();
			alert.accept();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert is not displaying");
		}
	}
}
