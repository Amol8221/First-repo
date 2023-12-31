package utils;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends TestBase {
public static WebDriver driver;

static TestBase manager;
public Hooks(TestBase manager) {
	this.manager=manager;
	//this.driver=driver;
}

	@Before
	public  void openbrowser() throws IOException {
		
		manager.WebDriverManager();
	}
	@After
	public static void tearDown(Scenario scenario) {

		//validate if scenario has failed
		if(scenario.isFailed()) {
			 byte[] screenshot = ((TakesScreenshot) manager.driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			try {
				manager.driver.close();
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
	//	manager.CloseDriver();
	}
}
	
	

