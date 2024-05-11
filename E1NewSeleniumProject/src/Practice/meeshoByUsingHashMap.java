package Practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meeshoByUsingHashMap {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		hm.put("wE", driver.findElement(By.xpath("//span[text()='Women Ethnic']")).getText());
		hm.put("ww",driver.findElement(By.xpath("//span[text()='Women Western']")) .getText());
		hm.put("m",driver.findElement(By.xpath("//span[text()='Men']")) .getText());
		
		
		for(Map.Entry m : hm.entrySet())
		{
			
			
			System.out.println(m.getKey()+ ":" +m.getValue());
		}
		
		
		
		
		
		
	}
	
	
	
	
	

}
