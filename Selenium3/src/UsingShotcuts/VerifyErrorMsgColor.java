package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMsgColor {
public static void main(String[] args) {
	
	String red_color = "#ff0000";
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	
WebElement idpwdmsg= driver.findElement(By.tagName("span"));
String idpwdcss = idpwdmsg.getCssValue("color");
System.out.println(idpwdcss);

	Color c = Color.fromString(idpwdcss); 
	String final_Hexvalue = c.asHex();
	
	
	System.out.println(final_Hexvalue);
	if (final_Hexvalue.equals(red_color))
	{
		System.out.println("Message color is matched with Red color \"#ff0000\" ");
	}else {
		System.out.println("Message color is NOT matched with Red color \"#ff0000\" ");
		}
	
}
	
}
