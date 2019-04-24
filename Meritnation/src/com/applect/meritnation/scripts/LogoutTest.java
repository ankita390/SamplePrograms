package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.LogoutPage;

public class LogoutTest extends BaseLib{
	
	@Test(groups = "CurrentTas")
	public void TC_001_VerifyHomePageTest(){
		LogoutPage logoutPage = new LogoutPage(driver);
	//	logoutPage.getURLS();
		logoutPage.clickLinkAndVerifyURL(driver);
		}
	@Test(groups = "CurrentTas")
	public void TC_002_VerifyPurchasedProductPrice(){
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.verifyPriceForPurchasedProduct(driver);
	}

}
