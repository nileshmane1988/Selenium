
public class TestScript extends SlectBrowser {

	 public void script()
		{
			driver.get("http://www.facebook.com");
			String title=driver.getTitle();
			String url=driver.getCurrentUrl();
			System.out.println("title is ="+title);
			System.out.println("url is = "+ url);
			driver.close();		
					
		}

	public static void main(String[] args) 
	{
		TestScript rv = new TestScript();
		//String str="firefox";
		rv.browsername("chrome");
		rv.script();
	}

}
