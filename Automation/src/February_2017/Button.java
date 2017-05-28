package February_2017;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Button 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.co.in/search?q=selenium+interview+question&ie=utf-8&oe=utf-8&client=firefox-b-ab&gfe_rd=cr&ei=nP2uWKfnIu_x8AfDyLnQDg");
		List<WebElement> allLink=driver.findElements(By.xpath("//div[@class='g']"));
		int listCount=allLink.size();
		System.out.println("Total Number of Buttons on the Web Pages are : "+listCount);
		driver.quit();
	}
}