package JavaScriptConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnterInputWithoutSendKeys 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		String script="document.getElementById('username').value='admin'";
		String script1="document.getElementByName('pwd').value='manager'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(script);
		JavascriptExecutor j1=(JavascriptExecutor)driver;
		j1.executeScript(script1);
	}
}
