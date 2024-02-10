package Assignments_On_Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Signup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dayDD = new Select(day);
		boolean result = dayDD.isMultiple();
		System.out.println("Day Dropdown is multiple DropDown ? " +result);
		
		List<WebElement> dayAllElement = dayDD.getOptions();
		
		for(WebElement we :dayAllElement )
		{
			System.out.println(we.getText());
		}
		dayDD.selectByIndex(25);
		System.out.print("-------------------------------------------------------------------------");
		System.out.println();
		
		Select monthDD = new Select(month);
		boolean result2 = monthDD.isMultiple();
		System.out.println("Month Dropdown is multiple DropDown ? "+result2);
		
		List<WebElement> monthAllElement = monthDD.getOptions();
		
		for(WebElement we :monthAllElement )
		{
			
			System.out.println(we.getText());
		}
		
		monthDD.selectByValue("5");
		System.out.print("----------------------------------------------------------------------------");
		System.out.println();
		
		Select yearDD = new Select(year);
		System.out.println("Year Dropdown is multiple Dropdown ?  " +yearDD.isMultiple());
		
		List<WebElement> allYearElement = yearDD.getOptions();
		for(WebElement we :allYearElement )
		{
			String result3 = we.getText();
			System.out.println(result3);
			
		}
		yearDD.selectByVisibleText("1995");

	}

}
