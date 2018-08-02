package com.applect.meritnation.scripts;

import java.awt.AWTException;
import org.testng.annotations.Test;
import com.applect.meritnation.generic.BaseLib;
//import com.applect.meritnation.generic.RetryAnalyzer;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.LoginPage;
import com.applect.meritnation.pageobject.StudyPage;


public class StudyTest extends BaseLib
{
	
	@Test(groups="Regression")
	public void TC_001_VerifyStudyPhysicsPageTest(){
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.verifyPhysicsPage(driver);
		BasePage.logout(driver);
		}
	@Test(groups="Regression")
	public void TC_002_verifyStudyPhysicsTopicLiveClasssesTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickTopicLiveClasses();
		studyPage.clickTakeTestOnLiveClasses();
		BasePage.logout(driver);
	}
	
	@Test(groups="Regression")
	public void TC_003_VerifyStudyPhysicsTopicConceptsTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickConcepts();
		studyPage.answerTopicTest();
		BasePage.logout(driver);
		}
	@Test(groups="Regression", invocationCount=1)
	public void TC_004_VerifyStudyPhysicsTopicPracticeTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickPractice(driver);
		BasePage.logout(driver);
		}
	@Test(groups="Regression")
	public void TC_005_VerifyStudyPhysicsTopicAssignmentTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickAssignment();
		studyPage.takeTestOnAssignment();
		BasePage.logout(driver);
	}
	@Test(groups="Regression")
	public void TC_006_VerifyStudyPhysicsTopicTestsTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickTest();
		BasePage.logout(driver);
	}
	@Test(groups="FunctionalityChanged")
	public void TC_007_VerifyStudyPhysicsTopicPupularQuestionsTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickPopularQuestions(driver);
		BasePage.logout(driver);
		
	}
	@Test(groups="Notfortest")
	public void TC_008_VerifyStudyPhysicsTopicActivitiesTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickActivities();
		BasePage.logout(driver);
	}
	@Test(groups="Regression")
	public void TC_009_VerifyStudyPhysicsTopicRevisionNotesTest() throws AWTException
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickRevisionNotes();
		studyPage.downloadPDF(driver);
		BasePage.logout(driver);
	}
	@Test(groups="Regression")
	public void TC_010_VerifyStudyPhysicsTopicBoardPaperQuestionsTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickBoardPaperQueestions();
		BasePage.logout(driver);
}
	@Test(groups="Regression")
	public void TC_011_VerifyStudyPhysicsTopicFormativeAssesmentTest()
	{
		BasePage.login(driver);
		StudyPage studyPage = new StudyPage(driver);
		studyPage.moveToStudyBoxAndClickPhysics(driver);
		studyPage.clickPhysicsSubject(driver);
		studyPage.clickFormativeAssesment(driver);
		BasePage.logout(driver);
		
	}
	@Test
	public void TC_012_verifyStudyBiologyTopicLiveClasssesTest()
	{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickTopicLiveClasses();
			studyPage.clickTakeTestOnLiveClasses();
			BasePage.logout(driver);
		}
		@Test
		public void TC_013_VerifyStudyBiologyTopicConceptsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickConcepts();
			studyPage.answerTopicTest();
			BasePage.logout(driver);
			}
		@Test
		public void TC_014_VerifyStudyBiologyTopicPracticeTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickPractice(driver);
			BasePage.logout(driver);
			}
		@Test
		public void TC_015_VerifyStudyBiologyTopicAssignmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);;
			studyPage.clickAssignment();
			studyPage.takeTestOnAssignment();
			BasePage.logout(driver);
		}
		@Test
		public void TC_016_VerifyStudyBiologyTopicTestsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickTest();
			BasePage.logout(driver);
		}
		@Test
		public void TC_017_VerifyStudyBiologyTopicPupularQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickPopularQuestions(driver);
			BasePage.logout(driver);
			
		}
		@Test(groups="Notfortest")
		public void TC_018_VerifyStudyBiologyTopicActivitiesTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickActivities();
			BasePage.logout(driver);
		}
		@Test
		public void TC_019_VerifyStudyBiologyTopicRevisionNotesTest() throws AWTException
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);;
			studyPage.clickRevisionNotes();
			studyPage.downloadPDF(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_020_VerifyStudyBiologyTopicBoardPaperQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickBoardPaperQueestions();
			BasePage.logout(driver);
	     }
		@Test
		public void TC_021_VerifyStudyBiologyTopicFormativeAssesmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickBiology(driver);
			studyPage.clickBiologySubject(driver);
			studyPage.clickFormativeAssesment(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_022_verifyStudyMathTopicLiveClasssesTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickTopicLiveClasses();
			studyPage.clickTakeTestOnLiveClasses();
			BasePage.logout(driver);
		}
		@Test
		public void TC_023_VerifyStudyMathTopicConceptsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickConcepts();
			studyPage.answerTopicTest();
			BasePage.logout(driver);
			}
		@Test
		public void TC_024_VerifyStudyMathTopicPracticeTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickPractice(driver);
			BasePage.logout(driver);
			}
		@Test
		public void TC_025_VerifyStudyMathTopicAssignmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickAssignment();
			studyPage.takeTestOnAssignment();
			BasePage.logout(driver);
		}
		@Test
		public void TC_026_VerifyStudyMathTopicTestsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickTest();
			BasePage.logout(driver);
		}
		@Test
		public void TC_027_VerifyStudyMathTopicPupularQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickPopularQuestions(driver);
			BasePage.logout(driver);
			
		}
		@Test
		public void TC_028_VerifyStudyMathTopicRevisionNotesTest() throws AWTException
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickRevisioNotesOnMath();
			studyPage.downloadPDF(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_029_VerifyStudyMathTopicBoardPaperQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickBoardPaperQuestionsOnMath();
			BasePage.logout(driver);
		}
		@Test
		public void TC_030_VerifyStudyMathTopicFormativeAssesmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickMath(driver);
			studyPage.clickMathSubject(driver);
			studyPage.clickFormativeAssesmentOnMath(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_031_verifyStudyChemistryTopicLiveClasssesTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickTopicLiveClasses();
			studyPage.clickTakeTestOnLiveClasses();
			BasePage.logout(driver);
		}
		@Test
		public void TC_032_VerifyStudyChemistryTopicConceptsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickConcepts();
			studyPage.answerTopicTest();
			BasePage.logout(driver);
			}
		@Test
		public void TC_033_VerifyStudyChemistryTopicPracticeTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickPractice(driver);
			BasePage.logout(driver);
			}
		@Test
		public void TC_034_VerifyStudyChemistryTopicAssignmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickAssignment();
			studyPage.takeTestOnAssignment();
			BasePage.logout(driver);
		}
		@Test
		public void TC_035_VerifyStudyChemistryTopicTestsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickTest();
			BasePage.logout(driver);
		}
		@Test
		public void TC_036_VerifyStudyChemistryTopicPupularQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickPopularQuestions(driver);
			BasePage.logout(driver);
			
		}
		@Test(groups="Notfortest")
		public void TC_037_VerifyStudyChemistryTopicActivitiesTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickActivities();
			BasePage.logout(driver);
		}
		@Test
		public void TC_038_VerifyStudyChemistryTopicRevisionNotesTest() throws AWTException
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickRevisionNotes();
			studyPage.downloadPDF(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_039_VerifyStudyChemistryTopicBoardPaperQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickBoardPaperQueestions();
			BasePage.logout(driver);
	}
		@Test
		public void TC_040_VerifyStudyChemistryTopicFormativeAssesmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickChemistry(driver);
			studyPage.clickChemistrySubject(driver);
			studyPage.clickFormativeAssesment(driver);
			BasePage.logout(driver);
		}
