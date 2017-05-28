package JavaScriptConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectFutureDate 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.yatra.com/");
		String script="document.getElementById('BE_flight_depart_date').value='11/01/2017'";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(script);
	}
}
