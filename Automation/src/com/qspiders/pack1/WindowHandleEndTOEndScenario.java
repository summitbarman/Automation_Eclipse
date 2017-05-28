package com.qspiders.pack1;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleEndTOEndScenario 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		WebElement link=driver.findElement(By.linkText("Actimind Inc."));
		Actions actions=new Actions(driver);
		actions.contextClick(link).perform();
		actions.sendKeys("w").perform();
		Set<String> allWH=driver.getWindowHandles();
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//span[.='Contacts']")).click();
		driver.findElement(By.name("file")).sendKeys("D:\\Sumit_Barman_2 Yrs_Manual_Testing.doc");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		try
		{
			Alert alert=driver.switchTo().alert();
			System.out.println("Alert popup is displayed");
			System.out.println(alert.getText());
			alert.accept();
		}
		catch(NoAlertPresentException e)
		{
			System.out.println("Alert popup is not displayed");
		}
		driver.quit();
	}
}
