package JavaScriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptTypeUsername 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		String script="document.getElementById('username').value='admin'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(script);
	}
}
