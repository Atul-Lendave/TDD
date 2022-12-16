package ai.ds.pagelayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.ds.testbase.Testbase;

public class ExchangePage extends Testbase{
	
	public ExchangePage() 
	{
		PageFactory.initElements(driver,this);
	}
   
	//---------------------obj repo-----------------------
	
	@FindBy(xpath = "//a[contains(text(),'Buy')]")
	private WebElement txt_buy1;
	
	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement txt_quantity;
	
	@FindBy(xpath = " //button[contains(text(),'Buy')]")
	private WebElement btn_buy2;
	
	@FindBy(xpath = "//div[contains(text(),'Order Created successfully')]")
	private WebElement status;
	
	
	// --------------------------------Action Method ---------------------
	
	public void clickOnBuyButton1() 
	{
	 txt_buy1.click();	
	}
	
	public void enterQuantityofShare() 
	{
		txt_quantity.sendKeys("10");
		txt_quantity.click();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,500)");

	}
	public void clickOnBuyButton2() 
	{
		btn_buy2.click();
	}
	public String getStatus() 
	{
		String msg=status.getText();
		return msg;
	}
}
