package com.applect.meritnation.pageobject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;


public class LogoutPage {
	WebDriver driver;
	@FindBy(xpath="//header[@class='main-header']/div/div/a[2]")
	private WebElement logo;
	@FindBy(xpath="//button[text()='Purchase']")
	private WebElement purchaseBtn;
	@FindBy(xpath="//button[text()='Call me']")
	private WebElement callmeBtn;
	@FindBy(xpath="//ul[@class='menu-items']/li[2]/a")
	private WebElement ncertSolnLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[3]/a")
	private WebElement entranceExmLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[4]/a")
	private WebElement classTwlveLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[5]/a")
	private WebElement classElvnLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[6]/a")
	private WebElement classTenLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[7]/a")
	private WebElement classNineLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[8]/a")
	private WebElement classEightLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[9]/a")
	private WebElement classSevenLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[10]/a")
	private WebElement classSixLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[11]/a")
	private WebElement classFiveLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[12]/a")
	private WebElement classFourLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[13]/a")
	private WebElement classThreeLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[14]/a")
	private WebElement classTwoLnk;
	@FindBy(xpath="//ul[@class='menu-items']/li[15]/a")
	private WebElement classOneLnk;
	@FindBy(xpath="//div[@class='banner-content']/div[2]/a[1]")
	private WebElement classFour_TwelveBtn;
	@FindBy(xpath="//div[@class='banner-content']/div[2]/a[2]")
	private WebElement entranceExmBtn;
	@FindBy(xpath="//a[@href='https://www.meritnation.com/live']/div[2]")
	private WebElement onlineTutionnsLnk;
	@FindBy(xpath="//a[@href='https://www.meritnation.com/ncert-solutions']/div[2]")
	private WebElement freeNcertSolnLnk;
	@FindBy(xpath="//a[@href='https://www.meritnation.com/study-material']/div[2]")
	private WebElement smartStudyLnk;
	@FindBy(xpath="//a[@href='https://www.meritnation.com/homework-help']/div[2]")
	private WebElement homeworkHelpLnk;
	@FindBy(xpath="//a[@href='/testprep']/div[2]")
	private WebElement entranceExamLnk;
	@FindBy(xpath="//a[@href='/products/testimonials']")
	private WebElement testimonialsLnk;
	@FindBy(xpath="//a[@href='cbse/class1']")
	private WebElement classOneLink;
	@FindBy(xpath="//a[@href='cbse/class2']")
	private WebElement classTwoLink;
	@FindBy(xpath="//a[@href='cbse/class3']")
	private WebElement classThreeLink;
	@FindBy(xpath="//a[@href='cbse/class4']")
	private WebElement classFourLink;
	@FindBy(xpath="//a[@href='cbse/class5']")
	private WebElement classFiveLink;
	@FindBy(xpath="//a[@href='cbse-class-6/8']")
	private WebElement classSixLink;
	@FindBy(xpath="//a[@href='cbse-class-7/9']")
	private WebElement classSevenLink;
	@FindBy(xpath="//a[@href='cbse-class-8/10']")
	private WebElement classEightLink;
	@FindBy(xpath="//a[@href='cbse-class-9/11']")
	private WebElement classNineLink;
	@FindBy(xpath="//a[@href='cbse-class-10/12']")
	private WebElement classTenLink;
	@FindBy(xpath="//a[@href='cbse-class-11-science/41']")
	private WebElement classElevenLnk;
	@FindBy(xpath="//a[@href='cbse-class-11-commerce']")
	private WebElement classEleComLnk;
	@FindBy(xpath="//a[@href='cbse-class-11-humanities']")
	private WebElement classEleHumLnk;
	@FindBy(xpath="//a[@href='cbse-class-12-science/46']")
	private WebElement classTweLnk;
	@FindBy(xpath="//a[@href='cbse-class-12-commerce']")
	private WebElement classTweComLnk;
	@FindBy(xpath="//a[@href='cbse-class-12-humanities']")
	private WebElement classTweHumLnk;
	@FindBy(xpath="//a/span[text()='JEE: 11']")
	private WebElement jeeEleLnk;
	@FindBy(xpath="//a/span[text()='JEE: 12']")
	private WebElement jeeTweLnk;
	@FindBy(xpath="//a[@href='/medical/aipmt']")
	private WebElement aipmtStuLnk;
	@FindBy(xpath="//a[@href='/bba']")
	private WebElement bbaStuLnk;
	@FindBy(xpath="//a[@href='/cpt']")
	private WebElement cptStuLnk;
	@FindBy(xpath="//a[@href='/nda']")
	private WebElement ndaStuLnk;
	@FindBy(xpath="//a[@href='/aipmt-live-classes']")
	private WebElement aipmtLiveLnk;
	@FindBy(xpath="//a[@href='/jee-live-classes']")
	private WebElement iitJeeLiveLnk;
	@FindBy(xpath="//a[@href='/live-classes']")
	private WebElement liveClassLnk;
	@FindBy(xpath="//a[@href='/class-10-board-exam']")
	private WebElement classTenBoardExamLnk;
	@FindBy(xpath="//a[@ href='event/board-paper-solutions']")
	private WebElement boardPaperSolutionsLnk;
	@FindBy(xpath="//a[@href='/cbse']")
	private WebElement cbseLnk;
	@FindBy(xpath="//a[@href='/icse']")
	private WebElement icseLnk;
	@FindBy(xpath="//a[@href='/tamilnadu']")
	private WebElement tamilNaduLnk;
	@FindBy(xpath="//a[@href='/karnataka']")
	private WebElement karnatakaLnk;
	@FindBy(xpath="//a[@href='/maharashtra']")
	private WebElement maharashtaLnk;
	@FindBy(xpath="//a[@href='/kerala']")
	private WebElement keralaLnk;
	@FindBy(xpath="//a[@href='/cbse/studytips']")
	private WebElement cbseStudyLnk;
	@FindBy(xpath="//a[@href='/icse/studytips']")
	private WebElement icseStudyLnk;
	@FindBy(xpath="//a[@href='/maharashtra/studytips']")
	private WebElement maharashtaStudyLnk;
	@FindBy(xpath="//a[@href='/karnataka/studytips']")
	private WebElement karnatakaStudyLnk;
	@FindBy(xpath="//a[@href='/kerala/studytips']")
	private WebElement keralaStudyLnk;
	@FindBy(xpath="//a[@href='/tamilnadu/studytips']")
	private WebElement tamilNaduStudyLnk;
	@FindBy(xpath="//a[@href='/pmt/studytips']")
	private WebElement neetStudyLnk;
	@FindBy(xpath="//a[@href='/iit/studytips']")
	private WebElement iitStudyLnk;
	@FindBy(xpath="//a[@href='/studymaterial']")
	private WebElement studyMaterialLnk;
	@FindBy(xpath="//div[3][@class='features-box']/div/div[1]/div/ul/li[2]/a/span")
	private WebElement ncertSolutionsLnk;
	@FindBy(xpath="//a[@href='/textbook-solutions']")
	private WebElement textbookSolutionsLnk;
	@FindBy(xpath="//a[@href='/practiceQuestion']")
	private WebElement practiceQuestionLnk;
	@FindBy(xpath="//a[@href='/puzzle']")
	private WebElement puzzleLnk;
	@FindBy(xpath="//a[@href='/vedic-math']")
	private WebElement vedicMathLnk;
	@FindBy(xpath="//a[@ href='/cbse/class12-science/board-papers/1_12']")
	private WebElement classTweSciBordPapersLnk;
	@FindBy(xpath="//a[@ href='/cbse/class/board-papers/1_10']")
	private WebElement classTenBrdPapersLnk;
	@FindBy(xpath="//a[@ href='/cbse/class/board-papers/science/science/1_10_2_10']")
	private WebElement classTenBrdPapersSciLnk;
	@FindBy(xpath="//a[@ href='/cbse/class/board-papers/math/math/1_10_1_9']")
	private WebElement classTenBrdPapersMathLnk;
	@FindBy(xpath="//a[@href='/school-directory']")
	private WebElement schoolDirLnk;
	@FindBy(xpath="//a[@href='/schools-in-new-delhi-392']")
	private WebElement schoolDelLnk;
	@FindBy(xpath="//a[@href='/schools-in-mumbai-549']")
	private WebElement schoolMumLnk;
	@FindBy(xpath="//a[@href='/schools-in-hyderabad-45']")
	private WebElement schoolHydLnk;
	@FindBy(xpath="//a[@href='/schools-in-bangalore-45694']")
	private WebElement schoolBangLnk;
	@FindBy(xpath="//a[@href='/schools-in-chennai-48671']")
	private WebElement schoolChenLnk;
	@FindBy(xpath="//a[@href='/schools-in-kolkata-39251']")
	private WebElement schoolKolLnk;
	@FindBy(xpath="//a[@href='/schools/united-arab-emirates-252']")
	private WebElement schoolUaeLnk;
	@FindBy(xpath="//a[@href='/schools/oman-186']")
	private WebElement schoolOmanLnk;
	@FindBy(xpath="//a[@href='/schools/saudi-arabia-213']")
	private WebElement schoolSaudiLnk;
	@FindBy(xpath="//a[@href='/formative-assessment']")
	private WebElement formativeAssessmentLnk;
	@FindBy(xpath="//a[@href='/sample-papers']")
	private WebElement samplePapersLnk;
	@FindBy(xpath="//a[@href='/chapter-tests']")
	private WebElement chapterTestsLnk;
	@FindBy(xpath="//a[@href='/personalized-reports']")
	private WebElement personalizedReportsLnk;
	@FindBy(xpath="//a[@href='/live-test-series']")
	private WebElement liveTestSeriesLnk;
	@FindBy(xpath="//a[@href='/sample-paper-booklet']")
	private WebElement samplePaperBookletLnk;
	@FindBy(xpath="//a[@href='/revision-notes']")
	private WebElement revisionNotesLnk;
	@FindBy(xpath="//a[@href='/textbook-synopsis']")
	private WebElement textBookSynopsisLnk;
	@FindBy(xpath="//a[@href='/personality-zone/personality-test']")
	private WebElement personalityZoneLnk;
	@FindBy(xpath="//a[@href='/personality-zone/aptitude-test']")
	private WebElement aptitudeTestLnk;
	@FindBy(xpath="//a[@href='/personality-zone/interest-test']")
	private WebElement interestTestLnk;
	@FindBy(xpath="//a[@href='/personality-zone/skill-builder-list']")
	private WebElement skillBuilderListLnk;
	@FindBy(xpath="//a[@href='/personality-zone/stream-selector/list']")
	private WebElement streamselectorLnk;
	@FindBy(xpath="//a[@href='/mywall/index']")
	private WebElement myWallLnk;
	@FindBy(xpath="//a[@href='/games/game-list']")
	private WebElement gamesLnk;
	@FindBy(xpath="//a[@href='/daily-teaser']")
	private WebElement dailyTeaserLnk;
	@FindBy(xpath="//div[@class='left-block']/div[3]//ul[@class='course-class']/li[4]/a")
	private WebElement blogLnk;
	@FindBy(xpath="//div[contains(@class,'wrap')]")
	private List <WebElement> pageContent;
	@FindBy(xpath="//nav/ul/li[2]/a")
	private WebElement classDrpdwn;
	@FindBy(xpath="//nav/ul/li[2]/ul/li")
	private List <WebElement> classesLst;
	@FindBy(xpath="//div[@class='row2']/div[@class = 'inline-block addOnsPrice']/tt")
	private WebElement checkOutPrice;
	@FindBy(xpath="//button[text()='checkout ']")
	private WebElement checkOutBtn;
	@FindBy(xpath="//div[@class='priceBox group']/div[@class='pPrice']/span")
	private List <WebElement> atualPrice;
	@FindBy(xpath="//a[text()='Class XI']")
	private WebElement class11Lnk;
	@FindBy(xpath="//a[text()='PURCHASE']")
	private WebElement upgradeBtn;
	@FindBy(xpath="//div[@class='close']")
	private WebElement closeSideBarPopup;
	@FindBy(xpath="//div[@class='customCourse']//label/span")
	private List <WebElement> availableProducts;
	@FindBy(xpath="//ul[@class='chooseCourse']//label/span")
	private List <WebElement> chooseCourseRadioBtnn;
	@FindBy(xpath="//a[@class='merit_logo']")
	private WebElement insideLogo;
	@FindBy(xpath="//div[@id='main-frame-error']")
	private WebElement pageLoadError;
	@FindBy(tagName="a")
	private List <WebElement> lnks;
	@FindBy(xpath = "//div[@class='conDetails']//*[text()='Proceed']")
	private WebElement proceedButton;
	@FindBy(xpath = "//div[contains(@class,'show-only-on-unminimize')]")
	private WebElement mobilePopup;
	@FindBy(xpath = "//div[@class='card filled'][1]//label[text()='Choose']")
	private WebElement chooseButton;
	@FindBy (xpath = "//*[@id='proceedBtn_2']")
	private WebElement proceedButton_2;
	@FindBy(xpath = "//span[text()='Credit Card(Domestic)']")
	private WebElement paymentMode;
	@FindBy (xpath = "//div[@class='credit-debit']//button[text()='Make Payment']")
	private WebElement creditDebitPayment;
	@FindBy(xpath ="//p[text()='Choose a payment method']")
	private WebElement paymentPageText;
	@FindBy (xpath = "//a[text()='Net Banking']")
	private WebElement netBanking;
	@FindBy(xpath="//span[@class='bank-img icici']")
	private WebElement bankImage;
	@FindBy(xpath="//div[@class='net-banking']//button[text()='Make Payment']")
	private WebElement netBankingPayment;
	@FindBy(xpath="//label[text()='Payment through ICICI Bank']")
	private WebElement iciciBankPageText;
	@FindBy(xpath = "//div[contains(@id,'connecto-modal')]/iframe")
	private WebElement connectoFrame;
	@FindBy(xpath = "//div[@class='icon close']")
	private WebElement closeFrame;
	
	
	public void getURLS(){
		for(int i = 0;i<lnks.size();i++){
			System.out.println(lnks.get(i).getText());
		}
	}
	
