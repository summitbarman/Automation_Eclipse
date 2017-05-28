package May_Practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Properties 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.co.in");
		String script="document.getElementById('login').click()";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,3000)");
		
		
	}
}
