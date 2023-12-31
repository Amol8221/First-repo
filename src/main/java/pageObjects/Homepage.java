package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.TestBase;

public class Homepage extends TestBase {

	public Homepage(WebDriver driver) {
PageFactory.initElements( driver,this);
		
		this.driver=driver;
		
	}
	
	@FindBy(xpath="//div[@class='css-16nllqz']")
	private static WebElement calender;
	@FindBy(xpath="//div//button[@type='button' and text()='Apply']")
	private static WebElement calenderapply;
	
	@FindBy(xpath="//div//p[@class='chakra-text css-qzpu01']")
	private static WebElement username;
	
	@FindBy(xpath="//div//input[@class=' css-1sxym9q' and @role='combobox' ]")
	private static WebElement dropdown;
	@FindBy(xpath="//div//p[@class='chakra-text css-qzpu01']")
	private static WebElement hometext;
	public void calender() {
		calender.click();
	}
	public void statedropdown(String state) throws InterruptedException {
		Thread.sleep(3000);
		dropdown.sendKeys(Keys.ENTER);
		
		dropdown.sendKeys(state);
		Thread.sleep(1000);
		dropdown.sendKeys(Keys.TAB);
	}
	public void Username() {
		String user_name=username.getText();
		System.out.println("user name is:"+user_name);
	}
	public void calenderapply() {
		calenderapply.click();
	}
	
	public void hometext() {
		String d= hometext.getText();
		System.out.println(d);
	}
	
	
	
}
