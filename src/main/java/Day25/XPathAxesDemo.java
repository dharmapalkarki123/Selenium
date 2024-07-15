package Day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//Self - Selects the current node
		String text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/self::a")).getText();
		System.out.println("Self: "+ text); //L&T
		

		//Parent - Selects the parent of the current node (always One)
		text=driver.findElement(By.xpath("//a[contains(text(),'L&T')]/parent::td")).getText();// there is no text for parents so it is use
		System.out.println("Parent"+text); //L&T
		
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
