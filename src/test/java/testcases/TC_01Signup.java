package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;

public class TC_01Signup 
    {
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mesh-app-ashen.vercel.app/register");
		driver.manage().window().maximize();
	}
	
	@Test
	public void verifyAccountRegister() 
	{
		HomePage hp=new HomePage(driver);
		hp.setCompanyname("akashtest");
		hp.setEmailAddress("akash@yopmail.com");
		hp.setGstNumber("1234567890");
	    hp.setGstCertificate("C:\\Users\\lenovo\\Desktop\\dummy.pdf");
		hp.setCinnumber("99999999");
		hp.ClickSubmit();
		
	}
	
	/*@AfterClass
	public void teardown()
	{
		driver.close();
	}*/
	

    }
