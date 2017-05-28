package February_2017;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnCheckBox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my java project/web pages/Demo.html");
//		driver.findElement(By.xpath("//input[@id='un']")).clear();
		WebElement untxt=driver.findElement(By.xpath("//input[@id='un']"));
		untxt.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		/*WebElement elem1=driver.findElement(By.xpath("(//td[text()='Sachin']/..//input[@type='checkbox'])[1]"));
		elem1.click();
		WebElement elem=driver.findElement(By.xpath("//td[.='Sumit']"));
		String s=elem.getCssValue("font-size");
		String ft=elem.getCssValue("font-weight");
		String fc=elem.getCssValue("color");
		String ff=elem.getCssValue("font-family");
		String fa=elem.getCssValue("font-align");*/
		/*System.out.println(s);
		System.out.println(ft);
		System.out.println(fc);*/
//		System.out.println(ff);
//		System.out.println(fa);
	}
}
