package February_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my java project/web pages/MultilevelListBox.html");
		WebElement element=driver.findElement(By.xpath("//select[@id='mtr']"));
		Select select=new Select(element);
		List<WebElement> allOptions=select.getOptions();
		ArrayList<String> allText=new ArrayList<String>();
		for(int i=0;i<allOptions.size();i++)
		{
			WebElement option=allOptions.get(i);
			String text=option.getText();
			allText.add(text);
		}
		Collections.sort(allText);
		for(String t:allText)
		{
			System.out.println(t);
		}
		/*Select select=new Select(listBox);
		List<WebElement> allOptions=select.getOptions();
		int countOptions=allOptions.size();
		System.out.println(countOptions);
		*/
		/*if(select.isMultiple())
		{
			System.out.println("Multi Select list Box");
		}
		else
		{
			System.out.println("Single select list box");
		}*/
		/*select.selectByIndex(1);
		select.selectByValue("d");
		select.selectByVisibleText("Vada");*/
//		select.deselectAll();
	
	}
}
