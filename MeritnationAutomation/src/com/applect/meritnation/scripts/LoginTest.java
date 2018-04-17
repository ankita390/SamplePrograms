package com.applect.meritnation.scripts;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class LoginTest extends BaseLib
{
	
	@Test(groups="Regression")
	public void TC_001_LoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		loginPage.checkHeaderDisplay(driver);
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	@Test(groups="Access")
	public void TC_002_AllUserLoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		for(int k=3;k<=8;k++)
		{
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
	@Test(groups="Access")
	public void TC_003_AllSpecificPackageUserLoginTest(){
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		for(int k=9;k<=14;k++)
		{
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
}
