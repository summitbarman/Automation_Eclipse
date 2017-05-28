package com.qspiders.pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/two_text_box.html");
		List<WebElement> allTR=driver.findElements(By.tagName("tr"));
		WebElement element=allTR.get(2);
		
		String trData=driver.findElement(By.tagName("td")).getText();
		System.out.println(trData);
		String trData1=element.findElement(By.tagName("td")).getText();
		System.out.println(trData1);
	}
}
