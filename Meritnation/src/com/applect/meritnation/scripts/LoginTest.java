package com.applect.meritnation.scripts;

import org.openqa.selenium.remote.server.log.LoggingOptions;
import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class LoginTest extends BaseLib {

	@Test(groups = "Regression")
	public void TC_001_LoginTest() {
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		loginPage.checkHeaderDisplay(driver);
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}

	@Test(groups = "Access")
	public void TC_002_AllUserLoginTest() {
		for (int k = 3; k <= 8; k++) {
			loginPage.loginButtonClick(driver);
			loginPage.enterUserNameAllClasses(driver, k);
			loginPage.enterPassword(driver);
			loginPage.signInBtnClick(driver);
			loginPage.checkHeaderDisplayForAllClasses(driver, k);
			createAccountPage.verifyPaidAccess(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.verifyPaidSubscription(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.logoutClick(driver);
		}
	}

	@Test(groups = "Access")
	public void TC_003_AllSpecificPackageUserLoginTest() {
		for (int k = 9; k <= 14; k++) {
			loginPage.loginButtonClick(driver);
			loginPage.enterUserNameAllClasses(driver, k);
			loginPage.enterPassword(driver);
			loginPage.signInBtnClick(driver);
			loginPage.checkHeaderDisplayForAllClassesSpecificUsers(driver, k);
			createAccountPage.verifyPaidAccess(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.verifyPaidSubscription(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.logoutClick(driver);
		}
	}

	
	@Test(groups = "CurrentTas")
	public void TC_004_VerifyHeaderMenuInDifferentGrade(){
	LoginPage loginPage = new LoginPage(driver);
	CreateAccountPage createAccountPage = new CreateAccountPage(driver);
	loginPage.loginButtonClick(driver);
	loginPage.loginUserForchangeGradeFromProfile(driver);
	loginPage.enterPassword(driver);
	loginPage.signInBtnClick(driver);
	loginPage.clickOnProfileFromDashboardHeader(driver);
	loginPage.changeGradeFromProfile(driver);
	loginPage.checkOnlyHeader(driver);
	loginPage.verifyHeaderTest(driver);
	loginPage.clickOnProfileFromDashboardHeader(driver);
	loginPage.againChangeGradeFromProfile(driver);
	loginPage.clickOnProfileFromDashboardHeader(driver);
	createAccountPage.logoutClick(driver);
	}

	@Test(groups = "Regression")
	public void TC_005_VerifyDashboard() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver, 1,16);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		loginPage.verifyDashboard(driver); 
		
	}
	

}
