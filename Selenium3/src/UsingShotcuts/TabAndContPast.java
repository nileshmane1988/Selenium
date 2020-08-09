package UsingShotcuts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabAndContPast {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		
		un.sendKeys("Admin");
		un.sendKeys(Keys.CONTROL+"a");
		un.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
		
		
		

	}

}
