package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.LogoutPage;

public class LogoutTest extends BaseLib{
	
	@Test(groups = "ppp")
	public void TC_001_VerifyHomePageTest(){
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.clickLinkAndVerifyURL(driver);
		
		
		}

}