	public void clickLinkAndVerifyURL(WebDriver driver){	
		if(BasePage.isPresentAndDisplayed(connectoFrame)){
			WaitStatementLib.explicitWaitForVisiblity(driver, 15, connectoFrame);
			try{
				driver.switchTo().frame(connectoFrame);
				WaitStatementLib.explicitWaitForVisiblity(driver, 5, closeFrame);
				closeFrame.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().defaultContent();
			}
			catch(ElementNotVisibleException ex){
				
			}
			catch(TimeoutException ex){
			
			}
		}
	
	WebElement[] strs = {purchaseBtn,ncertSolnLnk,entranceExmLnk,classTwlveLnk,classElvnLnk,
						classTenLnk,classNineLnk,classEightLnk,classSevenLnk,classSixLnk,classFiveLnk,
						classFourLnk,classThreeLnk,classTwoLnk,classOneLnk,classFour_TwelveBtn,
						entranceExmBtn,onlineTutionnsLnk,freeNcertSolnLnk,smartStudyLnk,
						homeworkHelpLnk,entranceExamLnk,testimonialsLnk,classOneLink,classTwoLink,
						classThreeLink,classFourLink,classFiveLink,classSixLink,classSevenLink,
						classEightLink,classNineLink,classTenLink,classElevenLnk,classEleComLnk,
						classEleHumLnk,classTweLnk,classTweComLnk,classTweHumLnk,jeeEleLnk,jeeTweLnk,
						aipmtStuLnk,bbaStuLnk,cptStuLnk,ndaStuLnk,aipmtLiveLnk,iitJeeLiveLnk,liveClassLnk,classTenBoardExamLnk,boardPaperSolutionsLnk,
						cbseLnk,icseLnk,tamilNaduLnk,karnatakaLnk,maharashtaLnk,keralaLnk,cbseStudyLnk,
						icseStudyLnk,maharashtaStudyLnk,karnatakaStudyLnk,keralaStudyLnk,tamilNaduStudyLnk,
						neetStudyLnk,iitStudyLnk,studyMaterialLnk,ncertSolutionsLnk,textbookSolutionsLnk,
						practiceQuestionLnk,puzzleLnk,vedicMathLnk,
						classTweSciBordPapersLnk,classTenBrdPapersLnk,classTenBrdPapersSciLnk,classTenBrdPapersMathLnk,
						schoolDirLnk,schoolDelLnk,schoolMumLnk,schoolHydLnk,schoolBangLnk,schoolChenLnk,schoolKolLnk,schoolUaeLnk,
						schoolOmanLnk,schoolSaudiLnk,formativeAssessmentLnk,samplePapersLnk,chapterTestsLnk,
						personalizedReportsLnk,liveTestSeriesLnk,samplePaperBookletLnk,revisionNotesLnk,textBookSynopsisLnk,
						personalityZoneLnk,aptitudeTestLnk,interestTestLnk,skillBuilderListLnk,streamselectorLnk,myWallLnk,
						gamesLnk,dailyTeaserLnk,blogLnk};   /*alllinks.toArray(new WebElement[0]);*/
	
		List<WebElement> list = new ArrayList<WebElement>(Arrays.asList(strs));
		for(int i =0; i < strs.length;i++){
			list.get(i).click();
			Long loadtime = (Long)((JavascriptExecutor)driver).executeScript(
				    "return performance.timing.loadEventEnd - performance.timing.navigationStart;");
			System.out.println(loadtime);
			Set <String> allWindow = driver.getWindowHandles();
			if(allWindow.size()==1){
				String displayedURL = driver.getCurrentUrl();
				
				SoftAssert sf = new SoftAssert();
			//	sf.assertFalse(BasePage.isPresentAndDisplayed(pageLoadError),"Blank Page displays");
				
			
				Assert.assertFalse(BasePage.isPresentAndDisplayed(pageLoadError), "Blank Page Displays");
				driver.navigate().back();
					for(int j=(i+42);j<0;j++){
					BasePage.sleepForMilliSecond(1000);
					String actualURL = ExcelUtils.readData("TestData", j, 1).toString();
					Assert.assertTrue(displayedURL.equals(actualURL),"URL on address bar is not same as expected when clicked on "+ (j+1) +"th row (Written in testData sheet) on logout page");
					if(displayedURL.equals(actualURL)){
						break;
					}
					else
					{
						continue;
					}
				}
			}
			else{
				Iterator<String> itr = allWindow.iterator();
				List<String> myl = new ArrayList<String>();
				for (int k =0;k<allWindow.size();k++)
				{
					myl.add(itr.next());
				}
				driver.switchTo().window(myl.get(1));
				BasePage.sleepForMilliSecond(1000);
				SoftAssert sf = new SoftAssert();
			//	sf.assertFalse(BasePage.isPresentAndDisplayed(pageLoadError),"Blank Page displays");
				
				Assert.assertFalse(BasePage.isPresentAndDisplayed(pageLoadError),"Blank Page displays");
				String displayedURL = driver.getCurrentUrl();
				driver.close();
				driver.switchTo().window(myl.get(0));
				for(int j=(i+42);j<0;j++)
				{
				BasePage.sleepForMilliSecond(1000);
				String actualURL = ExcelUtils.readData("TestData", j, 1).toString();
				Assert.assertTrue(displayedURL.equals(actualURL),"URL on address bar is not same as expected when clicked on "+ (j+1) +"th row (Written in testData sheet) on logout page");
				if(displayedURL.equals(actualURL))
				{
					break;
				}
				else
				{
					continue;
					}
				}
			}
		}
	}
	
