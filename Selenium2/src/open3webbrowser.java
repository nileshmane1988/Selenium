import org.openqa.selenium.firefox.FirefoxDriver;

public class open3webbrowser {

	public static void main(String[] args) {

		FirefoxDriver rv1,rv2,rv3;
		rv1= new FirefoxDriver();
		//rv2= new FirefoxDriver();
	//	rv3= new FirefoxDriver();
		
		rv1.get("http://www.google.com");
	//	rv2.get("https://www.facebook.com");
	//	rv3.get("https://www.rediffmail.com");
		
		rv1.close();
	//	rv2.close();
	//	rv3.close();
		
	}

}
