package pkg_UserPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobseekersDetailsPage {
	public WebDriver driver;
	
	@FindBy(xpath="//li[@id='BasicD']/span[1]")
	WebElement basicdetails;
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='Gender']")
	WebElement gender;
	@FindBy(xpath="//input[@id='Address']")
	WebElement address;
	@FindBy(xpath="//input[@id='Country']")
	WebElement country;
	@FindBy(xpath="//input[@id='State']")
	WebElement state;
	@FindBy(xpath="//input[@id='City']")
	WebElement city;
	@FindBy(xpath="//input[@id='MaritalStatus']")
	WebElement maritalstatus;
	@FindBy(xpath="//input[@class='btn-info']")
	WebElement update;
	
	public JobseekersDetailsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void setBasicdetails()
	{
		basicdetails.click();
	}
	
	public void setFirstname(String name)
	{
		firstname.sendKeys(name);
	}
	
	public void setLastname(String lstname)
	{
		lastname.sendKeys(lstname);
	}
	
	public void setgender(String gndr)
	{
		gender.sendKeys(gndr);
	}
	
	public void setAddress(String adrss)
	{
		address.sendKeys(adrss);
	}
	
	public void setCountry(String cntry)
	{
		country.sendKeys(cntry);
	}
	
	public void setState(String stte)
	{
		state.sendKeys(stte);
	}
	
	public void setCity(String cty)
	{
		city.sendKeys(cty);
	}
	
	public void setMaritalstatus(String martlstts)
	{
		maritalstatus.sendKeys(martlstts);
	}
	
	
	
	

}
