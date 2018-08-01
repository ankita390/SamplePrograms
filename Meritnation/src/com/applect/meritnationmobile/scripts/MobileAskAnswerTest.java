package com.applect.meritnationmobile.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileAskAnswerPage;

public class MobileAskAnswerTest extends BaseLib {
	
	@Test(groups = "MobileRegression")
	public void TC001_SignUpOnAsknAnsTest(){
		MobileAskAnswerPage mobileAnswerPage = new MobileAskAnswerPage(driver);
		
		mobileAnswerPage.clickAskAnswer();
		mobileAnswerPage.verifyDashboardOptions(driver);
		mobileAnswerPage.createAccountOnMobile(driver);
		
	}
	
	/*public void VerifyDashboardTest(){
		
		MobileAskAnswerPage mobileAnswerPage = new MobileAskAnswerPage(driver);	
		
		
	}*/

}
