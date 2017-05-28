package t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import t.Login;

public class LoginScript 
{
	@Test
	public void testScript()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost/login.do");
		Login l=new Login(driver);
		l.log("admin","manager");
		
	}
}
