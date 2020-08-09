import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFopen {


	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver rv = new FirefoxDriver();

		rv.get("http://www.gmail.com");
		rv.get("http://www.facebook.com");
		Thread.sleep(4000);
		Navigation nvg = rv.navigate();
		nvg.back();
		Thread.sleep(4000);
		nvg.forward();
		Thread.sleep(1000);
		nvg.refresh();
		rv.close();
	}

}
