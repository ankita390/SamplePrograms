package com.applect.meritnationmobile.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileAskAnswerPage;

public class MobileAskAnswerTest extends BaseLib {
	
	@Test(groups = "MobileRegression")
	public void TC001_SignUpOnAsknAnsTest(){
		
		MobileAskAnswerPage mobileAskAnswerPage = new MobileAskAnswerPage(_driver);
		mobileAskAnswerPage.closeConnectoPopup(_driver);
		mobileAskAnswerPage.navigatingToAnaListingLogoutPage();
		mobileAskAnswerPage.MobileRegistrationOnAnaListingLogoutPage();
		mobileAskAnswerPage.logOutFromMobileDashboard();
		}
	@Test(groups = "MobileRegression")
	public void TC001_UserRegistraionDirectlyFromGoogleLink(){
		MobileAskAnswerPage mobileAskAnswerPage = new MobileAskAnswerPage(_driver);
		mobileAskAnswerPage.registrationByGoogleLink();
		}
	

}
