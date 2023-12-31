

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Second {
public static void main(String[] args) throws InterruptedException {
	

	//System.setProperty("webdriver.chrome.driver", "/Users/lp-468/Downloads/chromedriver-mac-arm64/chromedriver");
	

	WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
        
	 driver.get("https://bima-vahak.zopper.info/admin/login");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// Thread.sleep(2000);
	WebElement dd= driver.findElement(By.xpath("//div//input[@type='number']"));
	//WebElement dd= driver.findElement(By.xpath("//div//input[@placeholder='+91']"));
	//dd.click();
	dd.sendKeys(Keys.ENTER);
	dd.sendKeys("9990290033");
	 driver.findElement(By.xpath("//button[@type='button' and text()='Get OTP']")).click();
	// driver.findElement(By.xpath(""))
	 dd.sendKeys(Keys.ENTER);
	 dd.clear();
		//dd.sendKeys("99992905712");
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1500));
	// Thread.sleep(1000);
	// driver.findElement(By.xpath("//input[@type='tel'][1]")).sendKeys("1");
	// Thread.sleep(1000);
	// driver.findElement(By.xpath("//div[@class='chakra-stack css-1q7jsje']")).click();
	 Thread.sleep(1000);
	// WebElement  otp1= driver.findElement(By.xpath("//div[@id='toast-error-title']"));
	// System.out.println(otp1.getText());
	 List <WebElement>  otp= driver.findElements(By.xpath("//div//p[text()='An OTP has been sent on']/..//input"));
	// List<String> strings = new ArrayList<String>();
	// char[]a=strings.toArray()
	String as="123456";
	char[] h=as.toCharArray();
	 int i=0;
	
	 for(char c: h) {
		
	  otp.get(i).sendKeys(String.valueOf(c));
		 i++;
		 // Thread.sleep(1000);
			
	 }
	 
//	 WebElement a= driver.findElement(By.xpath("//div[@id='toast-error-description']"));
//	 System.out.println(a.getText());
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//div[@class='css-16nllqz']")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath(("//div//button[@type='button' and text()='Apply']"))).click();
	// driver.findElement(By.xpath("//div[@class=' css-1xa1gs2")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div//p[text()='Logout']")).click();
	WebElement drop=driver.findElement(By.xpath("//div//input[@class=' css-1sxym9q' and @role='combobox' ]"));
	 Thread.sleep(2000);
	drop.sendKeys(Keys.ENTER);
	drop.sendKeys("Maharashtra");
	drop.sendKeys(Keys.TAB);
//	  WebElement text=driver.findElement(By.xpath("//div//p[@class='chakra-text css-qzpu01']"));
//	 System.out.println("user name:"+text.getText());
	// driver.quit();
//	 WebElement graph= driver.findElement(By.xpath("//div[@class='css-p001fh']"));
//	 System.out.println(graph.getText());
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("(//div[@class='css-4g6ai3'])[2]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div/button[@aria-label='Edit']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//div//input[@placeholder='Enter name']")).sendKeys("sharma");
	 driver.findElement(By.xpath("//div/button[@type='submit']")).click();
//	 driver.findElement(By.xpath("//button//p[text()='Add New User']")).click();
//	 Thread.sleep(1000);
//	 driver.findElement(By.xpath("//input[@placeholder='Employee ID']")).sendKeys("S1905");
//	WebElement aa= driver.findElement(By.xpath("//input[@class=' css-1sxym9q']"));
//	//aa.click();
//	aa.sendKeys(Keys.ENTER);
//	aa.sendKeys("Verifier");
//	aa.sendKeys(Keys.TAB);
//	 driver.findElement(By.xpath("//div//input[@placeholder='Enter name']")).sendKeys("Anvit Jain");
//	 driver.findElement(By.xpath("//div//input[@placeholder='Enter mobile number']")).sendKeys("9862798372");
//	 driver.findElement(By.xpath("//div//input[@placeholder='Enter email']")).sendKeys("anvit.jain23@gmail.com");
//	 Thread.sleep(1000);
//	 WebElement in= driver.findElement(By.xpath("(//div[@class=' css-14c34nk'])[2]"));
//	 in.click();
//	//WebElement inn= driver.findElement(By.xpath("//input[@id='field-:r2j:']"));
//	 WebElement inn= driver.findElement(By.xpath("//div//input[@aria-describedby='react-select-8-placeholder' and@ type='text']"));
//	 Thread.sleep(1000);
//		//inn.sendKeys(Keys.ENTER);
//	 
//		inn.sendKeys("Maharashtra");
//		
//	inn.sendKeys(Keys.ENTER);
//	 
	 
	 
}
	 
	 

}