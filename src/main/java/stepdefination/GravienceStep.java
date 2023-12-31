package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import pageObjects.Graviaence;
import utils.TextContext;

public class GravienceStep {

	public WebDriver driver;
	TextContext testcontextsetup;
	PageObjectManager pageobjectmanager;
	Graviaence gravience;
	
	public GravienceStep(TextContext testcontextsetup) {
		this.testcontextsetup=testcontextsetup;
	}
	@When("User Click on the Graviance Option")
	public void user_click_on_the_graviance_option()  throws InterruptedException {
		Thread.sleep(1000);
		gravience=testcontextsetup.pageObjectManager.getgraviaence();
		gravience.gravience();
	}

	@Then("User land on Graviance page sucessfully")
	public void user_land_on_graviance_page_sucessfully()  throws InterruptedException {
		Thread.sleep(1000);
		gravience=testcontextsetup.pageObjectManager.getgraviaence();
		gravience.text();
		
	}
}
