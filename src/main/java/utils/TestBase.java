package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TestBase extends BasePage {

	public static WebDriver driver;

	public WebDriver WebDriverManager() throws IOException {
		// FileInputStream fis = new
		// FileInputStream(System.getProperty("user.dir")+"//src//test//resources//resources//global.properties");
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "//src/test/resources_/global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("Url");
		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				//WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);

			}
			if (prop.getProperty("browser") == "firefox") {
				// firefox
			}
			driver.manage().window().maximize();
			driver.get(url);
		}

		return driver;
	}
	public WebDriver CloseDriver() {
		
		driver.close();
		driver.quit();
		return driver;
	}
	
}

