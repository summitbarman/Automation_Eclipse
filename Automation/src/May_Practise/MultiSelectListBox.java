package May_Practise;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox 
{
	public static void main(String[] args) 
	{
		int found=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/adminisrator/Desktop/multiListBox.html");
		WebElement element=driver.findElement(By.id("111"));
		Select select=new Select(element);
		List<WebElement> allOptions=select.getOptions();
		for(int i=0;i<allOptions.size();i++)
		{
			String text=allOptions.get(i).getText();
			if(text.equals("bangalore"))
			{
				found++;	
			}
		}
		System.out.println(" This Option is present "+found+" times");
	}
}
