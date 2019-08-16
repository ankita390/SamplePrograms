package com.applect.meritnation.scripts;



import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.CreateAccountPage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.LogoutPage;

import java.awt.AWTException;

import org.testng.Assert;
import com.applect.meritnation.pageobject.AsknAnswerPage;
import com.applect.meritnation.pageobject.BasePage;

public class AsknAnswerTest extends BaseLib 
{
	@Test(groups="Regression")
	public void TC_001_AskQuestionTest()
	{
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		LoginPage loginPage = new LoginPage(driver);
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.clickAsk(driver);
		asknAnswerPage.enterQuestion(driver);
		asknAnswerPage.submitQuestion();
		asknAnswerPage.tagQuestion(driver);
		asknAnswerPage.chooseChapter(driver);
		asknAnswerPage.finalSubmit();
		asknAnswerPage.closeQuestenPostedPopup();
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);
	}
	@Test(groups="ask")
	public void TC_002_VerifyRecommendedQuestionsPageDetailsTest()
	{
		
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		BasePage.login(driver);
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.verifyAskQuestionPlaceHolder();
		asknAnswerPage.verifyTabsOnRecommendedQuestions(driver);
		BasePage.logout(driver);
		}
	@Test(groups="Regression")
	public void TC_003_VerifyUserProfileFromRecommendedQuestionsTest(){
		LoginPage loginPage = new LoginPage(driver);
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		BasePage.login(driver);
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.clickkUserProfileOnRecommendedQuestions();
		loginPage.checkOnlyHeader(driver);
		}
	
	@Test(groups="ask")
	public void TC_004_VerifyAskedquestionDetailFromRecommendedQuestionsTest(){
		LoginPage loginPage = new LoginPage(driver);
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		BasePage.login(driver);
		asknAnswerPage.clickRecommendedQuestions(driver);
		String askeename= asknAnswerPage.questionaskeename.get(0).getText();
		String askedquestion = asknAnswerPage.askedquestions.get(0).getText().substring(0, asknAnswerPage.askedquestions.get(0).getText().length()-3);
		asknAnswerPage.clickkAskedQuestionOnRecommendedQuestions(driver);
		loginPage.checkOnlyHeader(driver);
		asknAnswerPage.verifyAskQuestionPlaceHolder();
		Assert.assertTrue(asknAnswerPage.questionaskeenameonchildwndw.get(0).getText().equalsIgnoreCase(askeename));
		Assert.assertTrue(asknAnswerPage.questionaskedonchildwndw.getText().contains(askedquestion));
		asknAnswerPage.verifyClildWindowElementsOnQuestionClick(driver);
		driver.close();
		BasePage.switchToParentWindow(driver);
		BasePage.logout(driver);
		}
	
	@Test(groups = "Regression")
	public void TC_001_AskQuestionTestWithImage() throws InterruptedException, AWTException {
		AsknAnswerPage asknAnswerPage = new AsknAnswerPage(driver);
		LoginPage loginPage = new LoginPage(driver);
	    CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		asknAnswerPage.clickRecommendedQuestions(driver);
		asknAnswerPage.clickAsk(driver);
		Thread.sleep(3000);
		asknAnswerPage.uploadImage(driver);
		asknAnswerPage.enterQuestion(driver);
		asknAnswerPage.submitQuestion();
		asknAnswerPage.tagQuestion(driver);
		asknAnswerPage.chooseChapter(driver);
		asknAnswerPage.finalSubmit();
		asknAnswerPage.closeQuestenPostedPopup();
		createAccountPage.clickProfileIcon(driver);
		createAccountPage.logoutClick(driver);

	}
	
	@Test(groups = "Purchase")
	public void TC_011_OrderFromFrontEnd() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginButtonClick(driver);
		loginPage.enterUserName(driver);
		loginPage.enterPassword(driver);
		loginPage.signInBtnClick(driver);
		LogoutPage logoutPage = new LogoutPage(driver);
		logoutPage.verifyEneToEndPurchase(driver);

	}
}
