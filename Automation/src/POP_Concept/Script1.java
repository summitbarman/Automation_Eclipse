package POP_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 
{
	public static void verifyTitle(WebDriver driver,String expectedResult)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedResult))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		verifyTitle(driver,"actiTIME - Login");
		LoginApplicationUsingPOM l=new LoginApplicationUsingPOM(driver);
		l.login();
		verifyTitle(driver,"actiTIME - Enter Time-Track");
	}
}
