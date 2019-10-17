package com.applect.meritnation.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class CreateAccountTest extends BaseLib {

	@Test(invocationCount = 1, groups = "CurrentTask", priority = 1)
	public void TC_001_CreateAccountTest() {
		createAccountPage.createAccount();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}

	@Test(groups = "CurrentTas")
	public void TC_002_ANARegistrationTest() throws IOException {
		loginPage.proceedToNext(driver);
		BasePage.signup(driver);
		BasePage.logout(driver);

	}

	@Test(groups = "CurrentTas")
	public void TC_003_brdRegistrationTest() {
		loginPage.BrdLogIN();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}

	// to test
	@Test(groups = "")
	public void TC_004_demoRegistrationTest() {
		loginPage.demologin();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}

	@Test(groups = "CurrentTas")
	public void TC_005_chapterRegistrationTest() {
		loginPage.chapterregistration();
		BasePage.signup(driver);
		BasePage.logout(driver);
	}

	// to test
	@Test(groups = "")
	public void TC_006_ncertregistration() {
		loginPage.ncertregistration();
		loginPage.enterUserName(driver);

	}

	@Test(groups = "CurrentTas")
	public void TC_008_testregistration() {
		loginPage.testprep(driver);
		BasePage.signup(driver);
		loginPage.logout();
	}

	@Test(groups = "CurrentTas")
	public void TC_009_livenewregistration() {
		loginPage.livenewreg();
		BasePage.signup(driver);
		createAccountPage.gotodashboard(driver);
		BasePage.logout(driver);
	}

	@Test(groups = "CurrentTas")
	public void TC_010_juniorregis() throws Exception {
		loginPage.juniorregistration(driver);

	}

	@Test(groups = "CurrentTas")
	public void TC_011_chapwaitreg() {
		loginPage.chapwaitreg(driver);
	}

	@Test(groups = "CurrentTas")
	public void TC_012_ncrtwaitreg() {
		loginPage.ncertwaitreg(driver);
		BasePage.logout(driver);
	}

}
