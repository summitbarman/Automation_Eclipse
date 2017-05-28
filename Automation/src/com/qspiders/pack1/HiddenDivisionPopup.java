package com.qspiders.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup 
{
	public static void main(String[] args)
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//strong[text()='One way']")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("Goa");
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//i[@class='icon ir datePicker'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='December']/../../..//a[text()='24']")).click();
		WebElement listAdult=driver.findElement(By.id("Adults"));
		Select select=new Select(listAdult);
		select.selectByVisibleText("3");
		WebElement listChild=driver.findElement(By.id("Childrens"));
		Select select1=new Select(listChild);
		select1.selectByIndex(4);
		WebElement listInfants=driver.findElement(By.xpath("(//select)[3]"));
		Select select2=new Select(listInfants);
		select2.selectByValue("1");
		driver.findElement(By.id("SearchBtn")).click();
		WebElement price=driver.findElement(By.xpath("(//th[@class='price'])[1]"));
		String prcText=price.getText();
		System.out.println(prcText);
	}
}
