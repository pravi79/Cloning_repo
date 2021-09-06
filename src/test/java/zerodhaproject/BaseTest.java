package zerodhaproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import packagemain.Dashboard;
import packagemain.LoginPage;

public class BaseTest {

	static WebDriver driver;
	LoginPage lp;

	Dashboard db;

	@BeforeSuite
	public void initDriver() throws IOException {

//		System.setProperty("webdriver.chrome.driver", "E:\\Desktop\\VimanNagar\\May 21\\selenium\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
//		options.addArguments("--incognito");

//		options.addArguments("--headless");

		driver = new ChromeDriver(options);// recommended way to launch the browser

//		 driver.manage().window().maximize();// to maximize the window

		Properties prop = new Properties();

		String filepath = System.getProperty("user.dir") + "\\config.properties";

		FileInputStream fis = new FileInputStream(filepath);

		prop.load(fis);

		driver.get(prop.getProperty("testsiteurl"));

	}

	@BeforeClass
	public void objectCreation() throws IOException {
		lp = new LoginPage(driver);
		db = new Dashboard(driver);
	}

//	@AfterSuite
//	public void tearDown()
//	{
//		driver.close();
//		
//	}
}
