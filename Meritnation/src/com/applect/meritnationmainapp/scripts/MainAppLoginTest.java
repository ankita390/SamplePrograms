package com.applect.meritnationmainapp.scripts;



import java.net.MalformedURLException;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.MainAppLoginPage;


public class MainAppLoginTest extends BaseLib {
	
	@Test(groups = "MainApp")
	public void TC_001_VerifyValidLogin() {
		
		MainAppLoginPage mainAppLoginPage = new MainAppLoginPage(driver);
		try {
			mainAppLoginPage.askQuestionOnDOC(driver);
		} catch (MalformedURLException | InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
