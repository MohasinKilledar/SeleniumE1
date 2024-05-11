package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/ftx-solid-men-round-neck-multicolor-t-shirt/p/itm635c105adafe3?pid=TSHGEHZVEFQDHDW8&lid=LSTTSHGEHZVEFQDHDW894CNUJ&marketplace=FLIPKART&q=tshirts&store=clo%2Fash%2Fank&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_GhEl-9zK03cPmQzTHz3Lr0HXdKuEAfIhwRECrLpS9h83hJl-NKdRXC7nYkmnnM-7z871uKIHfGB1k7RrzoA4zQ%3D%3D&ppt=hp&ppn=homepage&ssid=l9ae689qu80000001712479349578&qH=ef093de8a644a886");
		//driver.switchTo().activeElement().sendKeys("mohseenkilledar@gmail.com");
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		//driver.findElement(By.partialLinkText("//a[text()='Inbox']")).click();
		driver.findElement(By.xpath("//li[@class='col col-6-12']")).click();

	}

}
