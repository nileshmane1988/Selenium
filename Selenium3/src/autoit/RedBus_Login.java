package autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus_Login {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("i-icon-profile")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("signInLink")).click();
		Thread.sleep(5000);
		//Switch from Main page to frame
		driver.switchTo().frame(0);
		//Enter Mobile Number
		driver.findElement(By.id("mobileNoInp")).sendKeys("986897897");
		
		
		
		
		
		
		
		

	}

}
