package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.Graviaence;
import pageObjects.Homepage;
import pageObjects.Loginpage;
import pageObjects.UserDashboard;
import pageObjects.UserManagement;
import utils.BasePage;

public class PageObjectManager extends BasePage {

	
	private WebDriver driver;
	private Loginpage loginpage;
	private Homepage homepage;
	private UserManagement usermanage;
	private UserDashboard user;
	private Graviaence gravience;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public Loginpage getLoginpage(){

		return (loginpage == null) ? loginpage = new Loginpage(driver) : loginpage;

	}
	public Homepage  getHomepage(){

		return (homepage == null) ? homepage = new Homepage(driver) : homepage;

	
	
}
	public UserManagement getusermanage() {
		return (usermanage ==null) ?  usermanage=new UserManagement(driver) : usermanage ;
		
	}
	public UserDashboard getuser() {
		return (user ==null)  ?   user=new UserDashboard(driver) : user;
		
	}
	public Graviaence getgraviaence() {
		return (gravience ==null) ? gravience=new Graviaence(driver) : gravience;
	}
	
	
}