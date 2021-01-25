package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
	
	
	//@FindBy(xpath="//a[text()='Create New Account']")
	@FindBy(xpath="//*[@id=\"u_0_2\"]")
	WebElement btnCreateAccount;
	

	//@FindBy(name="//input[@name='firstname']")
	@FindBy(name="firstname")
	WebElement txtUserName;

	@FindBy(xpath="//input[@name='lastname']")
	WebElement txtSurName;

	@FindBy(xpath="//*[@id='u_1_g']")
	WebElement txtMobileNumber;
	
	@FindBy(id="password_step_input")
	WebElement txtPassword;
	
	@FindBy(xpath="//select[@aria-label='Day']")
	WebElement lstDay;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	WebElement lstMonth;
	
	@FindBy(xpath="//select[@aria-label='Year']")
	WebElement lstYear;
	
	
	@FindBy(xpath="//span[@data-name='gender_wrapper']")
	WebElement elerdoGroup; 
	
	@FindBy(xpath="//*[@id='u_1_4']")
	WebElement rdoFemale;
	
	@FindBy(xpath="//input[@value='2']")
	WebElement rdoMale;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement btnSignUp;
	
	
	public BasePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void createAccount() {
		
		btnCreateAccount.click();
		txtUserName.sendKeys("sridhar2115");
		txtSurName.sendKeys("surname2115");
		txtSurName.sendKeys(Keys.TAB);
		txtMobileNumber.sendKeys("9123456780");
		txtPassword.sendKeys("test123");
		selectItem(lstDay, "22");
		selectItem(lstMonth, "Jan");
		selectItem(lstYear, "1983");
		
	    rdoMale.click();//for selecting male

	
		btnSignUp.click();
		
		
	}

	public static boolean selectItem(WebElement eleSelect, String strText) {
		boolean bFlag= false;
		
		Select obj = new Select(eleSelect);
		List<WebElement>objList = obj.getOptions();
		for(WebElement opt: objList)
            if(opt.getText().equals(strText)) {
            	opt.click();
            	bFlag =true;
            }
		
		
		
		
		return bFlag;
		
		
	}
	
	
	

}
