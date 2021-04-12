package pkg_UserTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="http://jobportal.gayasofttech.com/?";
	public String Username="satishjambutkar21@gmail.com";
	public String Password="S7498227274#s";
	public String cellno="7498227274";
	public String firstName="Satish";
	public String lastName="Jambutkar";
	public String gender="Male";
	public String address="Pune";
	public String country="India";
	public String state="Maharashta";
	public String city="Pune";
	public String maritalStatus="Married";
	
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get(baseURL);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}

}
