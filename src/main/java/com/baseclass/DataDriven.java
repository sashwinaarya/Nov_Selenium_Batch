package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main(String[] args) throws IOException {		
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\Desktop\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt=wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {
			
			String stringCellValue = cell.getStringCellValue();
			
			System.out.println(stringCellValue);	
		}
		
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numeric_cell=cell.getNumericCellValue();
			
			int value=(int) numeric_cell; // narrowing
			
			System.out.println(numeric_cell);
		}
		
		
		int size = sheetAt.getPhysicalNumberOfRows();
		System.out.println(size);
		
		/////////////////////////////////////////////////////////////////

		for (int i = 0; i < size; i++) {
			
			
			Row row3 = sheetAt.getRow(i);
			int cell_cnt = row3.getPhysicalNumberOfCells();
			
			
			for (int j = 0; j < cell_cnt; j++) {
				
				Cell cell2 = row3.getCell(j);
				String stringCellValue = cell2.getStringCellValue();
				
				System.out.println(stringCellValue);
				
			}
			
			System.out.println();
		}
	
	}

}
