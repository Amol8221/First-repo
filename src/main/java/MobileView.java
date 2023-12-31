import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.Command;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

public class MobileView {

	public static void main(String[] args) throws InterruptedException {
		
		   
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();
        
        Map deviceMetrics = new HashMap()
        {{
            put("width", 412);
            put("height", 975);
            put("mobile", true);
            put("deviceScaleFactor", 50);
        }};
        driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
        
        driver.get("https://bima-vahak.zopper.info/admin/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement dd= driver.findElement(By.xpath("//div//input[@type='number']"));
    	//dd.click();
    	dd.sendKeys(Keys.ENTER);
    	dd.sendKeys("9990290033");
    	 driver.findElement(By.xpath("//button[@type='button' and text()='Get OTP']")).click();
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
    	 
}
}