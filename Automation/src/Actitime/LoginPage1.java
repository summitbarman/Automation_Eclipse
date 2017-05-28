package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1  //This class is called POM class
{
	@FindBy(id="loginButton")
	private WebElement loginButton;
	public LoginPage1(WebDriver driver                            
	{
		loginButton=driver.findElement(By.id("loginButton"));
		PageFactory.initElements(driver, this);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
