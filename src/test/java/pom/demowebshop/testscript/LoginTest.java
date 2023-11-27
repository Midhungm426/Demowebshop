package pom.demowebshop.testscript;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import pom.demowebshop.automationcore.Base;
import pom.demowebshop.constants.ErrorMessages;
import pom.demowebshop.pages.HomePage;
import pom.demowebshop.pages.LoginPage;
import pom.demowebshop.pages.UserAccountPage;
import pom.demowebshop.utilities.ExcelUtility;

public class LoginTest extends Base
{
	HomePage home;
	LoginPage login;
	UserAccountPage useraccount;
	@Test(priority=1,enabled=true,description="tc_003 verify Valid Login",groups= {"Sanity"})
	public void tc_003_verifyValidLogin()
	{
		List<ArrayList<String>> data= ExcelUtility.excelDataReader("LoginPage");
		String useremail = data.get(1).get(0);
		String password = data.get(1).get(1);
		home= new HomePage(driver);
		login= home.clickOnLoginLink();
		login.enterUserEmailID(useremail);
		login.enterUserPassword(password);
		useraccount = login.clickOnLoginButton();
		String actEmail = useraccount.getEmailText();
		Assert.assertEquals(useremail, actEmail, ErrorMessages.INVALID_EMAIL_ID);
	}
}
