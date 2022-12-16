package ai.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.Testbase;

 public class LoginPage extends Testbase{
	 
	public LoginPage()
	 {
		 PageFactory.initElements(driver,this);
	 }
     
	// ----------------------obj repo ----------------------
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txt_password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn_login;
	
	
	// -------------------Action Methods --------------------
	
	public void enterEmailID(String email) 
	{
		txt_email.sendKeys(email);
	}
	
	public void enterPassword(String password) 
	{
		txt_password.sendKeys(password);
	}
	
	public void clickOnButton() 
	{
		btn_login.click();
	}
	public String getUrl() 
	{
		String curl=driver.getCurrentUrl();
		return curl;
	}
}
