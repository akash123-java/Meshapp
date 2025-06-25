 package pageObjects;

 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.FindBy;

 public class CompanyLogin extends BasePage

    {
    public CompanyLogin(WebDriver driver)
	{
		super(driver);
	}
    
    @FindBy(id="basic_username")
	WebElement InputUsername;
    
    @FindBy(xpath="//span[@class='_forgoteText_1vz5b_24']")
    WebElement Forgetbtn;
    
    @FindBy(xpath="//input[@placeholder='Enter your Email']")
    WebElement InputEmail;
    
    @FindBy(xpath="//button[normalize-space()='Submit']")
    WebElement sbmtbtn;
    
    public void setusername(String username)
    {
	  InputUsername.sendKeys(username);
    }
    
    public void clkforgetbtn()
    {
	  Forgetbtn.click();
    }
    
    public void setEmail(String Email)
    {
	  InputEmail.sendKeys(Email);
    }
    
    public void clkSubmitbtn()
    {
	  sbmtbtn.click();
    }}
  
