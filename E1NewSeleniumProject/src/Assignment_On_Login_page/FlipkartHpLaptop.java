package Assignment_On_Login_page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartHpLaptop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("HP Laptop", Keys.ENTER);
		Thread.sleep(2000);

		WebElement brandName = driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']"));
		brandName.click();
		Thread.sleep(2000);

		WebElement brandName1 = driver.findElement(By.xpath("//div[text()='HP' and @class ='_3879cV']"));
		brandName1.click();
		Thread.sleep(2000);

		WebElement corei5 = driver.findElement(By.xpath("//div[@class='_3879cV' and text() ='Core i5']"));
		corei5.click();
		Thread.sleep(2000);

		WebElement Rambutton = driver.findElement(By.xpath("//div[text() ='RAM Capacity']"));
		Rambutton.click();
		Thread.sleep(2000);

		WebElement Ramcapacity = driver.findElement(By.xpath("//div[text() ='8 GB']"));
		Ramcapacity.click();
		Thread.sleep(2000);

		List<WebElement> laptopopt = driver.findElements(By.xpath("//div[@class='_4rR01T' ]"));

		List<WebElement> laptoprice = driver.findElements(By.xpath(
				"//div[@class='_4rR01T' ]/../following-sibling::div[@class='col col-5-12 nlI3QM']//div[@class='_30jeq3 _1_WHN1']"));

		for (int i = 0; i < laptopopt.size(); i++) {
			String ops = laptopopt.get(i).getText();

			for (int j = i; j <= i; j++) {
				String price = laptoprice.get(j).getText();
				System.out.print(ops + " : " + price );
				Thread.sleep(2000);
			}
			System.out.println("");

		}

	}

}
