package Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Cookie;

public class HandellingCookies {

	public static void main(String[] args) {
		
		
		
		WebDriver driver; 
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		driver=new ChromeDriver(co); 
		driver.get("https://www.facebook.com");
		//Enter Email id and Password if you are already Registered user 
		driver.findElement(By.id("email")).sendKeys("9975240557"); 
		driver.findElement(By.id("pass")).sendKeys("Mohasin@123"); 
		driver.findElement(By.name("login")).click(); 
		// Create a file to store Login Information 
		File file = new File("Cookiefile.data"); 
		
		try{ 
		// Delete old file if already exists
		file.delete(); 
		file.createNewFile(); 
		FileWriter file1 = new FileWriter(file); 
		
		BufferedWriter Bwritecookie = new BufferedWriter(file1); //Getting the cookie information 
		for(Cookie ck : driver.manage().getCookies()) { 
		Bwritecookie.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure())); 
		Bwritecookie.newLine(); 
		} 
		Bwritecookie.close(); 
		file1.close(); 
		}
		catch(Exception ex) 
		{ 
		ex.printStackTrace(); 
		} 
		} 


}


