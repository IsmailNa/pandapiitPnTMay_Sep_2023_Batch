package com.automation_22_Aug_2023_DataDrivenTesting;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class HowToReadFromExcel {
	
	//Step 1 - Add the poi apache dependencies in your pom.xml file
	//Step 2 - Create an Excel (.xlsx) sheet
	//Step 3 - Make sure that the data is correct and then paste it in the package
	//Step 4 - Create a method and pass the Sheetname as input parameter (String)
	
	public static FileInputStream ip;
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	
	
	@DataProvider(name = "TNDATA")
	public static Object[][] readDataFromExcelSheet() throws Exception {
		Object[][] data = HowToReadFromExcel.readFromExcelSheetTutorialsNinja("LoginTN");
		return data;
		
	}
	
	@DataProvider(name = "REDIFFDATA")
	public static Object[][] readFromExcelSheetRediff() throws Exception {
		Object[][] data = HowToReadFromExcel.readFromExcelSheetTutorialsNinja("LoginRediff");
		return data;
		
	}
	
	public static Object[][] readFromExcelSheetTutorialsNinja(String sheetName) throws Exception {
		//Step 5 - Create the Object of FileInputStream class and in the constructor pass path of Excel sheet
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023_DataDrivenTesting\\ExcelDataCode.xlsx");
	
		System.out.println("My user directory is: " + System.getProperty("user.dir"));
		
		
		//Step 6 - We have to create the Object of XSSFWorkbook class and pass the ip in it's constructor
		workbook = new XSSFWorkbook(ip);
		
		//Step 7 - using the reference workbook we will call the method known as getSheet("sheetName")
		sheet = workbook.getSheet(sheetName);
		
		//Step 8 - Once sheet is created we need to define rows and cols
		
		//first we will define row
		int rows = sheet.getLastRowNum(); //no of rows
		int cols = sheet.getRow(0).getLastCellNum(); // no of cols
		
		//Step 9 - We have to create a 2-Dimensional Object Array
		
		Object[][] data = new Object[rows][cols];
		for(int i=0 ; i<rows ; i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0 ; j<cols ; j++) {
				XSSFCell cell = row.getCell(j);
				
		//Step 10 - We have to determine the cellType or the datatype stored inside each cell
				
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
	

	public static Object[][] readFromExcelSheetRediff(String sheetName) throws Exception {
		//Step 5 - Create the Object of FileInputStream class and in the constructor pass path of Excel sheet
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\automation_22_Aug_2023_DataDrivenTesting\\ExcelDataCode.xlsx");
	
		//Step 6 - We have to create the Object of XSSFWorkbook class and pass the ip in it's constructor
		workbook = new XSSFWorkbook(ip);
		
		//Step 7 - using the reference workbook we will call the method known as getSheet("sheetName")
		sheet = workbook.getSheet(sheetName);
		
		//Step 8 - Once sheet is created we need to define rows and cols
		
		//first we will define row
		int rows = sheet.getLastRowNum(); //no of rows
		int cols = sheet.getRow(0).getLastCellNum(); // no of cols
		
		//Step 9 - We have to create a 2-Dimensional Object Array
		
		Object[][] data = new Object[rows][cols];
		for(int i=0 ; i<rows ; i++) {
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0 ; j<cols ; j++) {
				XSSFCell cell = row.getCell(j);
				
		//Step 10 - We have to determine the cellType or the datatype stored inside each cell
				
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

