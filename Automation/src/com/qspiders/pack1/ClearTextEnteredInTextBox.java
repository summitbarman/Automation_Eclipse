package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearTextEnteredInTextBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("wenDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/Demo1.html");
//		driver.findElement(By.id("un")).clear();
//remove value present in the text box without using clear method
		WebElement tb=driver.findElement(By.id("un"));
		tb.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		
	}
}
