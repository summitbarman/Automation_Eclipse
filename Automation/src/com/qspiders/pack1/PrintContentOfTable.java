package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintContentOfTable 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/two_text_box.html");
		List<WebElement> allData=driver.findElements(By.xpath("//td"));
		for(int i=0;i<allData.size();i++)
		{
			String text=allData.get(i).getText();
			System.out.print(text+" ");
		}
		System.out.println();
	}
}
