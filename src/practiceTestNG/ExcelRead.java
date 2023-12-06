package practiceTestNG;

import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		// location of the excel file
		
		String Path = "C:\\Users\\maddy\\OneDrive\\Desktop\\Collection\\src\\utilities\\ExcelRead.xlsx";
		String sheetName = "Sheet1";
		
		
		try {
		FileInputStream ExcelFile = new FileInputStream(Path);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);
		
		Cell = ExcelWSheet.getRow(2).getCell(1);
		String cellData = Cell.getStringCellValue();
		System.out.println("cellData: " + cellData);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
