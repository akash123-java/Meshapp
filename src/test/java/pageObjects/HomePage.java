package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage

    {
    
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(id="basic_companyname")
	WebElement InputCompanyName;
	
	@FindBy(id="basic_email")
	WebElement InputEmail;
		
	@FindBy(id="basic_gstnumber")
	WebElement InputgstNumber;

	@FindBy(xpath = "//input[@type='file']") // Replace with actual input locator
	WebElement fileInput;
	
    @FindBy(id="basic_cinnumber")
	WebElement Inputcinnumber;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement buttonsubmit;
	
	
	public void setCompanyname(String companyname)
	{
		InputCompanyName.sendKeys(companyname);
	}
	
	public void setEmailAddress(String emailAddress)
	{
		InputEmail.sendKeys(emailAddress);
	}
	
	public void setGstNumber(String gstNumber)
	{
		InputgstNumber.sendKeys(gstNumber);
	}
	
	public void setGstCertificate(String filepath )
	{
		
		fileInput.sendKeys(filepath);
		
	}
	
	public void setCinnumber(String CINNumber)
	{
		Inputcinnumber.sendKeys(CINNumber);
	}
	
	public void ClickSubmit()
	{
		buttonsubmit.click();
    }}

   
