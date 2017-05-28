package February_2017;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "D:/my java project/javaproject/Automation/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///D:/my java project/web pages/tableCheckBox.html");
		EventFiringWebDriver efwd=new EventFiringWebDriver(driver);
		File src=efwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:/x1.png");
		FileUtils.copyFile(src, dest);
	}
}
