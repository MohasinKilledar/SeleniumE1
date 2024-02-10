package Handlling_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedoptions_Method {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");

		WebElement multiselectDD = driver.findElement(By.id("menu"));
		Select ops = new Select(multiselectDD);

		for (int i = 2; i <= 4; i++) {
			ops.selectByIndex(i);
		}

		List<WebElement> allselectedOpt = ops.getAllSelectedOptions();
		for (WebElement we : allselectedOpt) {
			String selectedOpt = we.getText();
			System.out.println(selectedOpt);
		}

	}

}
