package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintSumOfAllNumberPresentInTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/two_text_box.html");
		List<WebElement> allNum=driver.findElements(By.xpath("//td"));
		int sum=0;
		for(int i=0;i<allNum.size();i++)
		{
			String text=allNum.get(i).getText();
			try
			{
				int num=Integer.parseInt(text);
				sum=sum+num;
			}
			catch(NumberFormatException e)
			{
				
			}
		}
		System.out.println(sum);
	}
}
