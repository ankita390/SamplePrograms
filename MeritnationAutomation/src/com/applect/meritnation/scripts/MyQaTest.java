package com.applect.meritnation.scripts;


import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.MyQaPage;

public class MyQaTest extends BaseLib
{
	@Test(groups="Regression")
	public void AskQuestionTest()
	{
		MyQaPage myQaPage = new MyQaPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick();
		myQaPage.clickRecommendedQuestions(driver);
		myQaPage.clickAsk(driver);
		myQaPage.enterQuestion(driver);
		myQaPage.submitQuestion();
		myQaPage.tagQuestion();
		myQaPage.chooseChapter(driver);
		myQaPage.finalSubmit();
		myQaPage.closeQuestenPostedPopup();
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	
	
	
}
