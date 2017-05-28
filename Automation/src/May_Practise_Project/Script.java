package May_Practise_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/adminisrator/Desktop/webpage/link.html");
		driver.findElement(By.id("a")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement firstTitle=driver.findElement(By.xpath("//title[text()='First Link']"));
		String actualFt=firstTitle.getText();
		String expectedFt="First Link";
		if(actualFt.equals(expectedFt))
		{
			System.out.println("Test is Pass as the Title "+actualFt+" is Present on the Web Page");
		}
		else
			System.out.println("Test is Failed");
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		
		driver.findElement(By.id("b")).click();
		WebElement secondTitle=driver.findElement(By.xpath("//title[text()='Second Link']"));
		String actualSt=secondTitle.getText();
		String expectedSt="Second Link";
		if(actualSt.equals(expectedSt))
		{
			System.out.println("Test is Pass as the Title "+actualSt+" is Present on the Web Page");
		}
		else
			System.out.println("Test is Failed");
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		
		driver.findElement(By.id("c")).click();
		WebElement thirdTitle=driver.findElement(By.xpath("//title[text()='Third Link']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualTt=thirdTitle.getText();
		String expectedTt="Thirda Link";
		if(actualTt.equals(expectedTt))
		{
			System.out.println("Test is Pass as the Title "+actualTt+" is Present on the Web Page");
		}
		else
			System.out.println("Test is Failed");
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		
		driver.findElement(By.id("d")).click();
		WebElement fourthTitle=driver.findElement(By.xpath("//title[text()='Fourth Link']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualFot=fourthTitle.getText();
		String expectedFot="Fourth Link";
		if(actualFot.equals(expectedFot))
		{
			System.out.println("Test is Pass as the Title "+actualFot+" is Present on the Web Page");
		}
		else
			System.out.println("Test is Failed");
		driver.findElement(By.xpath("//a[text()='Back']")).click();
		
		driver.findElement(By.id("e")).click();
		WebElement fifthTitle=driver.findElement(By.xpath("//title[text()='Fifth Link']"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String actualFit=fifthTitle.getText();
		String expectedFit="Fifth Link";
		if(actualFit.equals(expectedFit))
		{
			System.out.println("Test is Pass as the Title "+actualFit+" is Present on the Web Page");
		}
		else
			System.out.println("Test is Failed");
		driver.findElement(By.xpath("//a[text()='Back']")).click();
	}
}
