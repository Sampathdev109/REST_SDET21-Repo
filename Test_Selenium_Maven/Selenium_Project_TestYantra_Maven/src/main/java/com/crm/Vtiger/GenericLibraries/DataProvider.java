package com.crm.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider {

	WebDriverUtility WebLib = new WebDriverUtility();
	ExcelFileUtility ExcelLib = new ExcelFileUtility();
	
	public Object[][] getExcelTestData(String sheetname) throws Throwable, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(IpathConstants.);
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetname);
		int lastrow = sheet.getLastRowNum();
		int lastcell = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object [lastrow][lastcell];

		for(int i = 0; i<lastrow;i++) {
		for(int j = 0; j<lastcell;j++) {

		data [i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
		}

		}
		return data;

		}

}
