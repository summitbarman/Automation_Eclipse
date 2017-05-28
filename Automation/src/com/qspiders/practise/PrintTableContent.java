package com.qspiders.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTableContent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my%20java%20project/web%20pages/MockTable.html");
		List<WebElement>allTR=driver.findElements(By.tagName("tr"));
		for(int i=0;i<allTR.size();i++)
		{
			WebElement tr=allTR.get(i);
			List<WebElement>allTD=tr.findElements(By.tagName("td"));
			for(int j=0;j<allTD.size();j++)
			{
				String text=allTD.get(j).getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		driver.close();
	}
}
