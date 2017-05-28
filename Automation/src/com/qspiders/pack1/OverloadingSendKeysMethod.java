package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class OverloadingSendKeysMethod 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/my java project/web pages/Demo.html");
		Actions action=new Actions(driver);
		//to type the given input in the current cursor position.
		action.sendKeys("abcdefghi").perform();

		//to type the given input in the Specified element.
		WebElement un=driver.findElement(By.id("un"));
		action.sendKeys(un, "xyz");
	}
}
