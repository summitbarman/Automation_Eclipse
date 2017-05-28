package March_2017;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils 
{
	private static XSSFSheet ExcelWSheet; 
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception
	{  
	   	String[][] tabArray = null;
	   	try {
	   		FileInputStream ExcelFile = new FileInputStream(FilePath);
	   		// Access the required test data sheet
			   ExcelWBook = new XSSFWorkbook(ExcelFile);
			   ExcelWSheet = ExcelWBook.getSheet(SheetName);
			   int startRow = 1;
			   int startCol = 1;
			   int ci,cj;
			   int totalRows = ExcelWSheet.getLastRowNum();
	 
			   // you can write a function as well to get Column count
			   int totalCols = 2;
			   tabArray=new String[totalRows][totalCols];
			   ci=0;
			   for (int i=startRow;i<=totalRows;i++, ci++)
			   {             
				  cj=0;
	 			   for (int j=startCol;j<=totalCols;j++, cj++)
				  {
	 				   	tabArray[ci][cj]=getCellData(i,j);
	 				   	System.out.println(tabArray[ci][cj]);  
	 			   }
	 		}
	 	}
	catch (FileNotFoundException e)
	{	 
	 	System.out.println("Could not read the Excel sheet");
	 	e.printStackTrace();
	 }
	catch (IOException e){
	 System.out.println("Could not read the Excel sheet");
	 e.printStackTrace();
	 }
	 return(tabArray);
	 }
	public static String getCellData(int RowNum, int ColNum) throws Exception {
	 
	 
	 
	try{
	 
	 
	 
	Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	 
	 
	 
	int dataType = Cell.getCellType();
	 
	 
	 
	if  (dataType == 3) {
	 
	 
	 
	return "";
	 
	 
	 
	}else{
	 
	 
	 
	String CellData = Cell.getStringCellValue();
	 
	 
	 
	return CellData;
	 
	 
	 
	}catch (Exception e)
	{ 
		System.out.println(e.getMessage());
		throw (e);
	}
	 
	}
	 
	 
	 
	}

	 
	public class DataProviderWithExcel_001 {
	 
	 
	 
	WebDriver driver;
	 
	 
	 
	    @BeforeMethod
	 
	 
	 
	    public void beforeMethod() throws Exception {
	 
	 
	 
	    driver = new FirefoxDriver();
	 
	 
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	 
	 
	        driver.get("http://www.store.demoqa.com");
	 
	 
	 
	}
	 
	 
	 
	@Test(dataProvider="Authentication")
	 
	 
	 
	    public void Registration_data(String sUserName,String sPassword)throws  Exception{
	 
	 
	 
	        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	 
	 
	        driver.findElement(By.id("log")).sendKeys(sUserName);
	 
	 
	 
	System.out.println(sUserName);
	 
	 
	 
	        driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	 
	 
	System.out.println(sPassword);
	 
	 
	 
	        driver.findElement(By.id("login")).click();
	 
	 
	 
	        System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
	 
	 
	 
	        driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	 
	 
	 
	}
	 
	 
	 
	    @DataProvider
	 
	 
	 
	    public Object[][] Authentication() throws Exception{
	 
	 
	 
	         Object[][] testObjArray = ExcelUtils.getTableArray("D://ToolsQA//OnlineStore//src//testData//TestData.xlsx","Sheet1");
	 
	 
	 
	         return (testObjArray);
	 
	 
	 
	}
	 
	 
	 
	    @AfterMethod
	 
	 
	 
	    public void afterMethod() {
	 
	 
	 
	       driver.close();
	 
	 
	 
	     }
	 
	 
	 
	}
{

}
