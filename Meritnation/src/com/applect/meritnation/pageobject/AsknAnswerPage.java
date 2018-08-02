package com.applect.meritnation.pageobject;


import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;

public class AsknAnswerPage {

	@FindBy(xpath="//ul[@class='navBox_bottom']/li[@id='ana_menu']/a")
	private WebElement qadrpdwnbx;
	@FindBy(xpath="//ul[@class='navBox_bottom']/li[@id='ana_menu']/ul/li/a[text()= 'Recommended Questions']")
	private WebElement recommendedprojects;
	@FindBy(xpath="//span[@class='circle-float-ask']")
	private WebElement redaskbtn;
	@FindBy(xpath="//div[@class='editor_Box editorBorderBottom']/div[@id='MessageHtmlBox']")
	private WebElement questiontxtbx;
	@FindBy(xpath="//div[@class='editor_Box editorBorderBottom']/div/a[@class='ana_btn editorBox_btn margin_top_10px']")
	private WebElement greenasktbtn;
	@FindBy(xpath="//div[@class='showChapterSuggestion group marginTop17px']/ul/li[@class='sprite sprite-physics']")
	private WebElement tagphysicsicon;
	@FindBy(id="chapterAutoCompleteBox")
	private WebElement chaptertxtbx;
	@FindBy(xpath="//div[@class='floatLeft animateBtn']/div[@id='submitQuestionAsk']")
	private WebElement finalsubmiticon;
	@FindBy(xpath="//div[@class='mnPopupFront']/a")
	private WebElement crossIcon;
	@FindBy(xpath="//form[@class='ng-pristine ng-valid']/input[1]")
	private WebElement askquestionplacholder;
	@FindBy(xpath="//ul[@class='anatabs']/li")
	private List <WebElement> alltabs;
	@FindBy(xpath="//div[@id='top_filter_box']/div/div/select")
	private WebElement classdrpdwn;	
	@FindBy(xpath="//div[@id='top_filter_box']/div/div/div/ul/li")
	private List <WebElement> subjectlist;
	@FindBy(xpath="//div[@class='subject floatNone ng-scope']/a")
	private WebElement allclasseslnk;	
	@FindBy(xpath="//div[@class='commentContainer']/div[3]")
	private WebElement commentcontainer;
	@FindBy(xpath="//div[@class='moreQuestionsContainer']/a")
	private WebElement viewmorecomntlnk;
	@FindBy(xpath="//div[@id='top_filter_box']/div[3]/a[1]")
	private WebElement icanansbtn;
	@FindBy(xpath="//div[@id='top_filter_box']/div[3]/a[2]")
	private WebElement allbtn;
	@FindBy(xpath="//div[@class='commentContainer']/div[3]/div/div/div[2]")
	private List <WebElement> allaskedquestions;
	@FindBy(xpath="//div[@class='user_activity']/div/div/h2[text()='Leaderboard']")
	private WebElement leaderboard;
	@FindBy(xpath="//div[@class='user_activity']/div/div/div/a[1]")
	private WebElement mnth;
	@FindBy(xpath="//div[@class='user_activity']/div/div/div/a[2]")
	private WebElement day;
	@FindBy(xpath="//div[@class='bottom group']/div[1]/span[1]")
	private WebElement students;
	@FindBy(xpath="//div[@class='bottom group']/div[1]/span[2]")
	private WebElement helpfullvotes;
	@FindBy(xpath="//div[@class='bottom group']/div[2]/img")
	private WebElement seeyourselfhere;
	@FindBy(xpath="//div[@class='user_activity']/div[2]/div/h2[contains(text(),'My Stats')]")
	private WebElement mystats;
	@FindBy(xpath="//div[@class='user_activity']/div[3]/div[1]")
	private WebElement getrewarded;
	@FindBy(xpath="//div[@class='user_activity']/div[3]/div[2]/div[2]")
	private WebElement pntsforansweringquestion;
	@FindBy(xpath="//div[@class='user_activity']/div[3]/div[2]/div[3]")
	private WebElement pntsforhelpfulvotefromothers;
	@FindBy(xpath="//div[@class='user_activity']/div[3]/div[2]/div[4]")
	private WebElement pntsforhelpfulvotefromexperts;
	@FindBy(xpath="//div[@class='myStatusContainer marginBottom20px']/div/h2[contains(text(),'Email')]")
	private WebElement emailnotification;
	@FindBy(xpath="//div[@class='commentContainer']/div[3]/div/div/div[1]/div[2]/div/a")
	public List <WebElement> questionaskeename;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[1]/div[1]/a")
	public List <WebElement> questionaskeenameonchildwndw;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[2]")
	public WebElement questionaskedonchildwndw;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/div/div[2]/span")
	public WebElement sharewithfrnds;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/div/div[2]/ul/li[1]")
	public WebElement fbicon;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/div/div[2]/ul/li[2]")
	public WebElement twittericon;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/div/div[2]/ul/li[3]")
	public WebElement googleicon;
	@FindBy(xpath="//div[@class='commentContainer']/div[3]/div/div/div[2]/a")
	public List <WebElement> askedquestions;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/a[1]")
	public WebElement likebtn;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[1]/div/div[3]/div/a[2]")
	public WebElement followbtn;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[2]/div")
	public List <WebElement> allgivenanswers;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[1]")
	public WebElement wasanswerhelpfultxt;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[2]")
	public WebElement nobtn;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[3]")
	public WebElement yesbtn;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/ul/li[4]")
	public WebElement usercount;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[3]/div/form/div[2]")
	public WebElement ansblock;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[3]/div/form/div[2]/div[1]")
	public WebElement ansblocktitle;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[3]/div/form/div[2]/div[2]/div/div")
	public WebElement anstxtbx;
	@FindBy(xpath="//main[@id='AnaLeftSectionControllerId']/div[3]/div[3]/div/form/div[2]/div[3]/button")
	public WebElement submitbtn;
	
