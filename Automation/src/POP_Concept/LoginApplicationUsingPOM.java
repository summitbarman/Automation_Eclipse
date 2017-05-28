package POP_Concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginApplicationUsingPOM 
{
	@FindBy(id="username")
	private WebElement unTextBox;
	@FindBy(name="pwd")
	private WebElement pwdTextBox;
	@FindBy(id="loginButton")
	private WebElement loginButton;
	public LoginApplicationUsingPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void login()
	{
		unTextBox.sendKeys("admin");
		pwdTextBox.sendKeys("manager");
		loginButton.click();
	}
	
}
