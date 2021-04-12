package pkg_UserPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/Account/LoginPage']")
	private WebElement signin;
	@FindBy(xpath="//input[@id='EmailId']")
	private WebElement emailid;
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwd;
	@FindBy(xpath="//input[@class='btn btn-block btn-primary']")
	private WebElement loginbtn;
	@FindBy(xpath="/html/body/form/div/div[2]/div/div/div/label/div")
	private WebElement showpassword;
	//@FindBy(xpath="/html/body/form/div/div[2]/div/div/div/div[4]/label/div")
	//WebElement rememberme;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	  /*public void loginp(String uname, String pass) throws InterruptedException {
	  signin.click(); 
	  Thread.sleep(3000); 
	  emailid.sendKeys(uname);
	  Thread.sleep(3000); 
	  passwd.sendKeys(pass); 
	  Thread.sleep(3000);
	  showpassword.click();
	  Thread.sleep(3000); 
	  loginbtn.click();
	  Thread.sleep(3000); //rememberme.click(); //Thread.sleep(3000);
	  
	  }*/
	 
	public void setSignin()
	{
		signin.click();
	}
	
	/*
	 * public WebElement getSignin() { return signin; }
	 */
	
	public void setEmailid(String uname )
	{
		emailid.sendKeys(uname);;
	}
	
	/*
	 * public WebElement getEmailid() { return emailid; }
	 */
	
	public void setPasswd(String pass)
	{
		passwd.sendKeys(pass);;
	}
	
	/*
	 * public WebElement getPasswd() { return passwd; }
	 */
	public void setShowpassword()
	{
		showpassword.click();;
	}
	
	/*
	 * public WebElement getShowpassword() { return showpassword; }
	 */


	public void setLoginbtn()
	{
		loginbtn.click();;
	}
	
	/*
	 * public WebElement getLoginbtn() { return loginbtn; }
	 */
	
}