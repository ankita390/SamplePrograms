package com.applect.meritnationmobile.scripts;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileAskAnswerPage;
import com.applect.meritnation.pageobject.MobileLoginPage;

public class MobileLoginTest extends BaseLib {

	

	@Test(groups = "MobileRegressio")
	public void TC_001_VerifyValidLogin() {
		MobileLoginPage mobileLoginPage = new MobileLoginPage(_driver);
		MobileAskAnswerPage mobileAskAnswerPage = new MobileAskAnswerPage(_driver);
		mobileAskAnswerPage.closeConnectoPopup(_driver);
		mobileLoginPage.clickSignUpButton();
		mobileLoginPage.clickLogin();
		mobileLoginPage.login(_driver);
		mobileLoginPage.verifyDashboard(_driver);
		mobileLoginPage.logout(_driver);
	}

	@Test(groups = "MobileRegressio")
	public void TC_002_MobileSignup() {
		MobileLoginPage mobileLoginPage = new MobileLoginPage(_driver);
		MobileAskAnswerPage mobileAskAnswerPage = new MobileAskAnswerPage(_driver);
		mobileAskAnswerPage.closeConnectoPopup(_driver);
		mobileLoginPage.clickSignUpButton();
		mobileLoginPage.fillSignUpForm(_driver);
		
		
		//mobileLoginPage.enterSchool(driver);
		mobileLoginPage.logout(driver);

	}

}
