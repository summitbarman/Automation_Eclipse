package May_Practise;

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

public class ScreenDesk
{
	public static void main(String[] args) throws AWTException, IOException 
	{
		SimpleDateFormat s=new SimpleDateFormat("DD-MM-YYY");
		String time=s.format(new Date());
		System.out.println(time);
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r=new Rectangle();
		Robot robot=new Robot();
		BufferedImage image=robot.createScreenCapture(r);
		File file=new File("./screenshot/"+time+".png");
		ImageIO.write(image, "png", file);
	}
}
