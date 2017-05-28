package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountLink 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/link.html");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("A -> "+allLinks); //this will display the address of both the link.
		int count=allLinks.size();
		System.out.println("B -> "+count);
	}
}
