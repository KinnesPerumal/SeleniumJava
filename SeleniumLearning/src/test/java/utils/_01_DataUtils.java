package utils;

import org.testng.annotations.DataProvider;

public class _01_DataUtils {
	
	@DataProvider(name = "loginData"/* , indices = {1,2}, parallel = true */)
	public String[][] getData() {
		String[][] excelData = _02_ReadExcel.getExceldata();
//		String [][] data = new String[3][2];
//		data[0][0] = "student";
//		data[0][1] = "Password123";
//		data[1][0] = "student";
//		data[1][1] = "Password123";
//		data[2][0] = "tudent";
//		data[2][1] = "Password123";
//		return data;
		return excelData;
	}
}
