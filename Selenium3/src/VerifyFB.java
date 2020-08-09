import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyFB {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		System.out.println("ProgStart");
		driver.get("https://www.facebook.com");
		String imgtag = "img";
		WebElement fbimg = driver.findElement(By.tagName("i"));
		String tfb = fbimg.getTagName();
		boolean imgres = tfb.equals(imgtag);
		if (imgres) {
			System.out.println("fb logo is  img tag");
		} else {
			System.out.println("fb logo is Not img tag");
		}

		// Fname defoult value
		WebElement fname = driver.findElement(By.id("u_0_m"));
		String defFname = fname.getAttribute("aria-label");

		if (defFname.isEmpty()) {
			System.out.println("defoult value not present");
		} else {
			System.out.println("Defoult Text in Fname field = " + defFname);
		}
		
		fname.sendKeys("nilesh");
		fname.sendKeys(Keys.CONTROL+"a");
		fname.sendKeys(Keys.CONTROL+"c");
		fname.sendKeys(Keys.TAB +" "+ Keys.CONTROL+"v");
			

	}

}
