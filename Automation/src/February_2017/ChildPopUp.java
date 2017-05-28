package February_2017;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildPopUp 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/MultilevelListBox.html");
		
		/*
		String wh=driver.getWindowHandle();
		System.out.println(wh);
		*/
		
		
		
		Set<String> allWh=driver.getWindowHandles();
//		int countWindow=wh.size();
		for(String w:allWh)
		{
			driver.switchTo().window(w);
			
			String title=driver.getTitle();
			System.out.println(title);
		}
		
		/*System.out.println(countWindow);
		String text=driver.getWindowHandle();
		System.out.println(text);
		driver.close();*/
		//driver.close() //->it will close the current browser
		//driver.quit() //->it will close all the browser.	
		}
}
