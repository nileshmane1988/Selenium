package UsingShotcuts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMsg {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		System.out.println("2");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("btnLogin")).click();
		
		boolean s1= driver.findElement(By.id("spanMessage")).isDisplayed();
		if(s1)
			System.out.println("error msg displayed");
		else
			System.out.println("error msg not displayed");
		
		System.out.println("program ended");
		
		

	}

}
