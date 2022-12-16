package ai.ds.testlayer;

import org.testng.annotations.Test;
import ai.ds.pagelayer.DashbordPage;
import ai.ds.pagelayer.ExchangePage;
import ai.ds.pagelayer.LoginPage;
import ai.ds.testbase.Testbase;

public class BuyShare extends Testbase {
	
	@Test
	public void buyFunctionality() throws InterruptedException 
	{
		LoginPage login = new LoginPage();
		DashbordPage dash = new DashbordPage();
		ExchangePage exchange = new ExchangePage();
		
		login.enterEmailID("atullendave4003@gmail.com");
		login.enterPassword("Atul@4003");
		login.clickOnButton();
		Thread.sleep(3000);
	
		dash.enterCompanyName("Wipro");
		dash.selectOption();
		
		Thread.sleep(2000);
	    exchange.clickOnBuyButton1();
		exchange.enterQuantityofShare();
		Thread.sleep(2000);
		exchange.clickOnBuyButton2();
		
		String actull_op=exchange.getStatus();
		System.out.println(actull_op);
	
	}
	
 }
