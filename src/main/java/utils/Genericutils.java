package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Genericutils {
public WebDriver driver;
	public Genericutils(WebDriver driver) {
	
		this.driver = driver;
		}

		public void select_calander(String date2) {

			String dateArr[] = date2.split("-");
			String day = dateArr[0];
			String monthh = dateArr[1];
			String year = dateArr[2];

			WebElement month = driver.findElement(By.xpath("//select[@name='months']"));
			Select sel = new Select(month);
			sel.selectByVisibleText(monthh);

			WebElement sel_year = driver.findElement(By.xpath("//select[@name='years']"));
			Select select_year = new Select(sel_year);
			select_year.selectByVisibleText(year);
			driver.findElement(By.xpath("//td//button[text()='" + day + "']")).click();
			driver.findElement(By.xpath("//button[text()='OK']")).click();
		}

		public void Select_dropdown(String dropdown) {
			driver.findElement(By.xpath("(//div[contains(text(),'" + dropdown + "')])")).click();
		}

}
