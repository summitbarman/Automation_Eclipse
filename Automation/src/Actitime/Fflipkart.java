package Actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.flipkart.com");
		
		driver.manage().window().maximize();
		WebElement elec=driver.findElement(By.xpath("//span[text()='Electronics']"));
		elec.click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Lenovo']")));
		WebElement lenovo=driver.findElement(By.xpath("//span[.='Lenovo']"));
		Actions action=new Actions(driver);
		action.moveToElement(lenovo).perform();
		
		
	}
}
