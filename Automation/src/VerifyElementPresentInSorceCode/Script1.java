package VerifyElementPresentInSorceCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 
{
	public static void verifyTitle(WebDriver driver,String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		verifyTitle(driver,"actiTIME - Login");
		LoginPage l=new LoginPage(driver);
		l.Login("abc", "xyz123");
		l.verifyErrMsgDisplayed();
		driver.close();
	}
}
