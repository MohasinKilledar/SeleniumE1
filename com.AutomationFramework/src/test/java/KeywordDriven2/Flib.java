package KeywordDriven2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {

	public String getPropertyData(String path, String key) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;

	}

}
