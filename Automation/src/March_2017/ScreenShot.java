package March_2017;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

public class ScreenShot 
{
	public static void screenShot() throws AWTException, IOException 
	{
		try
		{
			SimpleDateFormat s=new SimpleDateFormat("DD-MM-YYYY_hh_mm_ss");
			String timeStamp=s.format(new Date());
			System.out.println(timeStamp);
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle screenRect=new Rectangle(d);
			Robot r=new Robot();
			BufferedImage img=r.createScreenCapture(screenRect);
			File output=new File("./screenshot/"+timeStamp+".png");
			ImageIO.write(img, "png", output);
		}
		catch(Exception e){}
	}
}
