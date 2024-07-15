package PageObjectModel;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit
		
		//Create object of LoginPage 
		
		LoginPage LoginPg=new LoginPage(driver);
		  
		//open url
		driver.get("https://test1.renderbooking.com");
		/*
		LoginPg.enetrUsername("stander-user");
		LoginPg.enetrPassword("secret_sauce");
		*/
		LoginPg.clickOnLoginBtn();
		LoginPg.enetrPhone();
		LoginPg.clickOnLoginButton2();
        LoginPg.VerifyOtp();
        LoginPg.VerifyOtp1();
        LoginPg.VerifyOtp2();
        LoginPg.VerifyOtp3();
        LoginPg.VerifyOtp4();
        LoginPg.VerifyOtp5();
        LoginPg.ClickVerifyButton();
        LoginPg.Hourly();
        LoginPg.PickUp();
        LoginPg.PickUp1();
        LoginPg.PickUp2();
        LoginPg.DropReq();
        LoginPg.DropReq12();
        LoginPg.DropReq23();
        LoginPg.TravelDate();
        LoginPg.TimeReq();
        LoginPg.Req();
        LoginPg.Booked();
        LoginPg.RentClick1();
       LoginPg.PaymenOpt1();
       LoginPg.ChoosePay1();      
       LoginPg.KhaltiWallet1();
       LoginPg.EnterNum1();
       
       
       
       
       
       
       
       
       
       
       
       
	}

}