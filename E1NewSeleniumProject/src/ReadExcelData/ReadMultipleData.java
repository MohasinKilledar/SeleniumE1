package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws IOException {

		for (int i = 1; i <= 10; i++) {

			FileInputStream fis = new FileInputStream("./data/testData.xlsx");// To provide the path of the excel file

			Workbook wb = WorkbookFactory.create(fis);// To make the file ready to read

			Sheet iplSheet = wb.getSheet("ipl");// To get into the sheet

			Row row = iplSheet.getRow(i);// To get into the row

			Cell cell = row.getCell(0);// to get into the cell

			String data = cell.getStringCellValue();// To read the data from the cell

			System.out.println(data);

		}

	}
}
