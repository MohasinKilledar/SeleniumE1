package Handlling_Dropdowns;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemovingDuplicateUsing_Hashset {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");

		WebElement multiselectDD = driver.findElement(By.id("menu"));

		Select sel = new Select(multiselectDD);// To create the object of select

		// To remove the duplicates
		HashSet<String> hs = new HashSet<String>();// To create the object of Hashset

		List<WebElement> options = sel.getOptions();// to get the list of all the options

		for (int i =0 ; i<options.size(); i++) {
			String textToInsert = options.get(i).getText();
			hs.add(textToInsert);
			

		}
		for (String text : hs) {
			System.out.println(text);
		}

	}

}
