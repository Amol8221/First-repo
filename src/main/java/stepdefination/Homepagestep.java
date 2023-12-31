package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import utils.TextContext;

public class Homepagestep {
	public WebDriver driver;
	TextContext testcontextsetup;
	PageObjectManager pageobjectmanager;
	Loginpage login;
	Homepage homepage;
	//public Homepagestep()
	public Homepagestep(TextContext testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	

	@When("User capture the admin name")
	public void user_capture_the_admin_name() {
//		homepage=testcontextsetup.pageObjectManager.getHomepage();
//		homepage.Username();
	}

	@When("User click on the deafault calender")
	public void user_click_on_the_deafault_calender() throws InterruptedException {
		Thread.sleep(2000);
		homepage=testcontextsetup.pageObjectManager.getHomepage();
		homepage.calender();
	}
	@When("User apply the calender calender")
	public void user_apply_the_calender_calender() throws InterruptedException {
		homepage=testcontextsetup.pageObjectManager.getHomepage();
		Thread.sleep(1000);
		homepage.calenderapply();
		
	}
	@When("User Select state  as {string}")
	public void user_select_state_as(String string)  throws InterruptedException {
		Thread.sleep(3000);
			homepage=testcontextsetup.pageObjectManager.getHomepage();
			homepage.statedropdown(string);
	}

	@Then("User verify the Homepage data")
	public void user_verify_the_homepage_data() {
		homepage=testcontextsetup.pageObjectManager.getHomepage();
		homepage.hometext();
	   System.out.println("pass");
	}

}
