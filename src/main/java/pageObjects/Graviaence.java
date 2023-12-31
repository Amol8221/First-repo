package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.BasePage;

public class Graviaence extends BasePage {

	public Graviaence (WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(xpath="(//div[@class='css-4g6ai3'])[4]")
	private static WebElement graviance ;
	@FindBy(xpath="//div//h2[text()='Grievances']")
	private static WebElement grviencetext;
	
	
	public void gravience() {
		graviance.click();
	}
	public void text() {
		String a=grviencetext.getText();
		System.out.println(a);
	}
}
