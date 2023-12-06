package UtilsKoushik;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataWithDynamicCell  {

	public static void main(String[] args) throws IOException {

		String fileLocation = "./test-data/Login-data1.xlsx";
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int lastRowNum = wsheet.getLastRowNum();
		int physicalRow = wsheet.getPhysicalNumberOfRows();
		System.out.println("last row number " + lastRowNum); // exclude header row
		System.out.println("get physical row : " + physicalRow); // inclusive header row
		short lastcell = wsheet.getRow(0).getLastCellNum();
		for (int i = 0; i <= physicalRow; i++) {
			XSSFRow  row  = wsheet.getRow(i);
			for (int j = 0; j < lastcell; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//		        String value = cell.getStringCellValue();
				System.out.println(value);
			} 
		}
		wbook.close();
	}
}