	public AsknAnswerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void verifyClildWindowElementsOnQuestionClick(WebDriver driver){
		Assert.assertTrue(BasePage.isPresentAndDisplayed(sharewithfrnds));
		Assert.assertEquals(sharewithfrnds.getText(), "Share with your friends");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(fbicon));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(twittericon));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(googleicon));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(likebtn));
		likebtn.click();
		BasePage.sleepForMilliSecond(1000);
		likebtn.click();
		Assert.assertTrue(BasePage.isPresentAndDisplayed(followbtn));
		followbtn.click();
		BasePage.sleepForMilliSecond(1000);
		followbtn.click();
		try{
			if(BasePage.isPresentAndDisplayed(allgivenanswers.get(0)))
			{
			BasePage.scrollDown(wasanswerhelpfultxt, driver);
			Assert.assertEquals(wasanswerhelpfultxt.getText(), "Was this answer helpful?");
			Assert.assertTrue(BasePage.isPresentAndDisplayed(nobtn));
			Assert.assertTrue(BasePage.isPresentAndDisplayed(yesbtn));
			yesbtn.click();
			BasePage.sleepForMilliSecond(1000);
			yesbtn.click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(usercount));
			}
			}
		catch(IndexOutOfBoundsException ex){
			}
		try{
			BasePage.scrollDown(ansblock, driver);
			if(BasePage.isPresentAndDisplayed(ansblock)){
				Assert.assertEquals(ansblocktitle.getText(), "Add an Answer");
				Assert.assertTrue(BasePage.isPresentAndDisplayed(anstxtbx));
				BasePage.scrollDown(submitbtn, driver);
				Assert.assertTrue(BasePage.isPresentAndDisplayed(submitbtn));
				submitbtn.click();
				BasePage.sleepForMilliSecond(1000);
				driver.switchTo().alert().accept();
				driver.switchTo().defaultContent();
			}
		}
		catch(NoSuchElementException ex){
			}
		}

	public void clickRecommendedQuestions(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		BasePage.focusElement(qadrpdwnbx, driver);
		BasePage.selectUsingOption(qadrpdwnbx, "Recommended Questions");
		recommendedprojects.click();
		qadrpdwnbx.sendKeys(Keys.ARROW_DOWN);
		}
	public void clickAsk(WebDriver driver)
	{
		WaitStatementLib.explicitWaitForVisiblity(driver, 5, redaskbtn);;
		redaskbtn.click();
	
	}

	public void enterQuestion(WebDriver driver) 
	{
		try{
			Thread.sleep(2000);
			String question = ExcelUtils.readData("TestData", 2, 1);
			question = BasePage.randomString()+ " " + question + BasePage.randomString() + "?";
			BasePage.focusElement(questiontxtbx, driver);
			questiontxtbx.sendKeys(question);
		}
		catch(InterruptedException e)
		{
			String question = ExcelUtils.readData("TestData", 2, 1);
			question = question + BasePage.randomString() + "?";
			questiontxtbx.sendKeys(question);
		}
		
	}
	public void submitQuestion()
	{
			greenasktbtn.click();
			}
	public void tagQuestion()
	{
			tagphysicsicon.click();
			
	}
	public void chooseChapter(WebDriver driver)
	{
		String chaptername = ExcelUtils.readData("TestData", 2, 2);	
		chaptertxtbx.sendKeys(chaptername);
		chaptertxtbx.sendKeys(Keys.ARROW_DOWN);
		chaptertxtbx.sendKeys(Keys.ENTER);
		}
	public void finalSubmit()
	{
		try{
		finalsubmiticon.click();
		Thread.sleep(2000);
	}
		catch(InterruptedException e)
		{
			
		}
	}
	public void closeQuestenPostedPopup()
	{
		try{
			crossIcon.click();
			Thread.sleep(2000);
		}
			catch(InterruptedException e)
			{	
	}
	}
	public void verifyAskQuestionPlaceHolder(){
		Assert.assertEquals(askquestionplacholder.getAttribute("placeholder").toString(), "Ask a question","Ask a Question placeholder nott displayed");
	}
	public void verifyTabsOnRecommendedQuestions(WebDriver driver){
		Assert.assertTrue(BasePage.isPresentAndDisplayed(alltabs.get(0)),"Recommended Tab not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(alltabs.get(1)),"Popular tab not displayed");
		BasePage.sleepForMilliSecond(1000);
		alltabs.get(1).click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(allaskedquestions.get(0)));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(alltabs.get(2)),"Latest Tab ot displayed");
		BasePage.sleepForMilliSecond(2000);
		alltabs.get(2).click();
		BasePage.sleepForMilliSecond(10000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		WaitStatementLib.explicitWaitForVisiblity(driver, 10, allaskedquestions.get(0));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(allaskedquestions.get(0)));
		alltabs.get(0).click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(allaskedquestions.get(0)));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(classdrpdwn));
		classdrpdwn.click();
		for(int i=0;i<subjectlist.size();i++)
		{
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectlist.get(i)), i+"th subject not displayed");
			subjectlist.get(i).click();
			Assert.assertTrue(BasePage.isPresentAndDisplayed(allaskedquestions.get(0)));
			BasePage.sleepForMilliSecond(1000);
			allclasseslnk.click();
		}
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(allaskedquestions.get(0)));
		Assert.assertTrue(BasePage.isPresentAndDisplayed(icanansbtn));
		BasePage.sleepForMilliSecond(2000);
		icanansbtn.click();
		BasePage.sleepForMilliSecond(1000);
		allbtn.click();
		Assert.assertTrue(BasePage.isPresentAndDisplayed(leaderboard), "Lederboard not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(mnth), "month btn not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(day), "Day btn not displayed on right panel");
		mnth.click();
		BasePage.sleepForMilliSecond(1000);
		day.click();
		Assert.assertTrue(BasePage.isPresentAndDisplayed(students), "Students header not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(helpfullvotes), "Helpfull Votes header not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(seeyourselfhere), "See Yourself here header not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(mystats), "My Stats header not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(getrewarded), "Get Rewarded header not displayed on right panel");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(pntsforansweringquestion), "Instruction for answering a question is not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(pntsforhelpfulvotefromothers), "Instruction for helpful vote from others not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(pntsforhelpfulvotefromexperts), "Instruction for helpful vote from Meritnation Experts not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(emailnotification), "Email Notification header on right panel not displayed");
		if(String.valueOf(BasePage.isPresentAndDisplayed(viewmorecomntlnk)) != "false"){
			viewmorecomntlnk.click();
		}
	}
	
	public void clickkUserProfileOnRecommendedQuestions(){
		questionaskeename.get(0).click();
		BasePage.sleepForMilliSecond(2000);
		}
	public void clickkAskedQuestionOnRecommendedQuestions(WebDriver driver){
		BasePage.switchToWindow(driver, askedquestions);
		BasePage.sleepForMilliSecond(2000);
		}
	public void verifyQuestionAskeeNameAndQuestion(){
		String askeename = questionaskeename.get(0).toString();
		
	}
	
}


