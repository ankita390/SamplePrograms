package com.applect.meritnationmobile.scripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MobileLoginPage;
import com.applect.meritnation.pageobject.MobileStudyPage;

import io.appium.java_client.AppiumDriver;

public class MobileStudyTest extends BaseLib{
	
	
	@Test(groups = "MobileRegression")
	public void TC_001_VerifyStudyPhysicsTopicTest() {
	MobileLoginPage mobileLoginPage = new MobileLoginPage(_driver);
	MobileStudyPage mobileStudyPage = new MobileStudyPage(_driver);
	mobileLoginPage.closeConnectToPopup(_driver);
	mobileLoginPage.closeBarOrabgePopup(_driver);
	mobileLoginPage.clickSignUpButton();
	mobileLoginPage.clickLogin();
	mobileLoginPage.login(_driver);
	//mobileStudyPage.openTopicFeatures(_driver ,"physics", "Electric Charges And Fields", "Tests");
	mobileStudyPage.openTopicFeatures(_driver,_driver,  "physics", "Electric Charges And Fields", "Tests");
	

	}

}
