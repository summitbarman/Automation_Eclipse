package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisabledTextBox
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/Demo1.html");
		WebElement dis=driver.findElement(By.id("un"));
		/*try
		{
			dis.sendKeys("abc");
			System.out.println("textbox is enabled");
		}
		catch(InvalidElementStateException e)
		{
			System.out.println("Textbox is disabled");
		}*/
		if(dis.isEnabled())
		{
			System.out.println("textbox is enabled");
		}
		else
		{
			System.out.println("textbox is disabled");
		}
	}
}
