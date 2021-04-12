package pkg_UserTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import pkg_UserPageObjects.LogInPage;
import pkg_UserUtilities.ExelData;

public class TC_LogIn_002 extends BaseClass {
	
	
	@Test
	public void logInTest() throws InterruptedException
	{
		/*
		 * LogInPage obj1=new LogInPage(driver); obj1.loginp(Username, Password);
		 */
		
		LogInPage obj1=new LogInPage(driver);
		obj1.setSignin();
		obj1.setEmailid(Username);
		obj1.setPasswd(Password);
		obj1.setShowpassword();
		obj1.setLoginbtn();
		
		
		  if(driver.getTitle().equals("ViewProfile")) 
		  { 
			  Assert.assertTrue(true); 
		  } 
		  else
		  { 
			  Assert.assertTrue(false);
		  }
		 
				
	}
	
	/*
	 * @Test(dataProvider="Logindata1", dataProviderClass=ExelData.class) public
	 * void logintest1(Map<Object, Object> map ) throws InterruptedException {
	 * String url=(String)map.get("URL"); String
	 * username=(String)map.get("Username"); String
	 * password=(String)map.get("Password"); driver.get(url); LogInPage obj2=new
	 * LogInPage(driver); obj2.loginp(username, password);
	 * 
	 * 
	 * 
	 * }
	 */
	
	
}
