package Handlling_Dropdowns;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSet_Removeduplicatevalue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///C:/Users/karis/OneDrive/Desktop/Web%20Element/Multipleselectdropdown.html");

		WebElement multiselectDD = driver.findElement(By.id("menu"));

		Select sel = new Select(multiselectDD);// To create the object of select

		// To remove the duplicates
		TreeSet<String> ts = new TreeSet<String>();// To create the object of Treeset

		List<WebElement> options = sel.getOptions();// to get the list of all the options

		for (WebElement we : options) {
			String ops = we.getText();
			ts.add(ops);

		}
		for (String t : ts) {
			System.out.println(t);
		}

	}

}
