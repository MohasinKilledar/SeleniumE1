package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// To Specify the path of the e
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");
		
		// To make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet iplSheet = wb.getSheet("ipl");// To get into the sheet
		
		Row row = iplSheet.getRow(4);// To get into the row
		
		Cell cell = row.getCell(0);// to get into the cell
		
		String data = cell.getStringCellValue();// To read the data from the cell
		
		System.out.println(data);

	}

}
