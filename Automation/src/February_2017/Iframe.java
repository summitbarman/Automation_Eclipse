package February_2017;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/page1.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("sumit");
		WebElement f=driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("sumit");
	}
}
