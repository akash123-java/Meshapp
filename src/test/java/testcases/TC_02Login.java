    package testcases;

	import org.testng.annotations.Test;
    import org.testng.annotations.BeforeClass;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import pageObjects.LoginPage;

	    public class TC_02Login
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
		public void verifyAccountLogin() 
		{
				LoginPage lp=new LoginPage(driver);
				lp.setusername("superadmin@yopmail.com");
				lp.setPassword("1234567");
				lp.ClickSubmitbtn();
				lp.ClickRecentbtn();
				lp.ClickOnboardingbtn();
				lp.ClickApprovebtn();
				lp.ClickOk();
		}}



