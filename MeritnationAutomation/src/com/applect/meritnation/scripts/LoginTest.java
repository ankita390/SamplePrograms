package com.applect.meritnation.scripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.generic.RetryAnalyzer;
import com.applect.meritnation.generic.WaitStatementLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;

public class LoginTest extends BaseLib
{
	@Test(groups="Regression")
	public void LoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick();
		loginPage.checkHeaderDisplay(driver);
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	@Test
	public void AllUserLoginTest()
	{
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		for(int k=3;k<=8;k++)
		{
			loginPage.loginButtonClick(driver);
			loginPage.enterUserNameAllClasses(driver, k);
			loginPage.enterPassword(driver);
			loginPage.signInBtnClick();
			loginPage.checkHeaderDisplayForAllClasses(driver, k);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.verifyPaidSubscription(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.logoutClick(driver);
		}
	}
	@Test(groups="Detail")
	public void AllSpecificPackageUserLoginTest(){
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		for(int k=9;k<=14;k++)
		{
			loginPage.loginButtonClick(driver);
			loginPage.enterUserNameAllClasses(driver, k);
			loginPage.enterPassword(driver);
			loginPage.signInBtnClick();
			loginPage.checkHeaderDisplayForAllClassesSpecificUsers(driver, k);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.verifyPaidSubscription(driver);
			createAccountPage.clickProfileIcon(driver);
			createAccountPage.logoutClick(driver);
		}
	}
}
