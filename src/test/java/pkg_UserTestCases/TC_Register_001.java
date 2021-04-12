package pkg_UserTestCases;

import org.testng.annotations.Test;

import pkg_UserPageObjects.RegisterPage;

public class TC_Register_001 extends BaseClass {
	
	
	/*
	 * @Test public void register() throws InterruptedException { RegisterPage
	 * obj=new RegisterPage(driver); obj.registerpage(Username, Password); }
	 */
	
	@Test
	public void register()
	{
		RegisterPage obj=new RegisterPage(driver);
		obj.setRegisterNow();
		obj.setSelectUserType();
		obj.setEmail(Username);
		obj.setPasswrd(Password);
		obj.setMobileNo(cellno);
		obj.setRegisterbtn();
	}
	
	

}
