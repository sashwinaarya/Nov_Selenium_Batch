package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {

	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Nandhini Varadhan\\Desktop\\Datadriven.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet st = wb.createSheet("Project");
		Row rw = st.createRow(0);
		
		Cell cl = rw.createCell(0);
		
		cl.setCellValue("Students Name");
	
		
		wb.getSheet("Project").createRow(1).createCell(0);
		wb.getSheet("Project").createRow(2).createCell(0);
		wb.getSheet("Project").createRow(3).createCell(0);
		
		wb.getSheet("Project").getRow(1).createCell(0).setCellValue("Anu");
		wb.getSheet("Project").getRow(2).createCell(0).setCellValue("Babu");
		wb.getSheet("Project").getRow(3).createCell(0).setCellValue("Sana");

		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		System.out.println("=========== Completed ==================");

	}
}
