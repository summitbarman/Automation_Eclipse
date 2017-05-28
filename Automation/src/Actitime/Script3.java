package Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script3 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.clickLoginButton();
		driver.navigate().refresh();
		l.clickLoginButton();
	}
}
