package May_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class LoginScript 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webmail.testyantra.com/");
		LoginWebMail l=new LoginWebMail(driver);
		Thread.sleep(2000);
		l.login("sumit.b@testyantra.com", "9477016755");
		Thread.sleep(2000);
		driver.quit();
	}
}
