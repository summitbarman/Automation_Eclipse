package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuConcept 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver(); //it is not working with Firefox browser.
//		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=1pjs4mi3tisoh");
		WebElement link=driver.findElement(By.linkText("Actimind Inc."));
		Actions action=new Actions(driver);
		action.contextClick(link).perform();
		action.sendKeys("t").perform();
		
	}
}
