package popup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Child_06 {

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com");
		//Parent refID
		String parent_refID = driver.getWindowHandle();
		//New Treeset
		TreeSet<String> ref2=new TreeSet<>();
		
		//Identify Ref ID
		Set<String> ref = driver.getWindowHandles();
		//close all windows without using quit()
		Iterator<String> itr = ref.iterator();
		while (itr.hasNext())
		{
			String window_refID = itr.next();
			if(!window_refID.equals(parent_refID))
			{
				ref2.add(window_refID);
			}
		}
		//Close first child
		String child_01refid = ref2.first();
		driver.switchTo().window(child_01refid);
		driver.close();
		//Close last child
		String lastchild_refID = ref2.last();
		driver.switchTo().window(lastchild_refID);
		driver.close();

	}

}
