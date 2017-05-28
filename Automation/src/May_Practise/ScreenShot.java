package May_Practise;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		action.sendKeys(Keys.CONTROL+"P").perform();
		Runtime.getRuntime().exec("C:/Users/adminisrator/Desktop/print.exe");
		
	}
}
