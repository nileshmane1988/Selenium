import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChkBoxSelectedCheck {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
	
		WebElement chk = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		boolean st1 = chk.isDisplayed();
		System.out.println(st1);

		if (st1)
		{
			System.out.println("chk box is displayed");
			boolean st2 = chk.isSelected();
			if(st2)
			{
				System.out.println("already chk box selected");
			}
			else {
				System.out.println("chk box is not selected ");
				chk.click();
			}
		}
		else {
			System.out.println("chk box is not displayed");
		}
		
	
	}

}
