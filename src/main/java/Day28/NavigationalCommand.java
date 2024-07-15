package Day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		//driver.get("htts://demo.nopcommerce.com/"); //accepts URL only in the string format
		
		//driver.navigate().to("htts://demo.nopcommerce.com/"); //accepts URL  in the string format and object  format
		
	//	URL myurl=new URL("https://demo.nopecommerce.com/");
       //  driver.navigate().to(myurl);
		
		driver.navigate().to("htts://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); //htts://demo.nopcommerce.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		driver.navigate().refresh();	
		
		
		
		
	}

}
