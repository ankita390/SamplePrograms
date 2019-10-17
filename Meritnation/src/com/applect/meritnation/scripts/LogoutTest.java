package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.LogoutPage;

public class LogoutTest extends BaseLib {

	@Test(groups = "CurrentTas")
	public void TC_001_VerifyHomePageTest() {
		// logoutPage.getURLS();
		logoutPage.clickLinkAndVerifyURL(driver);
	}

	@Test(groups = "CurrentTas")
	public void TC_002_VerifyPurchasedProductPrice() {
		logoutPage.verifyPriceForPurchasedProduct(driver);
	}

}
