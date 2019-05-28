package com.applect.meritnation.pageobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.applect.meritnation.generic.WaitStatementLib;

public class StudyPage {
	
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]")
	protected WebElement studybx;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[1]/a[text()='Physics']")
	private WebElement physicsicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[1]/a[text()='Accountancy']")
	private WebElement accountancyicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[1]/a[text()='Science']")
	private WebElement scienceicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[5]/a[text()='Hindi']")
	private WebElement hindiicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[2]/a[contains(text(),'Business')]")
	private WebElement business_studiesicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[2]/a[text()='Chemistry']")
	private WebElement chemistryicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[3]/a[text()='Biology']")
	private WebElement biologyicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[4]/a[text()='Math']")
	private WebElement mathicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[5]/a[text()='English']")
	private WebElement englishicon;
	@FindBy(xpath="//div[@class='navBox']/nav/ul/li[2]/ul/li[6]/a[text()='Economics']")
	private WebElement economicsicon;
	@FindBy(xpath="//ul[@class='radioli']//a[text()=' Physics Part-I ']")
	private WebElement physicspart1radionbtn;
	@FindBy(xpath="//ul[@class='radioli']/li/a[text()=' Science ']")
	private WebElement scienceradionbtn;
	
	
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Electric Charges And Fields']")
	private WebElement electricchargesandfields;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[contains(@title,'Chemical Reaction')]")
	private WebElement chemicalReactionAndEquation;
	
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Current Electricity']")
	private WebElement physics3rdsubject;
	@FindBy(xpath="//div[@class='mysessionFilter']/div/div/ul/li/a[text()=' Chemistry Part-I ']")
	private WebElement chemistrypart1radionbtn;
	@FindBy(xpath="//div[@class='mysessionFilter']/div/div/ul/li/a[text()=' Biology ']")
	private WebElement biologyradionbtn;
	@FindBy(xpath="//div[@class='mysessionFilter']/div/div/ul/li/a[text()=' Math Part-I ']")
	private WebElement mathpart1radionbtn;
	@FindBy(xpath="//div[@class='mysessionFilter']/div/div/ul/li/a[text()=' English Grammar ']")
	private WebElement englishgrammerradionbtn;
	@FindBy(xpath="//div[@class='mysessionFilter']/div/div/ul/li/a[text()=' Introductory Microeconomics ']")
	private WebElement economicsradionbtn;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='The Solid State']")
	private WebElement thesolidstate;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Reproduction in Organisms ']")
	private WebElement biologyfirsttopic;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Relations and Functions']")
	private WebElement mathfirsttopic;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Articles']")
	private WebElement englishfirsttopic;
	@FindBy(xpath="//div[@class='allsession']/ul/li/div/img[@title='Introduction']")
	private WebElement economicsfirsttopic;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[2]/h3[text()='Live Classes']")
	private WebElement liveclasseslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[2]/h3[text()='Live Classes']")
	private WebElement liveclassesonsubjectlnk;
	@FindBy(xpath="//section[@class='whatNext']/div[@class='boxesRow group']/div/article[1]")
	private WebElement fistdisplayedtest;
	@FindBy(xpath="//div[@class='group margBottom35 ng-scope']/div/div[@class='classTestwrap textCenter ng-scope']/a")
	private WebElement taketestbtn;
	@FindBy(xpath="//div[@class='mp_user_section']/div/a/span[@class='arrow']")
	private WebElement exittestbtn;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[3]/h3[text()='Concepts']")
	private WebElement conceptslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[2]/h3[text()='Concepts']")
	private WebElement conceptsoneconomicslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[3]/h3")
	private WebElement conceptsonenglishlnk;
	@FindBy(xpath="//div[@id='studymaterial']/div[1]")
	private WebElement conceptspagecontent;
	@FindBy(xpath="//div[@id='allsession']/div")
	private WebElement pagecontent;
	@FindBy(xpath="//div[@class='topicBtn_wrap ng-scope']/a/span[text()='Topics']")
	private WebElement topicsicon;
	@FindBy(xpath="//ul[@class='dropdown topicmenu']/li/a")
	private List <WebElement> lastdrpdwntopicmenu;
	@FindBy(xpath="//div[@id='testStartButton']/a[@class='topic_test_btn'][1]")
	private List <WebElement> taketopictestbtn;
	@FindBy(xpath="//div[@class='ques']/ul[@class='topic_test_options']/li/label")
	private List <WebElement> topictest1stquestionoptions;
	@FindBy(xpath="//div[@class='topicTestSliderParent']/a[@id='nextBtn']")
	private WebElement nextbtn;
	@FindBy(xpath="//div[@id='questionWiseReport']/span[2]")
	private WebElement nextbtnontestgenerator;
	@FindBy(xpath="//div[@id='1849']/ul[@class='topic_test_options']/li/label")
	private List <WebElement> topictest2ndquestionoptions;
	@FindBy(xpath="//div[@id='1851']/ul[@class='topic_test_options']/li/label")
	private List <WebElement> topictest3rdquestionoptions;
	@FindBy(xpath="//div[@id='23351']/ul[@class='topic_test_options']/li/label")
	private List <WebElement> topictest4thquestionoptions;
	@FindBy(xpath="//div[@id='23352']/ul[@class='topic_test_options']/li/label")
	private List <WebElement> topictest5thquestionoptions;
	@FindBy(xpath="//div[@class='test_result_btn_container']/a[text()='View Solutions']")
	private WebElement viewsolnbtn;
	@FindBy(xpath="//div[@class='anaOnStudyPage--popup ng-scope']/a/i")
	private WebElement crossicon;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[4]/h3[text()='Practice']")
	private WebElement practicelnk;
	@FindBy(xpath="//div[@class='test-card__action']/button/span[text()=' START ']")
	private List <WebElement> startbtn;
	@FindBy(xpath="//div[@id='startPracticing']/a[text()='START PRACTISING']")
	private WebElement startpractisingbtn;
	@FindBy(xpath="//div[@id='questionPage1']/div/ul[@class='quesOption']/li/label/span/input")
	private List <WebElement> firstansweroptions;
	@FindBy(xpath="//div[@id='questionPage2']/div/ul[@class='quesOption']/li/label/span/input")
	private List <WebElement> secondansweroptions;
	@FindBy(xpath="//div[@id='aniTitleBlk']/div/a/span")
	private WebElement closetestcrossicon;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[5]/h3[text()='Assignments']")
	private WebElement assignmentlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[4]/h3")
	private WebElement assignmentonenglishlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[3]/h3[text()='Assignments']")
	private WebElement assignmentonsubjectlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[6]/h3[text()='Tests']")
	private WebElement testsonsubjectlnk;
	@FindBy(xpath="//div[@class='mysessionFilter']/h3[text()='Tests']")
	private WebElement testsonsubject_hindilnk;
	@FindBy(xpath="//div[@class='bottomRow']/a[contains(text(),'Take test')]")
	private List <WebElement> taketestassignmentbtn;
	@FindBy(xpath="//div[@class='bottomRow']/a[contains(text(),'View report')]")
	private List <WebElement> viewreportassignmentbtn;
	@FindBy(xpath="//div[@class='boxesRow group']/article/header/a")
	private List <WebElement> retaketestlink;
	@FindBy(xpath="//div[@class='insHeading']/a")
	private WebElement proceeedbtn;
	@FindBy(xpath="//div[@class='testSliderBlock']/ul/li/label/span")
	private List <WebElement> questionannsweroptions;
	@FindBy(xpath="//div[@class='exit_game_button']/a[@class='pause']")
	private WebElement pausetestbtn;
	@FindBy(xpath="//div[@class='confirmetionAlertNew']/div/div/div/a[text()='Yes']")
	private WebElement yesbtn_confpopup;
	@FindBy(xpath="//div[@class='mp_user_section']/div")
	private WebElement gobackbtn;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[6]/h3") 
	protected WebElement testslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[5]/h3")
	private WebElement testsonenglishlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[3]/h3[text()='Tests']")
	private WebElement testsoneconomicslnk;
	@FindBy(xpath="//div[@class='test-card__action']/div/button[text()=' START TEST']")
	private List <WebElement> starttestbtn;
	@FindBy(xpath="//div[@class='test-card__action']/div/button")
	private List <WebElement> starttestbtnOnTests;
	@FindBy(xpath="//div[@class='test-card__action']/div/button[text()= ' VIEW REPORT ']")
	private List <WebElement> viewreportbtn;
	@FindBy(xpath="//div[@class='confirmetionAlertNew']/div/div/div/a[text()='View Solution Later']")
	private WebElement viewsolnlaterbtn;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[7]/h3[text()='Popular Questions ']")
	private WebElement pupolarquestionslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[6]/h3")
	private WebElement pupolarquestionsonenglishlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[4]/h3['Popular Questions ']")
	private WebElement pupolarquestionsoneconomicslnk;
	@FindBy(xpath="//div[@class='commentContainer']/div")
	private List <WebElement> allpopularquestions;
	@FindBy(xpath="//div[@class='commentContainer']/div/div/div[@class='bottom-ques_box group']/div/a")
	private List <WebElement> allpopularquestionsanswers;
	@FindBy(xpath="//div[@class='jeeMainInner jeeMaxWidth group anaMainInner']/main/div")
	private List <WebElement> childtabelements;
	@FindBy(xpath="//div[@class='jeeMainInner jeeMaxWidth group anaMainInner']/main/div/div/div/div/div/a")
	private List <WebElement> likebtns;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[8]/h3[text()='Activities']")
	private WebElement activitieslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[7]/h3")
	private WebElement activitiesonenglishlnk;
	@FindBy(xpath="//a[@class='activity-card ng-scope']/div[@class='activity__action textCenter']/button[text()='START']")
	private List <WebElement> startpuzzlebtns;
	@FindBy(xpath="//div[@class='syllaBus']")
	private List <WebElement> puzzlepopup;
	@FindBy(xpath="//div[@class='testmnPopup']/div/i")
	private List <WebElement> closepuzzle;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[9]/h3[text()='Revision Notes']")
	private WebElement revisionnoteslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[8]/h3")
	private WebElement revisionnotesonenglishlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[5]/h3[text()='Revision Notes']")
	private WebElement revisionnotesoneconomicslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[8]/h3[text()='Revision Notes']")
	private WebElement revisionnotesonmath;
	@FindBy(xpath="//div[@id='testdiv']")
	private WebElement revisionnotescontent;
	@FindBy(xpath="//div[@id='testdiv']/div[@id='download']/a")
	private WebElement dwnldpdfbtn;
	@FindBy(xpath="//button[contains(text(),'Change')]")
	private WebElement changeBtn;
	
	@FindBy(xpath="//span[text()='Save as PDF']")
	private WebElement saveAsPdfBtn;
	
	
	
	@FindBy(xpath="//div[@id='print-header']/div/button[text()='Save']")
	private WebElement printpreviewsavebtn;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[10]/h3[text()='Formative Assessment']")
	private WebElement formativeassessmentlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[9]/h3[text()='Formative Assessment']")
	private WebElement formativeassessmentonmathlnk;
	@FindBy(xpath = "//div[@id='webengage-notification-container']/iframe")
	private WebElement frame;
	@FindBy(xpath="//div[@class='tablerow']/div[3]/i")
	private WebElement closeboardpprnotification;
	@FindBy(xpath = "//div[@class='fat']/div[2]/form/table/tbody/tr[5]/td[2]/div/input[contains(text(),'')]")
	private WebElement startevaluationbtn;
	@FindBy(xpath = "//tbody/tr/td[2]/table/tbody/tr/td/div/div/div[2]/table/tbody/tr/td[3]")
	private WebElement continuelaterbtn1;
	@FindBy(xpath = "//div[@id='responseButtonDiv']/input[@type='submit']")
	private WebElement continuelaterbtn2;
	@FindBy(xpath = "//div[@class='style1 pad2 bgNone bold alignC']")
	private WebElement viewsolnsbtn;
	@FindBy(xpath = "//div[@id='TB_window']/div/div[@id='TB_closeAjaxWindow']/a")
	private WebElement closeviewsolns;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[10]/h3")
	private WebElement boardpaperquestionlnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[6]/h3[text()='Board Paper Questions']")
	private WebElement boardpaperquestiononeconomicslnk;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div/div[10]/h3")
	private WebElement boardpaperquestiononmathlnk;
	@FindBy(xpath="//div[@class='JeeSection']")
	private WebElement boardpaperquestioncontent;
	@FindBy(xpath="//div[@class='solutionBtnDv']/a")
	private List <WebElement> viewsolnbtns;
	@FindBy(xpath="//div[@class='profilcePic']/div/img")
	private WebElement profileicon;
	@FindBy(xpath="//div[@class='logout_info_box']")
	public WebElement logoutbx;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[5]/h3[text()='Textbook Solutions']")
	public WebElement textbooksolutionsonsubjectlnk;
	@FindBy(xpath="//div[@class='c_name']/a")
	public List <WebElement> topicstextbooksolutionson;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[6]/h3")
	public WebElement testslink;	
	@FindBy(xpath="//div[@class='right-side ']/div/section/div/i")
	public WebElement subjectarrow;
	@FindBy(xpath="//div[@class='right-side ']/div/section/ul/li")
	public List <WebElement> subjectlist;
	@FindBy(xpath="//div[@id='allsession']/div/button[@id='myDemobtn']")
	public WebElement generatetestbtn;
	@FindBy(xpath="//div[@id='allsession']/div/div/span")
	public WebElement generatetestinstruction;
	@FindBy(xpath="//div[@id='allsession']/ul/li")
	public List <WebElement> topicsfortestgenerate;
	@FindBy(xpath="//div[@id='allsession']/div[@id='tgBox']/button")
	public WebElement generatetestbtnactual;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[2]")
	public WebElement liveclasssesonenglish;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[3]")
	public WebElement conceptsonenglish;
	@FindBy(xpath="//div[@id='allsession']/section/div/span")
	public WebElement norecordfoundonliveclasses;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[6]/div/div/ul/li[3]")
	public WebElement brdpprsolnradiobtn_science;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[6]/div/div/ul/li[2]")
	public WebElement brdpprsolnradiobtn_commerce;
	@FindBy(xpath="//a[text()='Board Paper Solutions']")
	public WebElement brdpprsolnradiobtn_classten_hindi;
	@FindBy(xpath="//main[@id='mainContent']/div/h1")
	public WebElement brdpprsolntitle;
	@FindBy(xpath="//main[@id='mainContent']/div/div/ul/li")
	public List <WebElement> brdpprsolnyearrwise;
	@FindBy(xpath="//div[@class='profileWrapper']/div[@class='usrInfoBox']/div[@class='usr_grade']/span")
	public WebElement usrgrade;
	@FindBy(tagName="iframe")
	private WebElement frameOnFormativeAssesmnt;	
	@FindBy(xpath="//div[@class='close tablecell']")
	private WebElement closeOrangePopup;
	@FindBy(xpath="//div[@class='sidebarInner']/div/div[4]/h3[text()='Chapters']")
	private WebElement clickChapter;
	@FindBy(xpath="//a[@href=\'/etutor/etutor_class_student_maps/classList\']")
	private WebElement Livebtn;
	@FindBy(xpath="//div[@id='main_section']/table/tbody/tr[2]/td[5]/a[1]/span")
	private WebElement start;
	@FindBy(xpath="//div[@class='ng-scope layout-row']")
	private WebElement crystal;
	
	public StudyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickChaptersAClassTen(WebDriver driver){
		if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			try{
			driver.switchTo().frame(frame);
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeOrangePopup);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
			driver.switchTo().defaultContent();
			}
		}
		clickChapter.click();
		
	}
	public void verifyBoardPaperSolution(WebDriver driver)
	{
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true")
			{
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
			try
			{
			driver.switchTo().frame(frame);
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, closeOrangePopup);
			closeOrangePopup.click();
			BasePage.sleepForMilliSecond(1000);
			driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				}
			catch(TimeoutException ex){
				driver.switchTo().defaultContent();
				}
		}
		createAccountPage.clickProfileIcon(driver);
		if (usrgrade.getText().contains("CBSE XII-SCIENCE")){
			moveToStudyBoxAndClickPhysics(driver);
			testsonsubjectlnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_science);
			brdpprsolnradiobtn_science.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnyearrwise.get(0));
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 12-Science 2019 Physics Delhi(Set 1) - Solutions"), "Class-12 science physics set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 12-Science 2019 Physics Delhi(Set2) - Solutions"), "Class-12 science physics set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 12-Science 2019 Physics Delhi(Set 3) - Solutions"), "Class-12 science physics set 3: Board paper solution link not available");
			if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
				try{
				driver.switchTo().frame(frame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, closeOrangePopup);
				closeOrangePopup.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
				}
				catch(ElementNotVisibleException ex){
					
				}
				catch(TimeoutException ex){
					driver.switchTo().defaultContent();
					}
			}
			moveToStudyBoxAndClickChemistry(driver);
			testsonsubjectlnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_science);
			brdpprsolnradiobtn_science.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolntitle);
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 12-Science 2019 Chemistry Delhi(Set 1) - Solutions"), "Class-12 science chemistry set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 12-Science 2019 Chemistry Delhi(Set 2) - Solutions"), "Class-12 science chemistry set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 12-Science 2019 Chemistry Delhi(Set 3) - Solutions"), "Class-12 science chemistry set 3: Board paper solution link not available");
			
			
		}
		else if (usrgrade.getText().contains("CBSE XII-COMMERCE")){
			moveToStudyBoxAndClickAccountancy(driver);
			testsonsubjectlnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_commerce);
			brdpprsolnradiobtn_commerce.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnyearrwise.get(0));
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 12-Commerce 2019 Accountancy Delhi(Set 1) - Solutions"), "Class-12 Commerce Accountancy set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 12-Commerce 2019 Accountancy Delhi(Set 2) - Solutions"), "Class-12 Commerce Accountancy set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 12-Commerce 2019 Accountancy Delhi(Set 3) - Solutions"), "Class-12 Commerce Accountancy set 3: Board paper solution link not available");
			if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
				try{
				driver.switchTo().frame(frame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, closeOrangePopup);
				closeOrangePopup.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
				}
				catch(ElementNotVisibleException ex){
					
				}
				catch(TimeoutException ex){
					driver.switchTo().defaultContent();
					}
			}
			moveToStudyBoxAndClickBusinessStudies(driver);
			testsonsubjectlnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_commerce);
			brdpprsolnradiobtn_commerce.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnyearrwise.get(0));
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 12-Commerce 2019 Business Studies Delhi(Set 1)"), "Class-12 Commerce Business Studies set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 12-Commerce 2019 Business Studies Delhi(Set 2)"), "Class-12 Commerce Business Studies set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 12-Commerce 2019 Business Studies Delhi(Set 3)"), "Class-12 Commerce Business Studies set 3: Board paper solution link not available");
			
			}
		else if (usrgrade.getText().contains("CBSE X")){
			moveToStudyBoxAndClickScience(driver);
			testsonsubjectlnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_science);
			brdpprsolnradiobtn_science.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnyearrwise.get(0));
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 10 2019 Science Delhi(Set 1) - Solutions"), "Class-10 Science set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 10 2019 Science Delhi(Set 2) - Solutions"), "Class-10 Science set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 10 2019 Science Delhi(Set 3) - Solutions"), "Class-10 Science set 3: Board paper solution link not available");
			if(String.valueOf(BasePage.isPresentAndDisplayed(frame))=="true"){
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, frame);
				try{
				driver.switchTo().frame(frame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 15, closeOrangePopup);
				closeOrangePopup.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
				}
				catch(ElementNotVisibleException ex){
					
				}
				catch(TimeoutException ex){
					driver.switchTo().defaultContent();
					}
				}
			moveToStudyBoxAndClickHindi(driver);
			testsonsubject_hindilnk.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnradiobtn_classten_hindi);
			brdpprsolnradiobtn_classten_hindi.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, brdpprsolnyearrwise.get(0));
			Assert.assertTrue(brdpprsolnyearrwise.get(0).getText().contains("Board Paper of Class 10 2019 Hindi (A) Delhi(SET 1) - Solutions"), "Class-10 Hindi set 1: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(1).getText().contains("Board Paper of Class 10 2019 Hindi (A) Delhi(SET 2) - Solutions"), "Class-10 Hindi set 2: Board paper solution link not available");
			Assert.assertTrue(brdpprsolnyearrwise.get(2).getText().contains("Board Paper of Class 10 2019 Hindi (A) Delhi(SET 3) - Solutions"), "Class-10 Hindi set 3: Board paper solution link not available");
			}
		}
	
	public void moveToStudyBoxAndClickPhysics(WebDriver driver)
	{
	//	LoginPage loginpage = new LoginPage(driver);
	//	loginpage.closeBoardPaperSolutionpopup();
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,physicsicon);
//		loginpage.closeBoardPaperSolutionpopup();
		
		}
	public void moveToStudyBoxAndClickAccountancy(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,accountancyicon);
		
		}
	public void moveToStudyBoxAndClickHindi(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,hindiicon);
		}
	public void moveToStudyBoxAndClickScience(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,scienceicon);
		}
	public void moveToStudyBoxAndClickBusinessStudies(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 10);
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,business_studiesicon);
		}
	public void moveToStudyBoxAndClickChemistry(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,chemistryicon);
		}
	public void moveToStudyBoxAndClickBiology(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,biologyicon);
		
		}
	public void moveToStudyBoxAndClickMath(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,mathicon);
		}
	public void moveToStudyBoxAndClickEnglish(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,englishicon);
		}
	public void moveToStudyBoxAndClickEconomics(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		BasePage.moveToElementAndClick(driver,studybx,economicsicon);
		
		}
	public void clickPhysicsSubject(WebDriver driver)
		{
		BasePage.isSelected(physicspart1radionbtn, "checked");
		electricchargesandfields.click();
			
		}
	public void clickScienceSubject(WebDriver driver)
	{
	BasePage.isSelected(scienceradionbtn, "checked");
	chemicalReactionAndEquation.click();
		
	}
	public void verifyPhysicsPage(WebDriver driver)
	{
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(liveclassesonsubjectlnk), "Live Classes link not present");
		liveclassesonsubjectlnk.click();
		BasePage.sleepForMilliSecond(2000);
		clickTakeTestOnLiveClasses(driver);
		BasePage.sleepForMilliSecond(2000);
		moveToStudyBoxAndClickPhysics(driver);
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(assignmentonsubjectlnk), "Assignment link not present");
		assignmentonsubjectlnk.click();
		BasePage.sleepForMilliSecond(2000);
		takeTestOnAssignment();
		BasePage.sleepForMilliSecond(2000);
		moveToStudyBoxAndClickPhysics(driver);
		BasePage.sleepForMilliSecond(2000);
		BasePage.isSelected(physicspart1radionbtn, "checked");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(textbooksolutionsonsubjectlnk), "Test Book Solutions link not present");
		textbooksolutionsonsubjectlnk.click();
		BasePage.isSelected(physicspart1radionbtn, "checked");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(topicstextbooksolutionson.get(0)), "Topics of textbook solution not present");
		BasePage.sleepForMilliSecond(2000);
		topicstextbooksolutionson.get(0).click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(pagecontent.getText().toString().length() >20, "TextBook solution content not present");
		Assert.assertTrue(String.valueOf(BasePage.isPresentAndDisplayed(logoutbx)) != "true", "LogoutBox Present");
		moveToStudyBoxAndClickPhysics(driver);
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(testsonsubjectlnk), "Tests link not present");
		testsonsubjectlnk.click();
		BasePage.sleepForMilliSecond(2000);
		moveToStudyBoxAndClickPhysics(driver);
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectarrow),"Subject arrow not present");
		subjectarrow.click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectlist.get(0)));
		Assert.assertTrue(subjectlist.size()!=0, "Subject list not populated when clicked on subject arrow");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(generatetestbtn),"Generate Test Button not appearing");
		generatetestbtn.click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(generatetestinstruction));
		Assert.assertEquals(generatetestinstruction.getText().toString(), "Select 3 or more chapters to Generate test");
		Assert.assertTrue(generatetestinstruction.getText().toString().length() !=0, "Generate Test Instruction not present");
		for (int i=0;i<3; i++){
			if(String.valueOf(BasePage.isPresentAndDisplayed(topicsfortestgenerate.get(i)))!= "false");
			topicsfortestgenerate.get(i).click();
		}
		generatetestbtnactual.click();
		BasePage.sleepForMilliSecond(2000);
		proceeedbtn.click();
		BasePage.sleepForMilliSecond(2000);
		for(int i=0;i < questionannsweroptions.size();i++){
			BasePage.sleepForMilliSecond(2000);
			if(String.valueOf(BasePage.isPresentAndDisplayed(questionannsweroptions.get(i)))!= "false"){
				BasePage.sleepForMilliSecond(1000);
				questionannsweroptions.get(i).click();
				BasePage.sleepForMilliSecond(1000);
				nextbtnontestgenerator.click();
				}
			else{
				continue;
			}
			
		}
		BasePage.pressEscapeKey(driver);
		BasePage.sleepForMilliSecond(2000);
		driver.navigate().back();
		}
		
	public void clickChemistrySubject(WebDriver driver)
	{
		BasePage.isSelected(chemistrypart1radionbtn, "checked");
		thesolidstate.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickEnglishSubject(WebDriver driver)
	{
		BasePage.isSelected(englishgrammerradionbtn, "checked");
		englishfirsttopic.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickEconomicsSubject(WebDriver driver)
	{
		BasePage.isSelected(economicsradionbtn, "checked");
		economicsfirsttopic.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickMathSubject(WebDriver driver)
	{
		BasePage.isSelected(mathpart1radionbtn, "checked");
		mathfirsttopic.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickBiologySubject(WebDriver driver)
	{
		BasePage.isSelected(biologyradionbtn, "checked");
		biologyfirsttopic.click();
		BasePage.sleepForMilliSecond(2000);
	}
	public void clickTopicLiveClasses()
	{
		BasePage.sleepForMilliSecond(2000);
		liveclasseslnk.click();
	}	
	public void clickTakeTestOnLiveClasses(WebDriver driver)
	{
		try{
		BasePage.isPresentAndDisplayed(fistdisplayedtest);
		BasePage.sleepForMilliSecond(2000);
		fistdisplayedtest.click();
		BasePage.sleepForMilliSecond(2000);
		BasePage.isPresentAndDisplayed(taketestbtn);	
		taketestbtn.click();
		BasePage.sleepForMilliSecond(2000);
		exitTest(driver);
		}
		catch(NoSuchElementException e){
			Assert.assertTrue(norecordfoundonliveclasses.getText().equalsIgnoreCase("No Record Found"));
		}
				
		}
	
	public void exitTest(WebDriver driver) 
		{
		
			BasePage.sleepForMilliSecond(2000);
			exittestbtn.click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickConcepts()
		{
			conceptslnk.click();
			Assert.assertTrue(conceptspagecontent.getText().toString().length() >20);
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			topicsicon.click();
			int size = lastdrpdwntopicmenu.size();
			lastdrpdwntopicmenu.get(size-1).click();
			BasePage.sleepForMilliSecond(2000);
			taketopictestbtn.get(taketopictestbtn.size()-1).click();	
		}
	public void clickConceptsOnEnglish(WebDriver driver)
		{
			conceptsonenglishlnk.click();
			BasePage.sleepForMilliSecond(2000);
			Assert.assertTrue(conceptspagecontent.getText().toString().length() >20);
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			topicsicon.click();
			BasePage.sleepForMilliSecond(2000);
			lastdrpdwntopicmenu.get(0).click();
			BasePage.sleepForMilliSecond(2000);
			BasePage.moveToElementAndClick(driver, taketopictestbtn.get(0));
			BasePage.sleepForMilliSecond(2000);	
		}
	public void clickConceptsOnEconomics()
		{
			conceptsoneconomicslnk.click();
			Assert.assertTrue(conceptspagecontent.getText().toString().length() >20);
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			topicsicon.click();
			int size = lastdrpdwntopicmenu.size();
			lastdrpdwntopicmenu.get(size-1).click();
			BasePage.sleepForMilliSecond(2000);	
		}
	public void answerTopicTest()
		{
			try{
			for (int i=0;i<topictest1stquestionoptions.size()-2;i++)
			{
				BasePage.sleepForMilliSecond(1000);
				boolean str = BasePage.isPresentAndDisplayed(topictest1stquestionoptions.get(i));
				String str1 = String.valueOf(str);
				if(str1!= "false")
				{
				BasePage.sleepForMilliSecond(2000);
				topictest1stquestionoptions.get(i).click();	
				BasePage.sleepForMilliSecond(2000);
				nextbtn.click();
				}
			}
			}
				catch(NoSuchElementException ex)
				{
				}
				Assert.assertTrue(BasePage.isPresentAndDisplayed(viewsolnbtn));
				BasePage.sleepForMilliSecond(2000);
				viewsolnbtn.click();
				BasePage.sleepForMilliSecond(2000);
				crossicon.click();
				
			}
			
		/*	topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size())).click();
			topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size())).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(2000);
			topictest1stquestionoptions.get(i).click();
			topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size()-1)).click();
			topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size()-1)).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(2000);
			topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size()-2)).click();
			topictest1stquestionoptions.get(topictest1stquestionoptions.size()-(topictest1stquestionoptions.size()-2)).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(2000);*/
			//topictest4thquestionoptions.get(0).click();
			//topictest4thquestionoptions.get(0).sendKeys(Keys.ARROW_RIGHT);
			//BasePage.sleepForMilliSecond(2000);
			//topictest5thquestionoptions.get(0).click();
			//topictest5thquestionoptions.get(0).sendKeys(Keys.ARROW_RIGHT);
			//BasePage.sleepForMilliSecond(2000);
			
			
	public void clickPractice(WebDriver driver)
		{
			practicelnk.click();
			WaitStatementLib.implicitWaitForSecond(driver, 10);
			startbtn.get(0).click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, startpractisingbtn);
			startpractisingbtn.click();
			BasePage.sleepForMilliSecond(2000);
			firstansweroptions.get(0).click();
			firstansweroptions.get(0).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(1000);
			firstansweroptions.get(0).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(1000);
			secondansweroptions.get(0).click();
			BasePage.sleepForMilliSecond(1000);
			secondansweroptions.get(0).sendKeys(Keys.ARROW_RIGHT);
			BasePage.sleepForMilliSecond(1000);
			closetestcrossicon.click();
			BasePage.sleepForMilliSecond(2000);
			}
		
	public void clickAssignment()
		{
			assignmentlnk.click();
			BasePage.sleepForMilliSecond(4000);
		}
	public void clickAssignmentOnEnglish()
		{
			assignmentonenglishlnk.click();
			BasePage.sleepForMilliSecond(4000);
		}
	public void takeTestOnAssignment(){
			if(taketestassignmentbtn.size()!=0){
			
				for(int k=0;k<=taketestassignmentbtn.size();k++){
					if(String.valueOf(BasePage.isPresentAndDisplayed(taketestassignmentbtn.get(k)))!="false")
					{
					taketestassignmentbtn.get(k).click();
					BasePage.sleepForMilliSecond(2000);
					proceeedbtn.click();
					BasePage.sleepForMilliSecond(2000);
					for(int i=0;i <= questionannsweroptions.size();i++){
						boolean str = BasePage.isPresentAndDisplayed(questionannsweroptions.get(i));
						String str1=String.valueOf(str);
						if(str1!="false"){
							questionannsweroptions.get(0).click();
							BasePage.sleepForMilliSecond(2000);
							pausetestbtn.click();
						/*	BasePage.sleepForMilliSecond(1000);
							yesbtn_confpopup.click();
							BasePage.sleepForMilliSecond(2000);
							gobackbtn.click();*/
							BasePage.sleepForMilliSecond(2000);
							break;
						}
						else{
							continue;
						}
							
							}
						break;
					}
					else if (BasePage.isPresentAndDisplayed(retaketestlink.get(0))){
						retaketestlink.get(0).click();
						BasePage.sleepForMilliSecond(2000);
						proceeedbtn.click();
						BasePage.sleepForMilliSecond(2000);
						for(int i=1;i <= questionannsweroptions.size();i++){
							boolean str = BasePage.isPresentAndDisplayed(questionannsweroptions.get(i));
							String str1=String.valueOf(str);
							if(str1!="false"){
								questionannsweroptions.get(0).click();
								BasePage.sleepForMilliSecond(2000);
								pausetestbtn.click();
								/*BasePage.sleepForMilliSecond(1000);
								yesbtn_confpopup.click();
								BasePage.sleepForMilliSecond(2000);
								gobackbtn.click();*/
								BasePage.sleepForMilliSecond(2000);
								break;
							}
						}
						break;
					}
					else {
						BasePage.sleepForMilliSecond(2000);
						viewreportassignmentbtn.get(0).click();
						BasePage.sleepForMilliSecond(2000);
						gobackbtn.click();
						BasePage.sleepForMilliSecond(2000);
						break;
						}
				}
				}
				else{
					Assert.assertTrue(norecordfoundonliveclasses.getText().equalsIgnoreCase("No Record Found"));				
				}
		}
	public void clickTest()
		{
			testslnk.click();
			BasePage.sleepForMilliSecond(2000);
			boolean str = BasePage.isPresentAndDisplayed(starttestbtnOnTests.get(0));
			String str1 = String.valueOf(str);
				if(str1 != "false")
				{
					BasePage.sleepForMilliSecond(2000);
					starttestbtnOnTests.get(0).click();
					BasePage.sleepForMilliSecond(2000);
					proceeedbtn.click();
					BasePage.sleepForMilliSecond(2000);
					pausetestbtn.click();
					BasePage.sleepForMilliSecond(2000);
					BasePage.sleepForMilliSecond(3000);
				}
				else
				{
					boolean str2 = BasePage.isPresentAndDisplayed(viewreportbtn.get(0));
						String str3 = String.valueOf(str2);
						if(str3!="false"){
							viewreportbtn.get(0).click();
							BasePage.sleepForMilliSecond(2000);
							gobackbtn.click();
							}
				}
		}
	public void clickTestOnEnglish()
		{
			testsonenglishlnk.click();
			BasePage.sleepForMilliSecond(2000);
			boolean str = BasePage.isPresentAndDisplayed(starttestbtnOnTests.get(0));
			String str1 = String.valueOf(str);
				if(str1 != "false")
				{
					BasePage.sleepForMilliSecond(2000);
					starttestbtnOnTests.get(0).click();
					BasePage.sleepForMilliSecond(2000);
					proceeedbtn.click();
					BasePage.sleepForMilliSecond(2000);
					pausetestbtn.click();
					BasePage.sleepForMilliSecond(2000);
					BasePage.sleepForMilliSecond(3000);
				}
				else
				{
					boolean str2 = BasePage.isPresentAndDisplayed(viewreportbtn.get(0));
						String str3 = String.valueOf(str2);
						if(str3!="false"){
							viewreportbtn.get(0).click();
							BasePage.sleepForMilliSecond(2000);
							gobackbtn.click();
							}
				}
		}
	public void clickTestOnEconomics()
		{
			testsoneconomicslnk.click();
			BasePage.sleepForMilliSecond(2000);
			boolean str = BasePage.isPresentAndDisplayed(starttestbtnOnTests.get(0));
			String str1 = String.valueOf(str);
				if(str1 != "false")
				{
					BasePage.sleepForMilliSecond(2000);
					starttestbtnOnTests.get(0).click();
					BasePage.sleepForMilliSecond(2000);
					proceeedbtn.click();
					BasePage.sleepForMilliSecond(2000);
					pausetestbtn.click();
					BasePage.sleepForMilliSecond(2000);
					BasePage.sleepForMilliSecond(3000);
				}
				else
				{
					boolean str2 = BasePage.isPresentAndDisplayed(viewreportbtn.get(0));
						String str3 = String.valueOf(str2);
						if(str3!="false"){
							viewreportbtn.get(0).click();
							BasePage.sleepForMilliSecond(2000);
							gobackbtn.click();
							}
				}
		}
		
	public void clickPopularQuestions(WebDriver driver)
		{
			pupolarquestionslnk.click();
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			{
				BasePage.sleepForMilliSecond(3000);
				allpopularquestionsanswers.get(0).click();
				Set <String> allWindow = driver.getWindowHandles();
				Iterator<String> itr = allWindow.iterator();
				
				if (driver.getTitle()==""){
					driver.switchTo().window(driver.getTitle());
				}
				
				
				List<String> myl = new ArrayList<String>();
				for (int i =0;i<allWindow.size();i++)
				{
					myl.add(itr.next());
				}
				driver.switchTo().window(myl.get(1));
				BasePage.sleepForMilliSecond(5000);
				likebtns.get(2).click();
				BasePage.sleepForMilliSecond(2000);
				driver.close();
				BasePage.sleepForMilliSecond(3000);
				driver.switchTo().window(myl.get(0));
			}
			
			
		}
	public void clickPopularQuestionsOnEnglish(WebDriver driver)
		{
			pupolarquestionsonenglishlnk.click();
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			{
				BasePage.sleepForMilliSecond(3000);
				allpopularquestionsanswers.get(0).click();
				Set <String> allWindow = driver.getWindowHandles();
				Iterator<String> itr = allWindow.iterator();
				List<String> myl = new ArrayList<String>();
				for (int i =0;i<allWindow.size();i++)
				{
					myl.add(itr.next());
				}
				driver.switchTo().window(myl.get(1));
				BasePage.sleepForMilliSecond(5000);
				likebtns.get(2).click();
				BasePage.sleepForMilliSecond(2000);
				driver.close();
				BasePage.sleepForMilliSecond(3000);
				driver.switchTo().window(myl.get(0));
			}
			
			
		}
	public void clickPopularQuestionsOnEconomics(WebDriver driver)
		{
			pupolarquestionsoneconomicslnk.click();
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			{
				BasePage.sleepForMilliSecond(3000);
				allpopularquestionsanswers.get(0).click();
				Set <String> allWindow = driver.getWindowHandles();
				Iterator<String> itr = allWindow.iterator();
				List<String> myl = new ArrayList<String>();
				for (int i =0;i<allWindow.size();i++)
				{
					myl.add(itr.next());
				}
				driver.switchTo().window(myl.get(1));
				BasePage.sleepForMilliSecond(5000);
				likebtns.get(2).click();
				BasePage.sleepForMilliSecond(2000);
				driver.close();
				BasePage.sleepForMilliSecond(3000);
				driver.switchTo().window(myl.get(0));
			}
			
			
		}
	public void clickActivities()
		{
			activitieslnk.click();
			BasePage.sleepForMilliSecond(4000);
			startpuzzlebtns.get(0).click();
			BasePage.sleepForMilliSecond(4000);
			puzzlepopup.get(0).sendKeys(Keys.TAB);
			puzzlepopup.get(0).sendKeys(Keys.ENTER);
			puzzlepopup.get(0).click();
			puzzlepopup.get(0).sendKeys(Keys.TAB);
			puzzlepopup.get(0).sendKeys(Keys.ENTER);
			closepuzzle.get(0).click();
		}
	public void clickActivitiesOnEnglish()
		{
			activitiesonenglishlnk.click();
			BasePage.sleepForMilliSecond(4000);
			startpuzzlebtns.get(0).click();
			BasePage.sleepForMilliSecond(4000);
			puzzlepopup.get(0).sendKeys(Keys.TAB);
			puzzlepopup.get(0).sendKeys(Keys.ENTER);
			puzzlepopup.get(0).click();
			puzzlepopup.get(0).sendKeys(Keys.TAB);
			puzzlepopup.get(0).sendKeys(Keys.ENTER);
			closepuzzle.get(0).click();
		}
	public void clickRevisionNotes(){
			revisionnoteslnk.click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickRevisionNotesOnEnglish(){
			revisionnotesonenglishlnk.click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickRevisionNotesOnEconomics(){
			revisionnotesoneconomicslnk.click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickRevisioNotesOnMath(){
			revisionnotesonmath.click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void downloadPDF(WebDriver driver) throws AWTException
		{
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(revisionnotescontent.getText().toString().length() > 0);
			dwnldpdfbtn.click();
			BasePage.sleepForMilliSecond(2000);
			Set <String> allWindow = driver.getWindowHandles();
			Iterator<String> itr = allWindow.iterator();
			List<String> myl = new ArrayList<String>();
			for (int i =0;i<allWindow.size();i++)
			{
				myl.add(itr.next());
			}
			driver.switchTo().window(myl.get(1));
			BasePage.sleepForMilliSecond(2000);
			changeBtn.click();
			Set <String> newWindow = driver.getWindowHandles();
			Iterator<String> itrnew = allWindow.iterator();
			List<String> mylnew = new ArrayList<String>();
			System.out.println(newWindow.size());
			for (int i =0;i<newWindow.size();i++)
			{
				mylnew.add(itrnew.next());
			}
			driver.switchTo().window(myl.get(2));
			//saveAsPdfBtn.click();
			Robot robot = new Robot();
			BasePage.sleepForMilliSecond(2000);
			robot.keyPress(KeyEvent.VK_ENTER);
			BasePage.sleepForMilliSecond(2000);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.close();
			driver.switchTo().window(myl.get(0));	
				
			}
	public void clickBoardPaperQuestionsOnMath()
		{
			boardpaperquestiononmathlnk.click();
			BasePage.sleepForMilliSecond(2000);
			if(boardpaperquestioncontent.getText().toString().length()>0){
				viewsolnbtns.get(0).click();
				BasePage.sleepForMilliSecond(2000);
				}
		}
			
	public void clickBoardPaperQueestions()
		{
			boardpaperquestionlnk.click();
			BasePage.sleepForMilliSecond(2000);
			Assert.assertTrue(boardpaperquestioncontent.getText().toString().length()>0);
			viewsolnbtns.get(0).click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickBoardPaperQuestionsOnEconomics()
		{
			boardpaperquestiononeconomicslnk.click();
			BasePage.sleepForMilliSecond(2000);
			Assert.assertTrue(boardpaperquestioncontent.getText().toString().length()>0);
			viewsolnbtns.get(0).click();
			BasePage.sleepForMilliSecond(2000);
		}
	public void clickFormativeAssesment(WebDriver driver)
		{
			formativeassessmentlnk.click();
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			BasePage.sleepForMilliSecond(2000);
			driver.switchTo().frame(frameOnFormativeAssesmnt);
	//  	BasePage.sleepForMilliSecond(2000);
			try{	
				BasePage.isPresentAndDisplayed(startevaluationbtn);
				System.out.println(String.valueOf(BasePage.isPresentAndDisplayed(startevaluationbtn)));
				startevaluationbtn.click();
				BasePage.sleepForMilliSecond(2000);
				try
				{
				BasePage.isPresentAndDisplayed(continuelaterbtn2);
				continuelaterbtn2.click();
				}
			catch(NoSuchElementException e){
				continuelaterbtn1.click();
				}
			}
			catch(NoSuchElementException e){
					viewsolnsbtn.click();
					BasePage.sleepForMilliSecond(2000);
					closeviewsolns.click();
					BasePage.sleepForMilliSecond(2000);
					driver.switchTo().defaultContent();
				}
			driver.switchTo().defaultContent();
			}
	public void clickFormativeAssesmentOnMath(WebDriver driver)
		{
			formativeassessmentonmathlnk.click();
			Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
			BasePage.sleepForMilliSecond(2000);
			driver.switchTo().frame(frame);
				BasePage.sleepForMilliSecond(2000);
			try{	
				BasePage.isPresentAndDisplayed(startevaluationbtn);
				startevaluationbtn.click();
				BasePage.sleepForMilliSecond(2000);
				try
				{
				BasePage.isPresentAndDisplayed(continuelaterbtn2);
				continuelaterbtn2.click();
				}
			catch(NoSuchElementException e){
				continuelaterbtn1.click();
				}
			}
			catch(NoSuchElementException e){
					viewsolnsbtn.click();
					BasePage.sleepForMilliSecond(2000);
					closeviewsolns.click();
					BasePage.sleepForMilliSecond(2000);
					driver.switchTo().defaultContent();
					}
			}
	public void verifyOptionsOnTopicPage(WebDriver driver){
					liveclasssesonenglish.click();
					BasePage.sleepForMilliSecond(2000);
					clickTakeTestOnLiveClasses(driver);
					BasePage.sleepForMilliSecond(2000);
					conceptsonenglish.click();
					BasePage.sleepForMilliSecond(2000);
					Assert.assertTrue(conceptspagecontent.getText().toString().length() >0);
					Assert.assertFalse(BasePage.isPresentAndDisplayed(logoutbx));
					topicsicon.click();
					int size = lastdrpdwntopicmenu.size();
					lastdrpdwntopicmenu.get(size-1).click();
					taketopictestbtn.get(taketopictestbtn.size()-1).click();
				}
	public void verifyJuniorLive(WebDriver driver) {
		BasePage.scrollDown(Livebtn, driver);
		Livebtn.click();
		start.click();
	    WaitStatementLib.explicitWaitForVisiblity(driver, 5, crystal);
	    
	}
	}

			
		




