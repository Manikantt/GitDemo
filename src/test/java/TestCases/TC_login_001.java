package TestCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import Page_elements.Login_page;

public class TC_login_001 extends Page_objects{
	Login_page p = new Login_page(Driver);
	
	@Test
	public void login()
	{
		Login_page p = new Login_page(Driver);
		p.username();
		logger.info("username entered");
		p.Password();
		logger.info("password entered");
		p.logbutton();
		
		if(Driver.getTitle().equals("GayaSoft ERP"))
		{
		Assert.assertTrue(true);;
		logger.info("Logged in sucessfully");
		}
		else
		{
			Assert.assertFalse(false);
		}
	}
}
