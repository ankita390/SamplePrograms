package com.applect.meritnationmobile.scripts;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileLoginPage;

public class MobileLoginTest extends BaseLib{ 
	@Test(groups = "MobileRegressio")
	public void TC_001_VerifyValidLogin()
	{
		MobileLoginPage mobileLoginPage = new MobileLoginPage(driver);
		mobileLoginPage.clickLogin();
		mobileLoginPage.login(driver);
		mobileLoginPage.verifyDashboard(driver);
		mobileLoginPage.logout(driver);
		}
	@Test(groups = "MobileRegressio")
	public void TC_002_MobileSignup()
	{
		MobileLoginPage mobileLoginPage = new MobileLoginPage(driver);
		mobileLoginPage.clickLogin();
		mobileLoginPage.fillSignUpForm(driver);
		mobileLoginPage.enterSchool(driver);
		mobileLoginPage.logout(driver);
		
	}

}
