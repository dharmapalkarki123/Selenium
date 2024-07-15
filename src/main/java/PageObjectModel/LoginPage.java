package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver;
	
	LoginPage(WebDriver d)
	{
		driver =d;
	}
	/*
	
	By username = By.id("user-name");
	By password =By.id("password");
	*/
	By Phone =	By.name("phone");
	By loginBtn =By.linkText("Login");
	By loginButton =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div[2]/div/button");
	By verify0 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[1]");
	By verify1 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[2]");
	By verify2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[3]");
	By verify3 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[4]");
	By verify4 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[5]");
	By verify5 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/div/input[6]");
    By VerifyButton =By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/form/center/button");
    By PickUpLoc = By.xpath("//input[@placeholder='Where are you going?']");
    By ClickLoc = By.cssSelector("body > div:nth-child(3) > div:nth-child(1)");
    By Click2 = By.xpath("//div[contains(@class,'cursor-pointer rounded-lg py-2 md:rounded-none')]");
    By RentClick=By.xpath("//*[@id=\"root\"]/div/div[4]/div[2]/div[2]/div[2]/div[2]/div[3]/button");
    By PaymentOpt=By.xpath("//*[@id=\"paymentMethod\"]");
    
    
    
    By DropLoc = By.xpath("//input[@placeholder='Drop location?']");
    
    By Drop1 = By.cssSelector("body > div:nth-child(4) > div:nth-child(1)");
    By Drop2 = By.xpath("//div[contains(@class,'cursor-pointer rounded-lg py-2 md:rounded-none')]");
    
    
    
    
    
    
    
    By ReqHour = By.xpath("//*[@id=\"radix-:r2f:-content-tab1\"]/form/div[5]/div/div/button");
    By Hour = By.xpath("//*[@id=\"radix-:r2f:-trigger-tab1\"]");
    By BookClick =By.xpath("//*[@id=\"radix-:r2f:-content-tab1\"]/form/div[6]");
    By TravelDate =By.xpath("//*[@id=\"radix-:r2f:-content-tab1\"]/form/div[3]/div/div/button");
    By Time = By.xpath("//*[@id=\"radix-:r2f:-content-tab1\"]/form/div[4]/div/div/button");
    By ChoosePay =By.xpath("//*[@id=\"root\"]/div/div[4]/div[1]/div[2]/div/form/div/div[2]/button[2]");
    
    By KhaltiWallet =By.xpath("//flutter-view[@flt-view-id='0']");
    By EnterNum = By.xpath("/html/body/flutter-view");
    
    
    
    
    
    
    
    
	/*
    public void enetrUsername(String uname)
    {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enetrPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	*/
    
    public void KhaltiWallet1()
    {
    	driver.findElement(KhaltiWallet).click();
    }
    
    public void EnterNum1()
    {
    	driver.findElement(EnterNum).sendKeys("9800000005");
    }
    
    
    
    
    
    
    
    
    
    public void ChoosePay1()
    {
    	driver.findElement(ChoosePay).click();
    }
    
    
    
	
	public void enetrPhone()
	{
		driver.findElement(Phone).sendKeys("9842476993");
	}
	
	
	public void clickOnLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}

	public void clickOnLoginButton2()
	{
		driver.findElement(loginButton).click();
	}
	public void VerifyOtp() {
		driver.findElement(verify0).sendKeys("1");
	}

public void VerifyOtp1() {
	driver.findElement(verify1).sendKeys("1");
}
public void VerifyOtp2() {
	driver.findElement(verify2).sendKeys("1");
}
public void VerifyOtp3() {
	driver.findElement(verify3).sendKeys("1");
}
public void VerifyOtp4() {
	driver.findElement(verify4).sendKeys("1");
}
public void VerifyOtp5() {
	driver.findElement(verify5).sendKeys("1");
}

public void ClickVerifyButton()
{
	driver.findElement(VerifyButton).click();
}
public void PickUp()
{
	driver.findElement(PickUpLoc).click();
	driver.findElement(PickUpLoc).sendKeys("Pokhara");
}


public void PickUp1() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(ClickLoc).click();
}

public void PickUp2()
{
	driver.findElement(Click2).click();
}




public void DropReq()
{
	driver.findElement(DropLoc).sendKeys("Kathmandu");
	driver.findElement(DropLoc).click();
	
}


public void DropReq12() throws InterruptedException
{ Thread.sleep(2000);
	driver.findElement(Drop1).click();
}


public void DropReq23() throws InterruptedException
{ Thread.sleep(5000);
	driver.findElement(Drop2);
}



public void RentClick1()
{
	driver.findElement(RentClick).click();
}




public void Req()
{
	driver.findElement(ReqHour).sendKeys("2 hour");
}

public void Hourly()
{
	driver.findElement(Hour).click();
}

public void Booked() throws InterruptedException
{ Thread.sleep(2000);
	driver.findElement(BookClick).click();
}

public void TravelDate()
{
	driver.findElement(TravelDate).sendKeys("8/6/2024");
}


public void TimeReq()
{
	driver.findElement(Time).sendKeys("06:00-06:30");
}


public void PaymenOpt1()
{
	driver.findElement(PaymentOpt).click();
}













}
		
	
	
	
	
	
	
