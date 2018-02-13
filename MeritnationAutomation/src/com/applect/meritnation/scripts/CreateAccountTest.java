package com.applect.meritnation.scripts;

import org.testng.annotations.Test;







import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.CreateAccountPage;

public class CreateAccountTest extends BaseLib
{
	@Test(invocationCount=1, groups="Regression")
	public void createAccountTest() 
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
		createAccountPage.selectuserAs();
		createAccountPage.joinNow();
		createAccountPage.enterSchoolName(driver);
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
		
		
		}
	}
