package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); //maximize the windows size
		
		
	       //name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		
		  //id
		//boolean logoDispalystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDispalystatus);

		
		//linktext & partialLinkText
		
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Tab")).click();
		
		//className
		//List<WebElement> headerLinks =driver.findElements(By.className("list-inline-item"));
	    // System.out.println("Total number of header links: "+headerLinks.size());
	     
	     //tagname
	    // List<WebElement> links=driver.findElements(By.tagName("a"));
	    // System.out.println("Total number of Links: "+links.size());
	     
	     
	     //finding images
	     List<WebElement> images=driver.findElements(By.tagName("img"));
	     System.out.println("Total number of images: "+images.size());
	     
	     
	}

}
