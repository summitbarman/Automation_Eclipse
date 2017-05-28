package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Concept 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("D:/my java project/web pages/Sample.html");
		WebElement e=driver.findElement(By.tagName("a"));
		e.click();
		//or using optimized code here we have used the locator className
		driver.findElement(By.className("c1")).click();
		//here we have used the locator id
		driver.findElement(By.id("a1")).click();
		//here we have used locator name
		driver.findElement(By.name("n1")).click();
		//linkText locator can be used to locate only links
		driver.findElement(By.linkText("QSPIDERS")).click();
		//partialLinkText locator can be used to handle dynamic link but not fully dynamic link.
		driver.findElement(By.partialLinkText("SPID")).click();
		//cssSelector locator is an expression
		driver.findElement(By.cssSelector("a[id='a1']")).click();
		//path of the element is called xpath and in selenium xpath is a locator and it is an expression.
		driver.findElement(By.xpath("html/body/a")).click();
		driver.quit();
	}
}
