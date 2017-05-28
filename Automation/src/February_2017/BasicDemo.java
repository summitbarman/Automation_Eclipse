package February_2017;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/Demo.html");
		WebElement uname=driver.findElement(By.xpath("//input[@id='un']"));
		String attributeValue=uname.getAttribute("value");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(attributeValue);
		/*driver.findElement(By.xpath("//input[@id='un']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(Keys.CONTROL+"v");
		*/
		/*System.out.println("Current Web Page is : "+driver.getTitle());
		String aTitle=driver.getTitle();
		String eTtitle="Google ";
		if(aTitle.equals(eTtitle))
		{
			System.out.println("The Result is PASS");
		}
		else
		{
			System.out.println("The Result is FAIL");
		}*/
		/*WebElement searchBox=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		searchBox.sendKeys("Selenium Interview Questions");
		searchBox.sendKeys(Keys.ENTER);
//		List<WebElement> listLinks=driver.findElements(By.xpath("//div[@class='g']"));
		List<WebElement> listLink=driver.findElements(By.cssSelector("div.rc"));
		Thread.sleep(2000);
		int countLink=listLink.size();
		System.out.println("Number of Link Currently present on the Web Page "+countLink);*/
	}
}
