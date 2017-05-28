package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VarifyRdioButton 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement rb=driver.findElement(By.id("u_0_h"));
		rb.click();
		if(rb.isSelected())
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}
		WebElement rb1=driver.findElement(By.id("u_0_i"));
		rb1.click();
		if(rb1.isSelected())
		{
			System.out.println("test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}

	}
}
