package com.qspiders.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver", "D:/my java project/javaproject/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
//		driver.findElement(By.id("login_Layer")).click();
//		driver.findElement(By.xpath("(//div[8])[3]/a[text()='Register Now']"));
//		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		driver.findElement(By.xpath("//div[@id='uploadBtnCont']")).sendKeys("D:\\Sumit_Barman_2 Yrs_Manual_Testing.doc");
		
	}
}
