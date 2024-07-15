package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Lunch browser (chrome)
		// ChromeDriver driver=new ChromeDriver(); or
		WebDriver driver = new ChromeDriver();

		// 2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");

		// 3) Validate title should be "Your Store"

		String act_title = driver.getTitle();
		if (act_title.equals("Your Store")) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test Failed");

		}
		// 4 close Browser
		//driver.close();
		// drive.quit();

	}
}
