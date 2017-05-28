package JavaScriptConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollToSpecificElement 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://news.google.co.in/");
		String element="//span[contains(text(),'Entertainment')]";
		WebElement e=driver.findElement(By.xpath(element));
		int y=e.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollTo(0,"+y+")");
		Thread.sleep(3000);
//		String script="document.bodyscrollHeight(0,0-2344)";
		j.executeScript("window.scrollTo(0,-1234)"); //this will scroll up
	}
}
