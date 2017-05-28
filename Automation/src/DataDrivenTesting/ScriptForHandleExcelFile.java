package DataDrivenTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptForHandleExcelFile 
{
	public static void main(String[] args) throws Exception 
	{
		int rc=HandleExcelFile.getRowCount("D:/Data.xlsx", "sheet1");
		for(int i=1;i<=rc;i++)
		{
			String un=HandleExcelFile.getCellValue("D:/Data.xlsx", "sheet1", i, 0);
			String pw=HandleExcelFile.getCellValue("D:/Data.xlsx", "sheet1", i, 1);
			WebDriver driver=new FirefoxDriver();
			driver.get("http://localhost/login.do");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			LoginPage l=new LoginPage(driver);
			l.Login(un, pw);
			
			Thread.sleep(1000);
			l.verifyTitle(driver,"actiTIME - Login");
			Thread.sleep(1000);
			l.verifyErrMsgDisplayed();
			driver.quit();
		}
	}
}
