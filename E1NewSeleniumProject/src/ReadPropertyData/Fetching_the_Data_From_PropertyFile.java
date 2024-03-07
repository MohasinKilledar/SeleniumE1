package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fetching_the_Data_From_PropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		//Create the object of fileinput stream
		FileInputStream fis = new FileInputStream("./data/config.properties");

		//Create the object of properties file
		Properties prop = new Properties();
		
		//load all the keys
		prop.load(fis);

		// use get proerty method
		String data = prop.getProperty("username");

		System.out.println(data);

		System.out.println(prop.getProperty("url"));

	}

}
