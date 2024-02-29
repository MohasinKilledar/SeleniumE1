package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VAlidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("./data/testData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("validcreds");

		Row row = sheet.getRow(1);

		Cell cell = row.getCell(0);

		String usernameData = cell.getStringCellValue();

		FileInputStream fis1 = new FileInputStream("./data/testData.xlsx");

		Workbook wb1 = WorkbookFactory.create(fis1);

		Sheet sheet1 = wb1.getSheet("validcreds");

		Row row1 = sheet1.getRow(1);

		Cell cell1 = row1.getCell(1);

		String passwordData = cell1.getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=16ktjefmb1m4b");// Launch the actiTime

		driver.findElement(By.name("username")).sendKeys(usernameData);// To 
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		driver.close();

	}

}
