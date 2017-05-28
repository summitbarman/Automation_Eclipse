package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintContentOfTableInTableFormat 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/two_text_box.html");
		List<WebElement> allTR=driver.findElements(By.tagName("tr"));
		for(int i=0;i<allTR.size();i++)
		{
			WebElement tr=allTR.get(i);
			List<WebElement> allTD=tr.findElements(By.tagName("td"));
			for(int j=0;j<allTD.size();j++)
			{
				WebElement td=allTD.get(j);
				String text=td.getText();
				System.out.print(text+" ");
			}
			System.out.println();
		}
		driver.close();
	}
}
