package JavaScriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JavaScriptClickConcept 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		String script="document.getElementById('loginButton').click()";
		RemoteWebDriver r=(RemoteWebDriver)driver;
		r.executeScript(script);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(script);
	}
}
