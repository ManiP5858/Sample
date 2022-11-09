package com.info;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class MyName {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Name\\Excel Formate\\Day3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
	    org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
	    
	    for(int j=0;j<sheet.getPhysicalNumberOfRows();j++) {
	    Row row = sheet.getRow(j);
      
	    for (int i=0;i<row.getPhysicalNumberOfCells();i++) {
		  Cell cell = row.getCell(i);
		  System.out.print(cell);
		  
		 	 
	    	
	    	
	    }
	   System.out.println("\n");
	    
	    	}
	}
}