/*		@Test(retryAnalyzer = RetryAnalyzer.class)
		public void TC_041_VerifyStudyEnglishTopicLiveClassesTest(){
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickTopicLiveClasses();
			studyPage.clickTakeTestOnLiveClasses();
			BasePage.logout(driver);
			}*/
		@Test
		public void TC_042_VerifyStudyEnglishTopicConceptsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickConceptsOnEnglish(driver);
			studyPage.answerTopicTest();
			BasePage.logout(driver);
		}
		@Test
		public void TC_043_VerifyStudyEnglishTopicAssignmentTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickAssignmentOnEnglish();
			studyPage.takeTestOnAssignment();
			BasePage.logout(driver);
		}
		@Test
		public void TC_044_VerifyStudyEnglishTopicTestsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickTestOnEnglish();
			BasePage.logout(driver);
		}
		@Test
		public void TC_045_VerifyStudyEnglishTopicPupularQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickPopularQuestionsOnEnglish(driver);
			BasePage.logout(driver);
			}
		@Test(groups="Notfortest")
		public void TC_046_VerifyStudyEnglishTopicActivitiesTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickActivitiesOnEnglish();
			BasePage.logout(driver);
			}
		@Test
		public void TC_047_VerifyStudyEnglishTopicRevisionNotesTest() throws AWTException
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEnglish(driver);
			studyPage.clickEnglishSubject(driver);
			studyPage.clickRevisionNotesOnEnglish();
			studyPage.downloadPDF(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_048_VerifyStudyEconomicsTopicConceptsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEconomics(driver);
			studyPage.clickEconomicsSubject(driver);
			studyPage.clickConceptsOnEconomics();
			BasePage.logout(driver);
		}
		@Test
		public void TC_049_VerifyStudyEconomicsTopicTestsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEconomics(driver);
			studyPage.clickEconomicsSubject(driver);
			studyPage.clickTestOnEconomics();
			BasePage.logout(driver);
		}
		@Test
		public void TC_050_VerifyStudyEconomicsTopicPupularQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEconomics(driver);
			studyPage.clickEconomicsSubject(driver);
			studyPage.clickPopularQuestionsOnEconomics(driver);
			BasePage.logout(driver);
			}
		@Test(groups="Notfortest")
		public void TC_051_VerifyStudyEconomicsTopicRevisionNotesTest() throws AWTException
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEconomics(driver);
			studyPage.clickEconomicsSubject(driver);
			studyPage.clickRevisionNotesOnEconomics();
			studyPage.downloadPDF(driver);
			BasePage.logout(driver);
		}
		@Test
		public void TC_052_VerifyStudyEconomicsTopicBoardPaperQuestionsTest()
		{
			BasePage.login(driver);
			StudyPage studyPage = new StudyPage(driver);
			studyPage.moveToStudyBoxAndClickEconomics(driver);
			studyPage.clickEconomicsSubject(driver);
			studyPage.clickBoardPaperQuestionsOnEconomics();
			BasePage.logout(driver);
		}
		@Test(groups="CurrentTask")
		public void TC_053_VerifyBoardPapterSolutionTest(){
			LoginPage loginPage = new LoginPage(driver);
			StudyPage studyPage = new StudyPage(driver);
			
			for(int j=1;j<=3;j++)
			{
				loginPage.loginButtonClick(driver);
				loginPage.enterUserName(driver, 39, j);
				loginPage.enterPassword(driver);
				loginPage.signInBtnClick(driver);
				studyPage.verifyBoardPaperSolution(driver);
				BasePage.logout(driver);
				}
		}
}
