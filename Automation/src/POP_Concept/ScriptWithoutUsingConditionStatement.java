package POP_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScriptWithoutUsingConditionStatement 
{
	public static void verify(WebDriver driver,String expectedTitle)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("Pass");
		}
		catch(Exception e)
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		verify(driver,"actiTIME - Login");
		LoginApplicationUsingPOM l=new LoginApplicationUsingPOM(driver);
		l.login();
		verify(driver,"actiTIME - Enter Time-Track");
	}
}