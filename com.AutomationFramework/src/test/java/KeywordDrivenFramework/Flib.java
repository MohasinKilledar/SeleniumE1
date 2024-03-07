package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	public String getDataFromProperty(String path, String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

	public String getDataFromExcel(String excelPath, String sheetName, int rowNo, int cellNo)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet(sheetName);

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(cellNo);

		String data = cell.getStringCellValue();

		return data;

	}

	public void rightExcelData(String excelPath, String sheetname, int rowNo, int cellNo, String data)
			throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNo);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelPath);
		wb.write(fos);

	}

	public int getRowCount(String excelPath, String sheetname) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;

	}

}
