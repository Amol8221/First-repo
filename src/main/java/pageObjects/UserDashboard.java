package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class UserDashboard extends TestBase {

	public UserDashboard(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
	}
	@FindBy(xpath="(//div[@class='css-4g6ai3'])[3]")
	private static WebElement userdashboard;
	@FindBy(xpath="//div//button[text()='Verifier']")
	private static WebElement Verifier;
	@FindBy(xpath="//div//h2[text()='User Dashboard']")
	private static WebElement text;
	public void userdashord() {
		userdashboard.click();
	}
	
	public void verifier() {
		Verifier.click();
	}
	public void dashboardtext() {
		String a=text.getText();
		System.out.println(a);
	}
}
