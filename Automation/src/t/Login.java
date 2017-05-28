package t;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name="pwd")
	private WebElement password;
	@FindBy(id="loginButton")
	private WebElement button;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void log(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		button.click();
	}
}
