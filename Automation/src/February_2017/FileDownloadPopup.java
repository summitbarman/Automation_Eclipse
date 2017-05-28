package February_2017;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadPopup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		
		FirefoxProfile profile=new FirefoxProfile();
		String key="browser.helperApps.neverAsk.saveToDisk";
		String value="application/zip";
		profile.setPreference(key, value);
		
		WebDriver driver=new FirefoxDriver(profile);
		driver.get("file:///D:/my%20java%20project/web%20pages/page1.html");
		driver.findElement(By.id("close")).click();
		
	}
}
