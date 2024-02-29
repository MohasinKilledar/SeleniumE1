package HandllingPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadUsingAUTOIT {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		
		WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));
		Actions act = new Actions(driver);
		act.click(chooseFile).perform();
		
		Runtime.getRuntime().exec("./AutoITPrograms/ResumesamplePalash.exe");
		
		
		
		
	}

}
