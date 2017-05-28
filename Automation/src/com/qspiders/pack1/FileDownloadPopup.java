package com.qspiders.pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		FirefoxProfile profile=new FirefoxProfile();
		String key="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		profile.setPreference(key, value);
		WebDriver driver=new FirefoxDriver(profile);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.seleniumhq.org/download/");
		driver.findElement(By.id("close")).click();
		String xp="//td[.='Java']/..//a[.='Download']";
		driver.findElement(By.xpath(xp)).click();
	}
}
