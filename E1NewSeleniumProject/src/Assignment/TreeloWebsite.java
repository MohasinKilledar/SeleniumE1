package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TreeloWebsite {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://trello.com/u/mohasinmakatumkilledar/boards");

		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		login.click();
		driver.findElement(By.id("user")).sendKeys("mohseenkilledar@gmail.com", Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Mohasin@123");
		driver.findElement(By.id("login-submit")).click();

		driver.findElement(By.xpath("//div[@title='E1']")).click();
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		WebElement sqlsource = driver.findElement(By.xpath("//a[text()='SQL']"));
		WebElement sqltarget = driver.findElement(By.xpath("//h2[text()='Mock Done']"));
		act.dragAndDrop(sqlsource, sqltarget).perform();

		WebElement javasource = driver.findElement(By.xpath("//a[text()='Java']"));
		WebElement javatarget = driver.findElement(By.xpath("//h2[text()='Mock Done']"));
		act.dragAndDrop(javasource, javatarget).perform();

		WebElement manualsource = driver.findElement(By.xpath("//a[text()='Manual Testing']"));
		WebElement manualtarget = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		act.dragAndDrop(manualsource, manualtarget).perform();

		WebElement apisource = driver.findElement(By.xpath("//a[text()='API Testing']"));
		WebElement apitarget = driver.findElement(By.xpath("//h2[text()='Mock Pending']"));
		act.dragAndDrop(apisource, apitarget).perform();

		WebElement selsource = driver.findElement(By.xpath("//a[text()='Selenium']"));
		WebElement seltarget = driver.findElement(By.xpath("//h2[text()='Mock Schedule']"));
		act.dragAndDrop(selsource, seltarget).perform();

		act.contextClick(selsource).perform();
		Thread.sleep(2000);
		

		List<WebElement> sel = driver.findElements(By.xpath("//div[ @data-testid= 'quick-card-editor-buttons']"));

		for (int i = 0; i < sel.size(); i++) {

			System.out.println(sel.get(i).getText());

		}
		WebElement save = driver.findElement(By.xpath("//button[@type='submit']"));
		act.click(save).perform();

		System.out.print("------------------------------------------------------------------------");
		System.out.println();
		Thread.sleep(2000);

		act.contextClick(apisource).perform();
		List<WebElement> api = driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));

		for (int i = 0; i < api.size(); i++) {

			System.out.println(api.get(i).getText());

		}
		WebElement saveapi = driver.findElement(By.xpath("//button[@type='submit']"));
		act.click(saveapi).perform();
		System.out.print("------------------------------------------------------------------------");
		System.out.println();
		Thread.sleep(2000);

		act.contextClick(manualsource).perform();
		List<WebElement> manual = driver.findElements(By.xpath("//div[@data-testid='quick-card-editor-buttons']"));

		for (int i = 0; i < manual.size(); i++) {

			System.out.println(manual.get(i).getText());

		}
		WebElement savemanual = driver.findElement(By.xpath("//button[@type='submit']"));
		act.click(savemanual).perform();
		System.out.print("------------------------------------------------------------------------");
		System.out.println();
		Thread.sleep(2000);
	}
	

}
