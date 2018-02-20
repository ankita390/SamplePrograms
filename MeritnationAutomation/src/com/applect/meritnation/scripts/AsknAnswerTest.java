package com.applect.meritnation.scripts;


import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.AsknAnswerPage;

public class AsknAnswerTest extends BaseLib
{
	@Test(groups="Regression")
	public void TC_001AskQuestionTest()
	{
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick();
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.clickAsk(driver);
		asknAnswerPage.enterQuestion(driver);
		asknAnswerPage.submitQuestion();
		asknAnswerPage.tagQuestion();
		asknAnswerPage.chooseChapter(driver);
		asknAnswerPage.finalSubmit();
		asknAnswerPage.closeQuestenPostedPopup();
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	@Test(groups="Detail")
	public void TC_002VerifyRecommendedQuestionsPageDetailsTest()
	{
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick();
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.verifyAskQuestionPlaceHolder();
		asknAnswerPage.verifyTabsOnRecommendedQuestions(driver);
	}
	
	
}
