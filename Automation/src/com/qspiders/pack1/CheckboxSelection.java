package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxSelection 
{
	public static void main(String[] args) throws InterruptedException  
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/link.html");
		List<WebElement> allChk=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement chk:allChk)
		{
			chk.click();
		}
		Thread.sleep(5000);
		for(int i=allChk.size()-1;i>=0;i--)
		{
			allChk.get(i).click();
		}
	}
}
