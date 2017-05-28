package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet 
{
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
		//Open the Excel File
		FileInputStream fis=new FileInputStream("D:/Data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		//goto sheet
		Sheet s=wb.getSheet("Sheet1");
		//goto row 0
		Row r=s.getRow(1);
		//goto cell 0
		Cell c=r.getCell(1);
		//print the cell
//		System.out.println(c);
//		System.out.println(c.toString());
		System.out.println(c.getStringCellValue());
	}
}
