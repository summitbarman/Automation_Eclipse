package May_Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebMail 
{
	WebDriver driver;
	@FindBy(id="user")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(id="login_submit")
	private WebElement logButton;
	public LoginWebMail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void login(String un,String pw)
	{
		username.sendKeys(un);
		password.sendKeys(pw);
		logButton.click();
	}	
}
