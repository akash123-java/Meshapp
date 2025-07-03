package testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import pageObjects.HomePage;

    public class TC_01Signup extends BaseClass
    {
	@Test
	public void verifyAccountRegister() throws InterruptedException 
	{
		HomePage hp=new HomePage(driver);
		hp.CreateanAccount();
		hp.setCompanyname(randomeString());
		hp.setEmailAddress(randomeString()+"@yopmail.com");
		hp.setGstNumber(randomeNumber());
	    hp.setGstCertificate("C://Users//lenovo//Desktop//GST-Certificate.pdf");
	    //Thread.sleep(2000);
		hp.setCinnumber(randomeNumber());
		hp.ClickSubmit();
	}
	public String randomeString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}

    public String randomeNumber()
    {
      String generatednumber=RandomStringUtils.randomNumeric(10);
      return generatednumber;
    
    }
	}
	
	
	
	


