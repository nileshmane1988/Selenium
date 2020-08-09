import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMsgColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://localhost/login.do");
		WebElement rv = driver.findElement(By.id("username"));
		
		Point p = rv.getLocation();
		int un_x_Value=p.getX();
		int un_y_Value=p.getY();
		
WebElement rv1 = driver.findElement(By.name("pwd"));
		
		Point p1 = rv1.getLocation();
		int pass_x_Value=p1.getX();
		int pass_y_Value=p1.getY();
		
		if(un_x_Value==pass_x_Value &&un_y_Value<pass_y_Value)
		{
			System.out.println("password is aligned bellow uid");
		}
		
		
		
		
		
	}

}
