package ai.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import ai.ds.pagelayer.LoginPage;
import ai.ds.testbase.Testbase;

  public class LoginPage_Test extends Testbase {
	
	@Test
	
	public void test() throws InterruptedException {
		String expected_url="https://apps.dalalstreet.ai/dashboard";
		LoginPage login= new LoginPage();
		login.enterEmailID("atullendave4003@gmail.com");
		login.enterPassword("Atul@4003");
		login.clickOnButton();
		Thread.sleep(3000);
		
		String actual_op = login.getUrl();
		System.out.println(actual_op);
		
		//compar using assert
		
		Assert.assertEquals(expected_url,actual_op);
		
	}

}
