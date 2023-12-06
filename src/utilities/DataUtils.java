package utilities;

import org.testng.annotations.DataProvider;

import UtilsKoushik.ReadDataIntegrationWithExcel;

public class DataUtils {
	@DataProvider(name = "login"/* , indices = {0,2} */ /*parallel = true*/)
	public String[][] getData() {
		String[][] excelData = ReadDataIntegrationWithExcel.getExcelData();
		
		//	String[][] data = new String[3][2];
		//		data[0][0] = "Manikandan_9479@yahoo.com";
		//		data[0][1] = "Thusday!123";
		//
		//		data[1][0] = "Maddymani727@gmail.com";
		//		data[1][1] = "Mani@19967";
		//		
		//		data[2][0] = "someEmail@gmail.com";
		//		data[2][1] = "Mani@199967";

		return excelData;
	}
}
