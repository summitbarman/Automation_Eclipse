package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/MultilevelListBox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select=new Select(listBox);
		select.selectByIndex(0);
		select.selectByValue("d");
		select.selectByVisibleText("Vada");
		
//		select.deselectAll();
		
		select.deselectByIndex(0);
		select.deselectByValue("d");
		select.deselectByVisibleText("Vada");
		
		//to check whether the ListBox is MultiSelecct or SingleSingle
		if(select.isMultiple())
		{
			System.out.println("Its a MultiSelect ListBox");
		}
		else
		{
			System.out.println("Its a SingleSelect ListBox");
		}
	}
}
