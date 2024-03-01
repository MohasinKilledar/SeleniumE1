package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	// This Class is used to store all the generic reusable Method.
	//All the methods are non-static method
	
	
	//This method is used to read data from excel file
	public String readExcelData(String excelPath, String sheetname, int rowNo, int cellNo) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);// To provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
		Sheet sheet = wb.getSheet(sheetname);// To get into the desired sheet
		Row row = sheet.getRow(rowNo);// To get into the desired row
		Cell cell = row.getCell(cellNo);// To get into the desired cell
		String data = cell.getStringCellValue();// To read the data from the cell
		return data;

	}
	
	
	//This method is used to get the no. of rows from a perticular sheet
	public int getRowCount (String excelPath, String sheetname ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// To provide the path of excel file
		Workbook wb = WorkbookFactory.create(fis);// to make the file ready to read
		Sheet sheet = wb.getSheet(sheetname);//To get into the desired sheet
		int rc = sheet.getLastRowNum();// To get the no. of rows froma sheet
		return rc;
		
	}
	
	
	//This method is used to right the data into excel file
	public void rightExcelData(String excelPath , String sheetname , int rowNo , int cellNo, String data) throws EncryptedDocumentException, IOException
	{
	
	FileInputStream fis = new FileInputStream(excelPath);// To provide the path of excel file
	Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read
	Sheet sheet = wb.getSheet(sheetname);// To get into the desired sheet
	Row row = sheet.getRow(rowNo);// To get into the desired row
	Cell cell = row.getCell(cellNo);// To get into the desired cell
	cell.setCellValue(data);// To pass the string data to the desired cell
	
	FileOutputStream fos = new FileOutputStream(excelPath);
	wb.write(fos);
		
		
	}

}
