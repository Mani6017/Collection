package practiceTestNG;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvidersWithExcel {

	//retrieve the data from the excel
	
	@DataProvider(name = "airportTestData")
	public Object[] getAirportData()  {
		// TODO Auto-generated method stub
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		String cellData = null;
		// location of the excel file
		
		String Path = "C:\\Users\\maddy\\OneDrive\\Desktop\\Collection\\src\\utilities\\ExcelRead.xlsx";
		String sheetName = "Sheet1";
		
		
		try {
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		Cell = ExcelWSheet.getRow(2).getCell(1);
		cellData = Cell.getStringCellValue();
		System.out.println("cellData: " + cellData);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new Object[] {cellData};
	}
	
	
	@Test(dataProvider = "airportTestData")
	public void method1(String  depAirport) {
		System.out.println("depAirport : "  + depAirport);
	}
	
}
