package com.applect.meritnationmainapp.scripts;



import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MainAppLoginPage;


public class MainAppLoginTest extends BaseLib {
	
	@Test(groups = "MainApp")
	public void TC_001_VerifyValidLogin() {
		
		MainAppLoginPage mainAppLoginPage = new MainAppLoginPage(driver);
		mainAppLoginPage.askQuestionOnDOC(driver);
		
		
	}

}
