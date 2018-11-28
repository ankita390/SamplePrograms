package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.LogoutPage;

public class LogoutTest extends BaseLib{
	
	@Test(groups = "lol")
	public void TC_001_VerifyHomePageTest(){
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickLinkAndVerifyURL(driver);
		}
	@Test(groups = "CurrentTa")
	public void TC_002_VerifyPurchasedProductPrice(){
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.verifyPriceForPurchasedProduct(driver);
	}

}
