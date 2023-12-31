package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import managers.PageObjectManager;
import utils.BasePage;

import utils.TextContext;

public class LoginStep extends BasePage {
	public WebDriver driver;
	TextContext testcontextsetup;
	PageObjectManager pageobjectmanager;
	Loginpage login;
	Homepage homepage;
	
public LoginStep(TextContext testcontextsetup) {
	this.testcontextsetup=testcontextsetup;
}
	
	

@Given("User Launch the browser")
public void user_launch_the_browser() {
	
   System.out.println("browser chrome");
}

@When("User Enter the Mobile Number {string} and send the otp")
public void user_enter_the_mobile_number_and_send_the_otp(String string) throws InterruptedException {
	Thread.sleep(2000);
	login=testcontextsetup.pageObjectManager.getLoginpage();
	
   login.first(string);
   login.getotp();
}

@When("User Enter the OTP as {string}  and verify")
public void user_enter_the_otp_as_and_verify(String string) throws InterruptedException {
	Thread.sleep(2000);
	login=testcontextsetup.pageObjectManager.getLoginpage();
 login.otpenter(string);
}

@Then("Verify user land on Homepage")
public void verify_user_land_on_homepage() {
   System.out.println("user on homepage");
}
@When("User view the error message")
public void user_view_the_error_message() throws InterruptedException {
	login=testcontextsetup.pageObjectManager.getLoginpage();
	Thread.sleep(1000);
	login.ErrorMessage();
}
@Then("user view errormessage")
public void user_view_errormessage() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();


}
@When("User Logout Sucessfully")
public void user_logout_sucessfully() throws Exception {
	Thread.sleep(2000);
	login=testcontextsetup.pageObjectManager.getLoginpage();
	login.logout();
}

@Then("User land on loginpage sucessfully")
public void user_land_on_loginpage_sucessfully() throws Exception {
	Thread.sleep(1000);
	login=testcontextsetup.pageObjectManager.getLoginpage();
	login.admin_text();
}

}
