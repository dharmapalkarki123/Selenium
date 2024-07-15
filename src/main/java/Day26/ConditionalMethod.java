package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		
		//is Displayed()
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Displayed status logo:" +logo.isDisplayed());//true
        
       boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        System.out.println("Display Status " +status);
        
        
        //isEnabled
        boolean status1=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
        System.out.println("Enable Status:"+status1);
        
        //isSlected 
        WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
        WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
        
        
        System.out.println("Before Selection....");
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected());
        
        System.out.println("After Selecting male...");
        male_rd.click();
        System.out.println(male_rd.isSelected());
        System.out.println(female_rd.isSelected()); 
        
        
        
        
        
        
	}

}
