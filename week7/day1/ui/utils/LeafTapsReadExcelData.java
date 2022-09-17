package assignments.week7.day1.ui.utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeafTapsReadExcelData {

	public static String[][] getData(String excelFileName) throws IOException {
		
		// Locate and Open the excel file
		XSSFWorkbook book = new XSSFWorkbook("./test-data/"+excelFileName+".xlsx");
		//XSSFWorkbook book = new XSSFWorkbook("./test-data/tc002.xlsx");

		// Get into particular sheet
		XSSFSheet sheet = book.getSheetAt(0);
		
		
		// Get the total number of rows
		int rowNumber = sheet.getLastRowNum();
		System.out.println(rowNumber);

		// Get the total number of rows
		XSSFRow header = sheet.getRow(0);
		int colNumber = header.getLastCellNum();
		System.out.println(colNumber);	
		
		//Create a 2D array for storing the data
		String[][] data = new String[rowNumber][colNumber];
		
		DataFormatter formatter = new DataFormatter();
		
		//Iterate over the rows to get each row for each iteration
		for(int i = 1; i <= rowNumber; i++) {
		    XSSFRow eachRow = sheet.getRow(i);
		    for (int j = 0; j < colNumber;j++ ) {
			XSSFCell eachCell = eachRow.getCell(j);
			//String cellValue = eachCell.getStringCellValue();  
			String formatCellValue = formatter.formatCellValue(eachCell);	                    
		                    
		            	data[i-1][j] = formatCellValue;
				System.out.println(formatCellValue);	  
		
		    }
		}
		book.close();
		return data;

	    }

	}