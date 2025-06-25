package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


	public class LoginPage extends BasePage

	    {
	    public LoginPage(WebDriver driver)
		{
			super(driver);
		}
	    
	    @FindBy(id="basic_username")
		WebElement InputUsername;
		
		@FindBy(id="basic_password")
		WebElement InputPassword;
		
		@FindBy(xpath="//button[@type='submit']")
		WebElement submitbtn;
		
		@FindBy(xpath="//p[@class='_roleMainDiv_1txws_25'][normalize-space()='Recent Requests']")
		WebElement clkbtn;
		
	    @FindBy(xpath="//h5[normalize-space()='Company Onboarding Request']")
	    WebElement clkOnboardingbtn;
	
	    @FindBy(xpath="//button[normalize-space()='Approve']")
	     WebElement clkApprovebtn;
	    
	    @FindBy(xpath="//button[normalize-space()='Ok']")
	    WebElement clkok;
	   
	     public void setusername(String username)
		    {
			  InputUsername.sendKeys(username);
		    }
		    
		 public void setPassword(String password)
		    {
		      InputPassword.sendKeys(password);
		    }

		 public void ClickSubmitbtn()
		  	{
		  	 submitbtn.click();
		    }
		 
		 public void ClickRecentbtn()
			  	{
			  	 clkbtn.click();
			    }
		 
		 public void ClickOnboardingbtn()
			  	{
		    	  clkOnboardingbtn.click();
			    }
		 
		 public void ClickApprovebtn()
			  	{
		    	  clkApprovebtn.click();
			    }
		 
		  public void ClickOk()
			  	{
		    	  JavascriptExecutor js = (JavascriptExecutor) driver;
		            js.executeScript("arguments[0].click();", clkok);
		        }
		      
	            }

	