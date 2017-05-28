package Actitime;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage2 
{
	@FindBy(xpath="//a")
	private List<WebElement> allLink;
	public void countLink()
	{
		int count=allLink.size();
		System.out.println(count);
	}
}
