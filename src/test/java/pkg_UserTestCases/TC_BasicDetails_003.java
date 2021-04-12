package pkg_UserTestCases;

import org.testng.annotations.Test;

import pkg_UserPageObjects.JobseekersDetailsPage;

public class TC_BasicDetails_003 extends BaseClass {
	
	
	@Test
	public void basicDetails()
	{
		JobseekersDetailsPage obj2= new JobseekersDetailsPage(driver);
		obj2.setFirstname(firstName);
		obj2.setLastname(lastName);
		obj2.setgender(gender);
		obj2.setAddress(address);
		obj2.setCountry(country);
		obj2.setState(state);
		obj2.setCity(city);
		obj2.setMaritalstatus(maritalStatus);
	}

}
