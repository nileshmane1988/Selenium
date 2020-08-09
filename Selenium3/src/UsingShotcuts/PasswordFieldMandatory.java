package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PasswordFieldMandatory {

	public static void main(String[] args) {

		String ActualColor = "#ff0000";
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		
//		driver.findElement(By.id("u_0_13")).click();
		
	  WebElement pwd = driver.findElement(By.id("u_0_13"));
	  
	  String pwd_rgb = pwd.getCssValue("border-top-color");
	  
	  String pwd_hex = Color.fromString(pwd_rgb).asHex();
	  
	  if (ActualColor.equals(pwd_hex))
	  {
		  System.out.println(" Password Field Is Mandatory");
	  }else {
		  System.out.println(" Password Field Not Mandatory");
	  }

		driver.findElement(By.id("u_0_13")).click();

		  String pwd_rgb2 = pwd.getCssValue("border-top-color");
		  
		  String pwd_hex2 = Color.fromString(pwd_rgb2).asHex();
		  
		  if (ActualColor.equals(pwd_hex2))
		  {
			  System.out.println(" Password Field Is Mandatory");
		  }else {
			  System.out.println(" Password Field Not Mandatory");
		  }

	}
}


