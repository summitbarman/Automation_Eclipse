package com.qspiders.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintContentOfTheTableInTableFormat 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/table.html");
		List<WebElement> allTR=driver.findElements(By.tagName("tr"));
		for(int i=0;i<allTR.size();i++)
		{
			WebElement tr=allTR.get(i);
			List<WebElement> allTD=tr.findElements(By.tagName("td"));
			for(int j=0;j<allTD.size();j++)
			{
				String s=allTD.get(j).getText();
				System.out.print(s+" ");
			}
			System.out.println();
		}
		driver.close();
	}
}
