package February_2017;

import java.io.IOException;

import org.omg.SendingContext.RunTime;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoIt 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL+"p").perform();
		
		Runtime.getRuntime().exec("D:/print.exe");
	}
}


