package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesConcept 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/page1.html");
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("f1");
		WebElement f=driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("xyz");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("abc");
	}
}
