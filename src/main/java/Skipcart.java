import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Skipcart {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pilotexpress.skipcart.com/user/profile");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(" akashexpress@yopmail.com");
	
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("India@1234");
	
		driver.findElement(By.xpath("//div//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a [@id='profile']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block center btn-update ng-star-inserted']")).click();
		WebElement name=driver.findElement(By.xpath("//div//input[@placeholder='Name']"));
		
		name.sendKeys("Akash Ballal");
	//	WebDriverWait wait = new WebDriverWait(driver,Duration. ofSeconds(0));
		//WebElement cc=	driver.findElement(By.xpath("//input[@data-elements-stable-field-name='cardNumber']"));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-elements-stable-field-name='cardNumber']"))).click();
//		Thread.sleep(1000);
//		Actions aa= new Actions(driver);
//		//WebElement b=driver.findElement(By.xpath("//input[@placeholder='Card number']"));
//		WebElement h=	driver.findElement(By.cssSelector(".form-group.col-md-12.mt-4.text-right"));
//		aa.moveToElement(h).click();
		
		//a.moveToElement((By.xpath("//div[@name='field StripeElement StripeElement--empty']")).
	
		//System.out.println("enable"+bb);
		//WebElement h=	driver.findElement(By.cssSelector(".form-group.col-md-12.mt-4.text-right"));
		//bb.isEnabled();
		//bb.sendKeys(Keys.TAB);
		WebElement k=driver.findElement(By.xpath("//div//iframe[@frameborder='0']"));
	//wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div//iframe[@name='__privateStripeFrame64513']")));
	//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-elements-stable-field-name='cardNumber']"))).sendKeys("98761234567898");
		driver.switchTo().frame(k);
		System.out.println("switch on frame");
//		System.out.println(cc);
//		
		
		WebElement g=driver.findElement(By.xpath("//input[@data-elements-stable-field-name='cardNumber']"));
		g.click();
		Thread.sleep(1000);
		g.sendKeys("447687237823678");
		WebElement t=driver.findElement(By.xpath("//span//input[@name='exp-date']"));
		t.click();
		Thread.sleep(1000);
		t.sendKeys("1123");
		Thread.sleep(1000);
		WebElement u=driver.findElement(By.xpath("//span//input[@placeholder='CVC']"));
		u.sendKeys("123");
		Thread.sleep(1000);
		WebElement uu=driver.findElement(By.xpath("//input[@name='postal']"));
		uu.sendKeys("12345");
		driver.findElement(By.xpath("//button[text()='Add']"));
		
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated.frame_to_be_available_and_switch_to_it((By.xpath("iframe_xpath"));
//		WebDriverWait(driver, 20).until(EC.element_to_be_clickable((By.XPATH, "//input[@data-fieldtype='encryptedCardNumber' and @aria-label='Champ du numéro de carte']"))).send_keys("1234567890")
	}
}

