    package testcases;

	import org.testng.annotations.Test;

    import pageObjects.LoginPage;

	    public class TC_02Login extends BaseClass
	    {

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



