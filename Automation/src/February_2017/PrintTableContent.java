package February_2017;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintTableContent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/my java project/web pages/MockTable.html");

//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Mock Table"));
		
		List<WebElement> allTR=driver.findElements(By.xpath("//tr"));
		for(int i=0;i<allTR.size();i++)
		{
			WebElement tr=allTR.get(i);
			List<WebElement> allTD=tr.findElements(By.xpath("//td"));
			for(int j=0;j<allTD.size();j++)
			{
				String td=allTD.get(j).getText();
				System.out.print(td+" ");
			}
			System.out.println();
			}
		/*List<WebElement> tableData=driver.findElements(By.xpath("//td"));
		for(int i=0;i<tableData.size();i++)
		{
			String data=tableData.get(i).getText();
			System.out.print(data+" ");
		}
		System.out.println();*/
	}
}
