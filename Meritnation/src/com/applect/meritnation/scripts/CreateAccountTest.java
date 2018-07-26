package com.applect.meritnation.scripts;

import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;

public class CreateAccountTest extends BaseLib
{
	@Test(invocationCount=1, groups="Regression")
	public void TC_001_CreateAccountTest() 
	{
		
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.createAccount();
		createAccountPage.enterName();
		createAccountPage.enterEmail();
		createAccountPage.enterPassword();
		createAccountPage.enterPincode();
		createAccountPage.enterMobile();
		createAccountPage.enterUserCourse();
		createAccountPage.enterUserClass();
		createAccountPage.selectUserAsStudent();
		createAccountPage.joinNow(driver);
		createAccountPage.enterSchoolName(driver);
		BasePage.logout(driver);
		}
	
	@Test
	public void TC_002_CreateAccountAllBoardTest(){
		
		
		
	}
	

}
