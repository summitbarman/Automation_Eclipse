package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("");
		Actions actions=new Actions(driver);
		String xp1="//h1[text()='Block 1']";
		WebElement source=driver.findElement(By.xpath(xp1));
		String xp2="//h1[text()='Block 3']";
		WebElement target=driver.findElement(By.xpath(xp2));
		actions.dragAndDrop(source, target).perform();
	}
}
