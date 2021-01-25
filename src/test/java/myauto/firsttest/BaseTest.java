package myauto.firsttest;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
//import org.apache.log4j.Logger;
//import org.junit.Before;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.BasePage;

public class BaseTest {
	
	
	
	
	public WebDriver driver;
	
	private static Logger log =  (Logger) LogManager.getLogger(BaseTest.class.getName());
	
	@BeforeTest
	public void initDriver() {
		  // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sridhar\\Downloads\\chromedriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        driver=new ChromeDriver();  
        driver.get("http://www.facebook.com/"); 
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
  
         //Maximize the browser  
          driver.manage().window().maximize();  
		
	}
	
	@Test
	public void createFBAccount()
	{
		BasePage objBasePage = new BasePage(driver);
		  // System Property for Chrome Driver   
		objBasePage.createAccount();

          
	}

}
