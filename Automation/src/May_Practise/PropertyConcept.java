package May_Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyConcept 
{
	public static void main(String[] args) 
	{
		File file=new File("./config/test.properties");
		
		FileInputStream fileInput=null;
		try
		{
			fileInput=new FileInputStream(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties p=new Properties();
		try
		{
			p.load(fileInput);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath("//input[@id='u_0_q']")).click();
		
		System.out.print("URL : "+p.getProperty("url"));
		System.out.println("Email : "+p.getProperty("username"));
		System.out.println("Password : "+p.getProperty("password"));
		
	}
}
