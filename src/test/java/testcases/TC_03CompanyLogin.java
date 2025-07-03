package testcases;

import org.testng.annotations.Test;

import pageObjects.CompanyLogin;

public class TC_03CompanyLogin extends BaseClass
{
	@Test
	public void verifyCompanyLogin() 
	{
		CompanyLogin cl=new CompanyLogin(driver);
		cl.setusername("akash@yopmail.com");
		cl.clkforgetbtn();
		cl.setEmail("akash@yopmail.com");
		cl.clkSubmitbtn();

}}
