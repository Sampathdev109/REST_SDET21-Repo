//package com.crm.Vtiger.GenericLibraries;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//import org.apache.commons.compress.archivers.dump.InvalidFormatException;
//import org.apache.poi.sl.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
///**
// * This class is used to read data from "Excel" file
// * @author SAMPATHDEV
// *
// */
//public class ExcelFileUtility extends WebDriverUtility {
//
//	public String getDataFromExcel(String sheetName , int rowNum, int celNum) throws Throwable {
//		FileInputStream fis  = new FileInputStream(IpathConstants.ExcelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet(sheetName);
//		Row row = sh.getRow(rowNum);
//		Cell cell = row.getCell(celNum);
//		String data = row.getCell(celNum).getStringCellValue();
//		wb.close();
//		return data;
//	}
//	public String getintDataFromExcel(String sheetName , int rowNum, int celNum) throws Throwable {
//		FileInputStream fis  = new FileInputStream(IpathConstants.ExcelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = (Sheet) wb.getSheet(sheetName);
//		DataFormatter dataFormatter = new DataFormatter();
//		//String Value = dataFormatter.formatCellValue(sh.getRow(rowNum).getCell(celNum));
//	//	return Value;
//	}
//
////	public Object[][] getExcelTestData(String sheetname) throws Throwable, InvalidFormatException, IOException{
//		//FileInputStream fis = new FileInputStream(IpathConstants.ExcelPath);
//		//int lastrow=WorkbookFactory.create(fis).getSheet("Sheet1").getLastRowNum();
//		
//
//	//	Object[][] data = new Object [lastrow][2];
//
//		for(int i = 0; i<lastrow;i++) {
//			for(int j = 0; j<2;j++) {
//
//				data [i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
//			}
//
//		}
//		return data;
//
//	}
//
//
//}
//}
//
