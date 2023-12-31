package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BasePage;
import utils.TestBase;


public class Loginpage  extends TestBase {
	public WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		//super(driver);
		PageFactory.initElements( driver,this);
		
		this.driver=driver;
		}

		@FindBy(xpath="//div//input[@type='number']")
		private static WebElement MobileNumber;
		@FindBy(xpath="//button[@type='button' and text()='Get OTP']")
		private static WebElement Getotpbutton;
		@FindBy(xpath="//div//p[text()='An OTP has been sent on']/..//input")
		private static List<WebElement> EnterOtp;
		@FindBy(xpath="//div[@id='chakra-toast-manager-top-right']")
		private static WebElement errormessage;
		@FindBy(xpath="//div//p[text()='Logout']")
		private static WebElement logout;
		@FindBy(xpath="//div//p[text()='ADMIN PORTAL']")
		private static WebElement admintext;

		public void first(String num1) {
			MobileNumber.sendKeys(Keys.ENTER);
			MobileNumber.sendKeys(num1);
		//	Getotpbutton.click();
		}
		public void getotp() {
			Getotpbutton.click();
		}
		public void otpenter(String num2) {
			char[] h=num2.toCharArray();
			 int i=0;

			 for(char c: h) {

			//	 EnterOtp.get(i).sendKeys(String.valueOf(c));

				 EnterOtp.get(i).sendKeys(String.valueOf(c));
				 i++;
				 // Thread.sleep(1000);

			 }
		}
		public void ErrorMessage() {
			String error=errormessage.getText();
			System.out.println(error);
		}

		public void logout() {
			logout.click();
			
		}
		public void admin_text() {
			admintext.click();
		}
	}



