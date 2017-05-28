package February_2017;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my java project/web pages/MultilevelListBox.html");
		String xp="//select[@id='mtr']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		driver.findElement(By.xpath("//option[text()='Dosa']")).click();
	}
}