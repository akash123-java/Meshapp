package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	  WebDriver driver;
			
			@BeforeClass
			public void setup()
			{
				driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://mesh-app-ashen.vercel.app/");
				driver.manage().window().maximize();
			}

}
