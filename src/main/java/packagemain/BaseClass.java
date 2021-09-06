package packagemain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class BaseClass {
	protected Properties prop;

	public BaseClass() throws IOException {
		prop = new Properties();

		String filepath = System.getProperty("user.dir") + "\\config.properties";

		FileInputStream fis = new FileInputStream(filepath);

		prop.load(fis);
	}

}
