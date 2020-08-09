import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BackTillFacebook {
	public static void main(String[] args) {
		FirefoxDriver rv=new FirefoxDriver();
		Navigation nvg = rv.navigate();
		nvg.to("http://www.FB.com");
		nvg.to("http://www.facebook.com");
		nvg.to("http://www.amazon.com");
		nvg.to("http://www.mintra.com");
		nvg.to("http://www.bookmyshow.com");
		nvg.to("http://www.cleartrip.com");
		
		String exp_fb = "facebook";
		String getTitle = rv.getTitle();
		if(getTitle.contains("facebook")){
			
			
		}
		
		
		
		
	}

}
