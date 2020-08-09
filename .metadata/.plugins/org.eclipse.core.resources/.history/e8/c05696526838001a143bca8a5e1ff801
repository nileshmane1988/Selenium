package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbReEmailIdVisiableOrNot {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	System.out.println("hiii");
	WebElement femail = driver.findElement(By.id("u_0_r"));
	femail.sendKeys("9420689338");
	
	WebElement reEmail = driver.findElement(By.id("u_0_u"));
	boolean status = reEmail.isDisplayed();
	if (status) {
		System.out.println("ReEmail id is visiable after first email is entered");
	}else {
		System.out.println("ReEmail id is NOT visiable after first email is entered");

	}
	driver.close();
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	}

}
