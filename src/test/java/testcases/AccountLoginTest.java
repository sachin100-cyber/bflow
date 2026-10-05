package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountLogin;
import testbase.BaseClass;

public class AccountLoginTest extends BaseClass {
	
	@Test
	public void verify_account_login()
	{
		
		logger.info("Starting AccountLogin Test");
		try
		{
		AccountLogin al = new AccountLogin(driver);
		al.setMail("admin@yopmail.com");
		al.setPswd("Admin123");
		al.clickSubmit();
	  //  al.getConfirmationMsg();
		al.getpagetittle();
		
		
		logger.info("Test Passed");
		}
		catch(Exception e)
		{
			logger.error("Test Failed", e);
			Assert.fail("Test Failed:"+e.getMessage());
		}
		finally
		{
			logger.info("Finished AccountLogin Test ");
		}

	
		
	} 
}
