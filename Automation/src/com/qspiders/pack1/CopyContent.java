package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CopyContent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/two_text_box.html");
		driver.findElement(By.id("a1")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.id("a1")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("a2")).sendKeys(Keys.CONTROL+"v");
		
	}
}
