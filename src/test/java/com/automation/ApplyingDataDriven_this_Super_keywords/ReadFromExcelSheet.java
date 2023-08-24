package com.automation.ApplyingDataDriven_this_Super_keywords;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.automation_22_Aug_2023_DataDrivenTesting.HowToReadFromExcel;

public class ReadFromExcelSheet {
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	
	@DataProvider(name = "TNDATA")
	public static Object[][] readDataFromExcelSheet() throws Exception {
		Object[][] data = HowToReadFromExcel.readFromExcelSheetTutorialsNinja("LoginTN");
		return data;
		
	}
	
	
	public static Object[][] readFromExcelSheetTutorialsNinja(String sheetName) throws Exception {
	
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023_DataDrivenTesting\\ExcelDataCode.xlsx");
		workbook = new XSSFWorkbook(ip);
		sheet = workbook.getSheet(sheetName);
		
	    int rows = sheet.getLastRowNum(); 
		int cols = sheet.getRow(0).getLastCellNum(); 
		
		Object[][] data = new Object[rows][cols];
		for(int i=0 ; i<rows ; i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0 ; j<cols ; j++) {
				XSSFCell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				case STRING: 
					data[i][j] = cell.getStringCellValue();
					break;
					
				case BOOLEAN:
					data[i][j] = cell.getBooleanCellValue();
					break;
				
				case NUMERIC:
					 data[i][j] = Integer.toString((int)cell.getNumericCellValue());
					 break;
				
			}
		}
	}
		
		return data;

	}
}
	