package com.qspiders.practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintContentOfListBoxInSortedOrder 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/MultilevelListBox.html");
		WebElement listBox = driver.findElement(By.id("mtr"));
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		System.out.println("Before Sorting\n");
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement options=allOptions.get(i);
			String text=options.getText();
			System.out.println(text);
			
			allText.add(text);
		}
		Collections.sort(allText);
		System.out.println("After Sorting\n");
		for(String t:allText)
		{
			System.out.println(t);
		}
	}
}
