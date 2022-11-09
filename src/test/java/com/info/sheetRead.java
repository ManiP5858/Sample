package com.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sheetRead {


	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Name\\Excel Formate\\Day3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
	    Sheet sheet = workbook.getSheet("Sheet1");
	    
	    for(int j=0;j<sheet.getPhysicalNumberOfRows();j++) {
	    Row row = sheet.getRow(j);
      
	    for (int i=0;i<row.getPhysicalNumberOfCells();i++) {
		  Cell cell = row.getCell(i);
		  CellType cellType = cell.getCellType();
		  
		  switch (cellType) {
		case STRING:
			String name = cell.getStringCellValue();
			System.out.println(name);
			
			break;
			
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				String format = dateFormat.format(dateCellValue);
				System.out.println(format);
				
				
			}
			double d = cell.getNumericCellValue();
			
			BigDecimal b = BigDecimal.valueOf(d);
			String num = b.toString();
			System.out.println(num);
		
			break;

		default:
			break;
		}
		  
	
		  
		  
	    }
	    }
	    
	    
		  
	    
	    
	    
	    
	    
	    
	    
	    
}
}