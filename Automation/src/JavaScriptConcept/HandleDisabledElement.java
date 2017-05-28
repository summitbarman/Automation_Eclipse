package JavaScriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDisabledElement 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/disable.html");
		String script="document.getElementById('t2').value='hi'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(script);
		
	}
}
