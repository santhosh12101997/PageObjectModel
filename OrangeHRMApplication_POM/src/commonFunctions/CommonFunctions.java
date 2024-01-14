package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static Properties properties = null;
	public static WebDriver driver = null;

	Logger logger = Logger.getLogger(CommonFunctions.class);
	public Properties loadPropertyFile() {
		try {
			FileInputStream fileInputStream = new FileInputStream("config.properties");
			properties = new Properties();
			properties.load(fileInputStream);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM Test Project");
		logger.info("Loading the Property file");
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void tearDown() {
//		driver.quit();
	}
}
