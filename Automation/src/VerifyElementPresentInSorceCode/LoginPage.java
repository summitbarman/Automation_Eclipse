package VerifyElementPresentInSorceCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	private WebDriver driver;
	@FindBy(id="username")
	private WebElement unTextBox;
	@FindBy(name="pwd")
	private WebElement pwTextBox;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void Login(String un,String pw)
	{
		unTextBox.sendKeys(un);
		pwTextBox.sendKeys(pw);
		loginButton.click();
	}
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
	public void verifyErrMsgDisplayed()
	{
		String xp="//span[contains(text(),'Username or Password is invalid. Please try again.')]";
		List<WebElement> e=driver.findElements(By.xpath(xp));
		if(e.size()>0)
		{
			System.out.println("PASS : Error message is present in the Source Code");
			WebElement errMsg=e.get(0);
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			
			if(errMsg.isDisplayed())
			{
				System.out.println("PASS : Error message is displayed");
			}
			else
			{
				System.out.println("FAIL : Error message is not displayed");
			}
		}
		else
		{
			System.out.println("FAIL : Error message is not present in the Source Code");
		}
	}
}
