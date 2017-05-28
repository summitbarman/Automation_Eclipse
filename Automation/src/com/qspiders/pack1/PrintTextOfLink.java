package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTextOfLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/link.html");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		for(int i=0;i<allLinks.size();i++)
		{
			WebElement link=allLinks.get(i);
			String text=link.getText();
			System.out.println(text);
		}
	}
}
