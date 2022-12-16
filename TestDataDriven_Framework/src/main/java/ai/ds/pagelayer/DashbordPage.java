package ai.ds.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.Testbase;

public class DashbordPage extends Testbase {
	
	public DashbordPage() 
	{
		PageFactory.initElements(driver,this);
	} 
     
	//--------------------obj repo----------------
	
	@FindBy(xpath = "//input[@type='text'][1]")
	private WebElement txt_serach;
	
	@FindBy(xpath = "(//div[@class='m-4 card'])[2]")
	private WebElement option;
	
	
	//-------------------------Action Method --------------------
	
	public void enterCompanyName(String companyName) 
	{
		txt_serach.sendKeys(companyName);
		
	}
	public void selectOption() 
	{
		option.click();
	}
}
