package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//XPath with single attribute 
		 // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-Shirt");
              
		  //XPath with mutliple attributes
		 // driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-Shirts");
		  
		  //XPath with 'and'  'or'  operator
		//driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("//input[@name='search'or @placeholder='xyz']")).sendKeys("T-Shirts");
		
		
		  //XPath with text()-inner text
		//  driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		 // https://demo.opencart.com/
		
		
		//boolean displaystatus=driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		 //System.out.println(displaystatus); 
		  
		// String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		 // System.out.println(value);
		
		//XPath with contains()

		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		  
		  
		//XPath with start-with()
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
        
		//chained XPath
		
		boolean imageStaus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imageStaus);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
