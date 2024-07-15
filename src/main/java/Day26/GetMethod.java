package Day26;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//get(url)-opens the url on the browser
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(5000);
        //getTitle()-returns title of the page
     System.out.println(driver.getTitle());
     
     //getCurrenturl() -return url of the page    
     System.out.println(driver.getCurrentUrl());
      
     
     //getPageSource()-return source code of the page     
     //System.out.println(driver.getPageSource());
     
     //getWindowHandle()-return ID OF THE SINGLE Browser window     
      //  String Window_Id =driver.getWindowHandle();
        //System.out.println("Window ID: "+Window_Id); //5DC136A7F02F38445AAD874B764957FD
                                                     //  2EAD6326D9150EEDD1565596FC788223
      
     //getWindowsHandles() -return ID's of the multiple browser windows 
      driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will open new browser windows 
     Set<String> windowid=driver.getWindowHandles();
     System.out.println(windowid);
       
     
	}

}
