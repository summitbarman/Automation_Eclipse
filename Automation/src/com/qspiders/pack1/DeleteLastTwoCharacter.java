package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeleteLastTwoCharacter 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/Demo.html");
		WebElement tb=driver.findElement(By.id("un"));
		for(int i=1;i<=2;i++)	//delete last two character in username text box.
		{
			tb.sendKeys(Keys.BACK_SPACE);
		}
		tb.sendKeys(Keys.HOME);
		for(int i=1;i<=2;i++)	//delete 1st two character
		{
			tb.sendKeys(Keys.DELETE);
		}
		
	}
}
