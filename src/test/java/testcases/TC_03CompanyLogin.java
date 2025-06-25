package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.CompanyLogin;

public class TC_03CompanyLogin 
{
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mesh-app-ashen.vercel.app/auth");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyCompanyLogin() 
	{
		CompanyLogin cl=new CompanyLogin(driver);
		cl.setusername("akash@yopmail.com");
		cl.clkforgetbtn();
		cl.setEmail("akash@yopmail.com");
		cl.clkSubmitbtn();

}}
