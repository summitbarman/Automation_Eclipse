package DataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandleExcelFile 
{
	public static String getCellValue(String path,String sheet,int r,int c)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(sheet).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	public static int getRowCount(String path,String sheet)
	{
		int rc=0;
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			rc=wb.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	public static int getColumnCount(String path,String sheet,int r)
	{
		int cc=0;
		try
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			cc=wb.getSheet(sheet).getRow(r).getLastCellNum();
		}
		catch(Exception e)
		{
			
		}
		return cc;
	}
}
