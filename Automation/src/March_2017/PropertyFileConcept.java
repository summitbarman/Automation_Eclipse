package March_2017;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileConcept 
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("./config/config.properties");
		Properties p=new Properties();
		p.load(fis);
		String v=p.getProperty("browser");
		String v1=p.getProperty("time");
		System.out.println(v);
		System.out.println(v1);
	}
}
