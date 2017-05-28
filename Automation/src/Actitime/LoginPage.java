package Actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	private WebElement loginButton;
	private WebElement unTextBox;
	private WebElement pwdTextBox;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		loginButton=driver.findElement(By.id("loginButton"));
		unTextBox=driver.findElement(By.id("username"));
		pwdTextBox=driver.findElement(By.name("pwd"));
	}
	void clickLoginButton()
	{
		loginButton.click();
	}
	public void setUserName()
	{
		unTextBox.sendKeys("admin");
	}
	public void setPassword()
	{
		pwdTextBox.sendKeys("manager");
	}
}
