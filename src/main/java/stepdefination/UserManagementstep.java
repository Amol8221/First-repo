package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.UserManagement;
import utils.TextContext;

public class UserManagementstep {
	public WebDriver driver;
	TextContext testcontextsetup;
	PageObjectManager pageobjectmanager;
	Loginpage login;
	Homepage homepage;
	UserManagement  usermanage;
	public UserManagementstep(TextContext testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	@When("User Click on UserManagement option")
	public void user_click_on_user_management_option() throws Exception {
		Thread.sleep(3000);
		usermanage=testcontextsetup.pageObjectManager.getusermanage();
		usermanage.Usermanagementop();
		
	}

	@Then("User land on the Uermanagement page")
	public void user_land_on_the_uermanagement_page() throws InterruptedException {
	System.out.println("Usermanagement");
	usermanage=testcontextsetup.pageObjectManager.getusermanage();
	Thread.sleep(1000);
	usermanage.usertext();
	}

}
