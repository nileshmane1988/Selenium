import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBEmailPwdlocation {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("ProgStart");
		driver.get("https://www.facebook.com");

		WebElement email = driver.findElement(By.id("email"));
		Point eloc = email.getLocation();
		int ex = eloc.getX();
		int ey = eloc.getY();
		int space = 5;
		int elength = email.getSize().getWidth();
		System.out.println(elength);
		int total = ex + elength + space;

		WebElement pwd = driver.findElement(By.id("pass"));
		Point ploc = pwd.getLocation();
		int px = ploc.getX();
		int py = ploc.getY();
		if (ey == py && total < px) {
			System.out.println("Passwordfield is left sode of email");
		} else {
			System.out.println("Passwordfield is NOT left side of email");
		}
		System.out.println("ProgEnd");
	}

}
