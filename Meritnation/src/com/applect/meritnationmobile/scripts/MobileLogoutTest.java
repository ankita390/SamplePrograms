package com.applect.meritnationmobile.scripts;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileAskAnswerPage;
import com.applect.meritnation.pageobject.MobileLogoutPage;

import org.testng.annotations.Test;

public class MobileLogoutTest extends BaseLib {
	
	@Test(groups = "MobileRegression")
	public void TC002_verifyAskAndAnswerPageOnLogout(){
		
		MobileAskAnswerPage mobileAskAnswerPage = new MobileAskAnswerPage(_driver);
		MobileLogoutPage mobileLogoutPage = new MobileLogoutPage(_driver);
		mobileAskAnswerPage.closeConnectoPopup(_driver);
		mobileLogoutPage.verifyAskAndAnswer(_driver);
		
		}

}
