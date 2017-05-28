package March_2017;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static void setCellValue(String name,String status) 
	{
		try
		{
			FileInputStream fis=new FileInputStream("D:/new_Data.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			int rc=wb.getSheet("res").getLastRowNum();
			Row r=wb.getSheet("res").createRow(rc+1);
			r.createCell(0).setCellValue(name);
			r.createCell(1).setCellValue(status);
			FileOutputStream fos=new FileOutputStream("D:/new_Data.xlsx");
			wb.write(fos);
			
		}
		catch(Exception e){}
	}
}
