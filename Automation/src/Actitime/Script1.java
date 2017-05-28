package Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Script1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost/login.do");
		LoginPage1 l=new LoginPage1(driver); //this statement is for LoginPage1.java
//		LoginPage l=new LoginPage(driver);	//this statement is for LoginPage.java
//		LoginPage2 l=new LoginPage2();
//		PageFactory.initElements(driver, l);
//		l.countLink();
		l.clickLoginButton();
		Thread.sleep(5000);
		l.clickLoginButton();
	}
}
