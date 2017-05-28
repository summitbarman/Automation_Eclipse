package com.qspiders.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintContentOfTheTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/table.html");
		List<WebElement> thContent=driver.findElements(By.xpath("//td"));
		for(int i=0;i<thContent.size();i++)
		{
			String text=thContent.get(i).getText();
			System.out.print(text+" ");
		}
		System.out.println();
	}
}
