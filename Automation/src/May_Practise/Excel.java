package May_Practise;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my java project/web pages/table.html");
		WebElement textElmnt=driver.findElement(By.xpath("//td[text()='Java']"));
		String text=textElmnt.getText();
		System.out.println("WebTable text is "+text);
		FileInputStream fis=new FileInputStream("./input/Excel.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet s=wb.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		System.out.println(c);
		if(text.equals(c))
		{
		//	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			System.out.println("Test is PASS");
		}
		else
		{
			System.out.println("Test is FAIL");
		}
		
	}
}
