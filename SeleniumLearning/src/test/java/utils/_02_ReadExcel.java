package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class _02_ReadExcel {
	
	@Test
	public static String[][] getExceldata() {
		//locate the file
		String fileLocation = "./test-data/LoginData.xlsx";
		//locate the workbook
		XSSFWorkbook wBook = null;
		try {
			wBook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = wBook.getSheet("Data");
		
		int lastRowNum = sheet.getLastRowNum();
		System.out.println("LastrowNum: "+lastRowNum);
//		int incluserows = sheet.getPhysicalNumberOfRows();
//		System.out.println("with Header rows count: "+incluserows);		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		System.out.println("LastCellNum: "+lastCellNum);
		String [][] data = new String[lastRowNum][lastCellNum];
		for (int i = 1; i<=lastRowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j<lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter dft = new DataFormatter();
				String value = dft.formatCellValue(cell);
//				String value = cell.getStringCellValue();
				data[i-1][j] = value;
			} 
		}	
		try {
			wBook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
			
		
	}

}
	