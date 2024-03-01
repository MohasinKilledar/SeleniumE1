package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://127.0.0.1/login.do;jsessionid=16ktjefmb1m4b");
		
		Flib flib = new Flib();
		
		//String usnData = flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 0);
		//String pwdData = flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/testData.xlsx", "validcreds", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
