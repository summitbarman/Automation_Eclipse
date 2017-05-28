package JavaScriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWebPage 
{
	public static void main(String[] args) 
	{
//		System.setProperty("webDriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://news.google.co.in/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(20,30)");
	}
}
