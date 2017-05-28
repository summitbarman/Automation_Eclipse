package com.qspiders.pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_xpath 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecho.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.fb.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("summitbarman87@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8748005007");
		driver.findElement(By.xpath("//input[@name='pass' and @type='password']")).sendKeys("8748005007");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.findElement(By.xpath("//input[@value='Log In']")).sendKeys(Keys.ENTER);
		
//      //input[@type='text' or @type='password' or @type='email'] ->this will select all text & pwd field.
//      //*[@type='email' or @value='Log In'] -> it matches only email text field and LogIn botton.
//      //* -> it matches with all the elements present in the website.
//		//span[@name='P'] 
//		//level[@name='P']
//		//div[@name='P']
//		//span[@name='P'] | //level[@name='P'] | //div[@name='P']
		//alternate way
//		//*[@name='P'] -> when tag is keep on changing.
		
	}
}
