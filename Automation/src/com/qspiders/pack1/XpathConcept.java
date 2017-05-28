package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathConcept 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my%20java%20project/web%20pages/un_pw.html");
		driver.findElement(By.xpath("//input[1]")).sendKeys("a");
		driver.findElement(By.xpath("//input[2]")).sendKeys("b");
		driver.findElement(By.xpath("//input ")).sendKeys("bb");
	}
}
