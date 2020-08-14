package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_01 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.phptravels.net/home");
		//Click on Checkin option 
		driver.findElement(By.id("checkin")).click();
		Thread.sleep(4000);
		//Select current Date
		driver.findElement(By.xpath("(//div[contains(@class,'-current-')])[1]")).click();
		
		System.out.println( "ok");

	}

}
