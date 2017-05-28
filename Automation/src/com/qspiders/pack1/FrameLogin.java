package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameLogin 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.zoho.com/crm/lp/login.html");
		WebElement f=driver.findElement(By.xpath("//iframe[@id='zohoiam']"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("lid")).sendKeys("summitbarman87@gmail.com");
		driver.findElement(By.id("pwd")).sendKeys("sumit12345");
		driver.findElement(By.id("submit_but")).click();
	}
}
