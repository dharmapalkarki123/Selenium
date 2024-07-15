package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		driver.getWindowHandles();		
		 
		Set<String> WindowsIds=driver.getWindowHandles();
		
 /*	
	 * //Approach1
		
		List<String> windowsList=new ArrayList(WindowsIds); 
		//It is converted because in List from set because in set it does not follow indexing concept and does not have get method  
		 
		String parentsID=windowsList.get(0);
		String childID=windowsList.get(1);
		
		
		//Switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//Switch to Parent window
		driver.switchTo().window(parentsID);
		System.out.println(driver.getTitle());
		
	*/
		
		//Approach 2
		
		for(String windId: WindowsIds)
		{
			
			String title=driver.switchTo().window(windId).getTitle();
			  
			if(title.equals("OrangeHRM"))
			{
				System.out.println(driver.getCurrentUrl());
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
