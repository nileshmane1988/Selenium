package UsingShotcuts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyStrock4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement rv = driver.findElement(By.id("email"));
		rv.sendKeys("nileshm@zimetrics.com");
		Thread.sleep(3000);
		rv.sendKeys(Keys.CONTROL + "a" );
		Thread.sleep(3000);
		rv.sendKeys(Keys.CONTROL + "c");
		Thread.sleep(3000);
		rv.sendKeys(Keys.TAB +"" +Keys.CONTROL+"v");
		Thread.sleep(3000);
		//rv.sendKeys(Keys.CONTROL+"v");
		
		/*
		 * String str = "nileshm@zimetrics.com"; rv.sendKeys(str);
		 * 
		 * for(int i=1;i< str.length();i++) { rv.sendKeys(Keys.BACK_SPACE);
		 * Thread.sleep(3000); }
		 */
}
}
