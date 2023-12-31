package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.UserDashboard;
import pageObjects.UserManagement;
import utils.TextContext;

public class UserDashboardstep {
	public WebDriver driver;
	TextContext testcontextsetup;
	PageObjectManager pageobjectmanager;
	Loginpage login;
	Homepage homepage;
	UserManagement  usermanage;
	UserDashboard dash;
	public UserDashboardstep(TextContext testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	@When("User Click on the UserDashboard")
	public void user_click_on_the_user_dashboard() throws Exception {
		Thread.sleep(2000);
	  dash=testcontextsetup.pageObjectManager.getuser();
	  dash.userdashord();
	}

	@Then("User Land on the user dashboard")
	public void user_land_on_the_user_dashboard() {
	  System.out.println("UserDashboard");
	}

	@When("User View the Verfier data")
	public void user_view_the_verfier_data() throws InterruptedException {
		Thread.sleep(2000);
		 dash=testcontextsetup.pageObjectManager.getuser();
		 dash.verifier();
	}

	@Then("User view Verfier data sucessfully")
	public void user_view_verfier_data_sucessfully() {
	   System.out.println("verifier");
	   dash=testcontextsetup.pageObjectManager.getuser();
	   dash.dashboardtext();
	}
	
}
