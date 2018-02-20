package com.applect.meritnation.pageobject;

import java.util.List;

import org.openqa.selenium.Keys;
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
	
	
	
	
	public AsknAnswerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

	public void clickRecommendedQuestions(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		BasePage.focusElement(qadrpdwnbx, driver);
		BasePage.selectUsingOption(qadrpdwnbx, "Recommended Questions");
		recommendedprojects.click();
		try{
			Thread.sleep(5000);
			qadrpdwnbx.sendKeys(Keys.ARROW_DOWN);
		}
		catch(InterruptedException e)
		{
			qadrpdwnbx.sendKeys(Keys.ARROW_DOWN);
		}
	}
	public void clickAsk(WebDriver driver)
	{
		WaitStatementLib.implicitWaitForSecond(driver, 5);
		redaskbtn.click();
		try{
			Thread.sleep(5000);
			}
		catch(InterruptedException e)
		{
			
		}
	
	}

	public void enterQuestion(WebDriver driver) 
	{
		try{
			Thread.sleep(5000);
			String question = ExcelUtils.readData("TestData", 2, 1);
			question = question + BasePage.randomString() + "?";
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
		try{
			greenasktbtn.click();
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			greenasktbtn.click();
		}
	}
	public void tagQuestion()
	{
		try{
			tagphysicsicon.click();
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			tagphysicsicon.click();	
		}
	}
	public void chooseChapter(WebDriver driver)
	{
		try{
			String chaptername = ExcelUtils.readData("TestData", 2, 2);	
			chaptertxtbx.sendKeys(chaptername);
			Thread.sleep(2000);
			chaptertxtbx.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			chaptertxtbx.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
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
		Assert.assertTrue(BasePage.isPresentAndDisplayed(alltabs.get(2)),"Latest Tab ot displayed");
		BasePage.sleepForMilliSecond(2000);
		alltabs.get(2).click();
		BasePage.sleepForMilliSecond(5000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		alltabs.get(0).click();
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		Assert.assertTrue(BasePage.isPresentAndDisplayed(classdrpdwn));
		classdrpdwn.click();
		for(int i=0;i<subjectlist.size();i++)
		{
			BasePage.sleepForMilliSecond(1000);
			Assert.assertTrue(BasePage.isPresentAndDisplayed(subjectlist.get(i)), i+"th subject not displayed");
			subjectlist.get(i).click();
			BasePage.sleepForMilliSecond(1000);
			allclasseslnk.click();
		}
		Assert.assertTrue(BasePage.isPresentAndDisplayed(commentcontainer),"Comment container not displayed");
		BasePage.usingSoftAssert(BasePage.isPresentAndDisplayed(viewmorecomntlnk), "View more comment link not present");
		viewmorecomntlnk.click();
		WaitStatementLib.explicitWaitForClickable(driver, 10, icanansbtn);
		BasePage.sleepForMilliSecond(2000);
		Assert.assertTrue(BasePage.isPresentAndDisplayed(icanansbtn));
		BasePage.pressPageUpKey(driver);
		icanansbtn.click();
		BasePage.sleepForMilliSecond(1000);
		allbtn.click();
		
		
	}
}
