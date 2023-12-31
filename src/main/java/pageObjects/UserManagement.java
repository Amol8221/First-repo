package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class UserManagement extends TestBase{

	public UserManagement(WebDriver driver) {
		PageFactory.initElements( driver,this);
		this.driver=driver;
		
	}
	
	@FindBy(xpath="(//div[@class='css-4g6ai3'])[2]")
      private static WebElement usermanagement;
	
	@FindBy(xpath="//button//p[text()='Add New User']")
	 private static WebElement adduserbutton;
	@FindBy(xpath="//input[@placeholder='Employee ID']")
	 private static WebElement Employee_ID;
	@FindBy(xpath="//div//h2[text()='User Management']")
	private static WebElement Usermanagetext;
	
	public void Usermanagementop() throws InterruptedException {
		//Thread.sleep(1000);
		usermanagement.click();
	}
	public void usertext() {
	String text=	Usermanagetext.getText();
		System.out.println(text);
	}
}
