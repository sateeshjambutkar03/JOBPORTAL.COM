package pkg_UserPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	public WebDriver driver;
	
	@FindBy(xpath="//li[@class='left-br']")
	WebElement registerNow;
	@FindBy(id="dropdownUsr")
	WebElement selectUserType;
	@FindBy(id="EnteredEmail")
	WebElement email;
	@FindBy(id="Password")
	WebElement passwrd;
	@FindBy(id="MobileNo")
	WebElement mobileNo;
	@FindBy(id="btnsave")
	WebElement registerbtn;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * public void registerpage(String uname, String pass) throws
	 * InterruptedException { registerNow.click(); Thread.sleep(3000); Select
	 * oselect=new Select(selectUserType); oselect.selectByVisibleText("Jobseeker");
	 * Thread.sleep(3000); email.sendKeys("satishjambutkar21@gmail.com");
	 * Thread.sleep(3000); passwrd.sendKeys("S7498227274#s"); Thread.sleep(3000);
	 * mobileNo.sendKeys("7498228274"); Thread.sleep(3000); registerbtn.click();
	 * Thread.sleep(3000); }
	 */
	
	public void setRegisterNow()
	{
		registerNow.click();
	}
	
	public void setSelectUserType() 
	{
	Select oselect=new Select(selectUserType); 
	oselect.selectByVisibleText("Jobseeker");
	}
	
	public void setEmail(String uname)
	{
		email.sendKeys(uname);
	}
	
	public void setPasswrd(String pass)
	{
		passwrd.sendKeys(pass);
	}
	
	public void setMobileNo(String phoneno)
	{
		mobileNo.sendKeys(phoneno);
	}
	
	public void setRegisterbtn()
	{
		registerbtn.click();
	}
	

}
