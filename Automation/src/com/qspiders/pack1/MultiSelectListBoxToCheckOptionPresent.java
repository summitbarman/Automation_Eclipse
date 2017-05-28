package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBoxToCheckOptionPresent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/MultilevelListBox.html");
		WebElement listBox=driver.findElement(By.id("mtr"));
		Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		int found=0;
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			if(text.equals("Vada"))
			{
				found++;
			}
			
		}
		System.out.println(found);
	}
}