	public void verifyPriceForPurchasedProduct(WebDriver driver){
		BasePage.sleepForMilliSecond(5000);
		class11Lnk.click();
		upgradeBtn.click();
		BasePage.isPresentAndDisplayed(classesLst.get(0));
		for(int i=0;i<classesLst.size();i++){
			if(BasePage.isPresentAndDisplayed(closeSideBarPopup)){
				closeSideBarPopup.click();
			}
			classDrpdwn.click();
			classesLst.get(i).click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 10, checkOutPrice);
			for (int k=0;k<chooseCourseRadioBtnn.size();k++){
				if(k==0){
					BasePage.scrollDown(chooseCourseRadioBtnn.get(k), driver);
				}
				
				BasePage.sleepForMilliSecond(1000);
				BasePage.pressUpArrowKey(driver);
				BasePage.pressUpArrowKey(driver);
				WaitStatementLib.explicitWaitForClickable(driver, 15, chooseCourseRadioBtnn.get(k));
				chooseCourseRadioBtnn.get(k).click();
				String checkoutprice = checkOutPrice.getText();
				checkOutPrice.click();
				BasePage.sleepForMilliSecond(2000);
				checkOutBtn.click();
				Assert.assertTrue(checkoutprice.equals(atualPrice.get(1).getText()), "Price of product is not same for class " +(i+6));
				driver.navigate().back();
				BasePage.scrollDown(chooseCourseRadioBtnn.get(0), driver);
				BasePage.sleepForMilliSecond(1000);
				BasePage.pressUpArrowKey(driver);
				BasePage.pressUpArrowKey(driver);
				WaitStatementLib.explicitWaitForClickable(driver, 15, chooseCourseRadioBtnn.get(0));
				chooseCourseRadioBtnn.get(0).click();
				chooseCourseRadioBtnn.get(k).click();
				for(int j=0;j<=availableProducts.size();j++){
				while(j==availableProducts.size()){
				for(int l=0;l<availableProducts.size();l++)
				{
					availableProducts.get(l).click();
				}
				break;
					}
					try{
					availableProducts.get(j).click();
					if(BasePage.isAlertPresent(driver)){
					driver.switchTo().alert().accept();
					driver.switchTo().defaultContent();
					}
					}
					catch(Exception e){
						
					}
					String newCheckoutprice = checkOutPrice.getText();
					BasePage.sleepForMilliSecond(2000);
					checkOutBtn.click();
					Assert.assertTrue(newCheckoutprice.contains(atualPrice.get(1).getText()), "Price of product is not same for class " +(i+6));
					driver.navigate().back();
					BasePage.scrollDown(chooseCourseRadioBtnn.get(0), driver);
					BasePage.sleepForMilliSecond(1000);
					BasePage.pressUpArrowKey(driver);
					BasePage.pressUpArrowKey(driver);
					WaitStatementLib.explicitWaitForClickable(driver, 15, chooseCourseRadioBtnn.get(0));
					chooseCourseRadioBtnn.get(0).click();
					chooseCourseRadioBtnn.get(k).click();
					
					}
				}
			}
		}
		public LogoutPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
		
		public void verifyEneToEndPurchase(WebDriver driver) {

			upgradeBtn.click();
			if (BasePage.isPresentAndDisplayed(mobilePopup)) {
				mobilePopup.click();

			}
			BasePage.scrollDownPage(driver);
			checkOutBtn.click();

			// Payment through Credit/ Debit Card
			proceedButton.click();
			chooseButton.click();
			BasePage.scrollDownPage(driver);
			proceedButton_2.click();
			BasePage.sleepForMilliSecond(2000);
			paymentMode.click();
			creditDebitPayment.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 40, paymentPageText);
			Assert.assertEquals(paymentPageText.getText(), "Choose a payment method");
			driver.navigate().back();

			// Payment through Net banking
			proceedButton.click();
			chooseButton.click();
			BasePage.scrollDownPage(driver);
			proceedButton_2.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 5, netBanking);
			BasePage.sleepForMilliSecond(2000);
			netBanking.click();
			bankImage.click();
			
			netBankingPayment.click();
			WaitStatementLib.explicitWaitForVisiblity(driver, 40, iciciBankPageText);
			Assert.assertEquals(iciciBankPageText.getText(), "Payment through ICICI Bank");

		}
	}
