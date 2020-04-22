package com.applect.meritnation.pageobject;

import com.applect.meritnation.generic.ExcelUtils;
import com.applect.meritnation.generic.WaitStatementLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

public class EtutorPage {

	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userTxtBx;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passTxtBx;
	@FindBy(xpath = "//input[@name='Login']")
	private WebElement login;
	@FindBy(xpath = "//a[@class='manageBatch greenBtn']")
	private WebElement manageBatchBtn;
	@FindBy(xpath = "//input[@id='searchStudentEmail']")
	private WebElement searchStudntTxt;
	@FindBy(xpath = "//input[@id='searchBatchSbmtBtn']")
	private WebElement searchBtn;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[2]/td[11]/a[1]")
	private List<WebElement> manageClassBtn;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[8]/td[11]/a[1]")
	private WebElement manageClassBtn1;
	@FindBy(xpath = "//div[@class='CSSTableGenerator batchListWrappper']/table/tbody/tr[2]/td[11]")
	private WebElement classCountTxt;
	@FindBy(xpath = "//div[@class='mnPopupFront']/a")
	private WebElement closeClass;
	@FindBy(xpath = "//input[@id='startTime']")
	private WebElement startTimeTxt;
	@FindBy(xpath = "//input[@id='duration']")
	private WebElement durationTxt;
	@FindBy(xpath = "//input[@id='displayTimeDuration']")
	private WebElement timeDurationTxt;
	@FindBy(xpath = "//select[@id='roomNum']/option[2]")
	private WebElement roomNumSelect;
	@FindBy(xpath = "//select[@id='wServiceId']/option[2]")
	private WebElement webinarSelect;
	@FindBy(xpath = "//select[@id='professorId']")
	//@FindBy(xpath = "//select[@id='professorId']/option[5]")
	private WebElement vipinPro;
	@FindBy(xpath = "//select[@id='professorId']")
	//@FindBy(xpath = "//select[@id='professorId']/option[5]")
	private WebElement profDropDwn;
	@FindBy(xpath = "//input[@id='callWebinarApis']")
	private WebElement webinarNow;
	@FindBy(xpath = "//input[@id='saveClassBtn']")
	private WebElement saveClass;
	@FindBy(xpath = "//span[@id='loadingImage']/span")
	private WebElement message;
	@FindBy(xpath = "//div[@class='classData']/table/tbody/tr[2]/td[10]")
	private WebElement enterClass;
	@FindBy(xpath = "//input[@id='username_login_1']")
	private WebElement studentTxtBx;
	@FindBy(xpath = "//div[@id='currentSession']/article/a[1]")
	private WebElement classBanner;
	@FindBy(xpath = "//div[@id='classInProgress']")
	private WebElement joinClass;
	@FindBy(xpath = "//div[@id='testpagedialog']/md-dialog/md-toolbar/div/button/md-icon")
	private WebElement systemClose;
	@FindBy(xpath = "//md-dialog-actions[@class='layout-row']/button")
	private WebElement gotItbtn;
	@FindBy(xpath = "//md-dialog-actions[@class='layout-row']/button")
	private WebElement enterLiveSession;
	@FindBy(xpath = "//canvas[@id='temp-white-board-0']")
	private WebElement drawingArea;
	@FindBy(xpath = "//div[@id='board-menu-bar']/button[10]")
	private WebElement uploadDoc;
	@FindBy(xpath = "//md-content[@class='_md']/md-tabs/md-tabs-wrapper/md-tabs-canvas/md-pagination-wrapper/md-tab-item[2]")
	private WebElement chooseRepo;
	@FindBy(xpath = "//div[@class='list-thumbnails']/md-card[4]/span")
	private WebElement folder2upld;
	@FindBy(xpath = "//div[@class='list-thumbnails']/md-card[1]")
	private WebElement file2upld;
	@FindBy(xpath = "//div[@class='button']/button[1]/span")
	private WebElement slctall;
	@FindBy(xpath = "//div[@class='button']/button[2]/span")
	private WebElement embed;
	@FindBy(xpath = "//html/body/div[1]/div[1]/div[1]/a")
	private WebElement close;
	@FindBy(xpath = "//div[@class='classData']/table/tbody/tr[2]/td[12]")
	private WebElement manageQuizBtn;
	@FindBy(xpath = "//section[@id='main_section']/a[2]")
	private WebElement addQuizBtn;
	@FindBy(xpath = "//div[@class='clsFormRow']/input")
	private WebElement quizNameTxtBx;
	@FindBy(xpath = "//select[@id='totalQuestions']")
	private WebElement noOfQuesDrpDwn;
	@FindBy(xpath = "//button[@id='saveQuiz']")
	private WebElement saveQuiz;
	@FindBy(xpath = "//div[@class='login-box']/input[2]")
	private WebElement teacherPasstxtbox;
	@FindBy(xpath = "//div[@class='content_mnpopup']/button[1]")
	private WebElement findQuesBtn;
	@FindBy(xpath = "//div[@class='mnPopupFront']/a")
	private WebElement questionCloseList;
	@FindBy(xpath = "//section[@id='main_section']/a")
	private WebElement goToHome;
	/*@FindBy(xpath = "//div[@class='clsFormRow']/input")
	private WebElement quizNameTxtBx;
	@FindBy(xpath = "//select[@id='totalQuestions']")
	private WebElement noOfQuesDrpDwn;
	@FindBy(xpath = "//button[@id='saveQuiz']")
	private WebElement saveQuiz;
	@FindBy(xpath = "//div[@class='login-box']/input[2]")
	private WebElement teacherPasstxtbox;
	@FindBy(xpath = "//div[@class='content_mnpopup']/button")
	private WebElement findQuesbtn;*/


	public EtutorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterTeacher(WebDriver driver, int i, int j) {
		try {
			String username = ExcelUtils.readData("TestData", i, j);
			if (username != null && !username.equals("")) {
				userTxtBx.sendKeys(username);
			} else {
				return;
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void enterEtutorPassword(WebDriver driver) {
		String password = ExcelUtils.readData("TestData", 1, 19);
		passTxtBx.sendKeys(password);
		WaitStatementLib.implicitWaitForSecond(driver, 2);
	}

	public void etutorLogin() {
		login.click();
	}

	public void createClass(WebDriver driver) {
		manageBatchBtn.click();
		searchStudntTxt.sendKeys("enggqatest+62@meritnation.com");
		//searchstudnttxt.sendKeys("ajit11@m.com");
		WaitStatementLib.explicitWaitForVisiblity(driver, 2, searchBtn);
		searchBtn.click();
		BasePage.sleepForMilliSecond(2000);
		//BasePage.scrollDown(classcounttxt, driver);
		BasePage.switchToWindow(driver, classCountTxt, manageClassBtn);
		int classtime = 2;
		for (int e = 2; e <= 2; e++) {
			WebElement editclass = driver.findElement(By.xpath("//div[@class='classData']/table/tbody/tr[" + e + "]/td[15]/ul[1]/li[2]/span[1]/a"));
			editclass.click();
			Calendar calendar = Calendar.getInstance();
			if (e == 2) {
				calendar.add(Calendar.MINUTE, classtime);
			} else {
				classtime = classtime + 10;
				calendar.add(Calendar.MINUTE, classtime);
			}
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			String firsttime = format1.format(calendar.getTime());
			WaitStatementLib.explicitWaitForClickable(driver, 7, startTimeTxt);
			startTimeTxt.sendKeys(firsttime);
			durationTxt.sendKeys("10");
			timeDurationTxt.sendKeys("10");
			roomNumSelect.click();
			WebElement webinarselect = driver.findElement(By.xpath("//select[@id='wServiceId']/option[13]"));
			webinarselect.click();
			Select professor = new Select((WebElement) vipinPro);
			professor.selectByVisibleText("Vipin Professor");
		}
		webinarNow.click();
		saveClass.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 5, message);
		Assert.assertEquals(message.getText(), "Class information saved successfully.");
		System.out.println(message.getText());
		close.click();
	}

	public void enterTeacherPassword(WebDriver driver) {
		String password = ExcelUtils.readData("TestData", 1, 2);
		teacherPasstxtbox.sendKeys(password);
		WaitStatementLib.implicitWaitForSecond(driver, 2);
	}

	public void createQuiz(WebDriver driver) {
		manageQuizBtn.click();
		addQuizBtn.click();
		quizNameTxtBx.sendKeys("new1");
		Select totalQues = new Select(noOfQuesDrpDwn);
		totalQues.selectByVisibleText("5");
		saveQuiz.click();
		for (int index = 1; index <= 5; index++) {
			WebElement questiontime = driver.findElement(By.xpath("//div[@class='ques-wrapper']/div[" + index + "]/div[2]/input[1]"));
			questiontime.sendKeys("20");
			BasePage.scrollDownPage(driver);
			WaitStatementLib.implicitWaitForSecond(driver,10);
			WebElement question = driver.findElement(By.xpath("//div[@class='ques-wrapper']/div["+index+"]/div[2]/a[1]"));
			System.out.println(question);
			WaitStatementLib.explicitWaitForClickable(driver,5,question);
			question.click();
			Actions findQues = new Actions(driver);
			WaitStatementLib.explicitWaitForVisiblity(driver,15,findQuesBtn);
			findQues.moveToElement(findQuesBtn).click().build().perform();
			WaitStatementLib.implicitWaitForSecond(driver,7);
			WebElement selectQuestion = driver.findElement(By.xpath("//div[@id='questionList']/div["+index+"]/div[6]/button[1]"));
			selectQuestion.click();

		}

		//questionCloseList.click();
		goToHome.click();
	}

	public void enterClass(WebDriver driver) {
		enterClass.click();
	}

	public void verifyClass(WebDriver driver) {
		BasePage.sleepForMilliSecond(2000);
		BasePage.switchToWindow(driver);
		WaitStatementLib.explicitWaitForVisiblity(driver, 10, systemClose);
		systemClose.click();
		/*Actions builder = new Actions(driver);
	    Action drawAction = builder.moveToElement(Drawingarea,135,15) //start points x axis and y axis.
	              .click()
	              .moveByOffset(200, 60) // 2nd points (x1,y1)
	              .click()
	              .moveByOffset(100, 70)// 3rd points (x2,y2)
	              .doubleClick()
	              .build();
	    drawAction.perform();*/
	  /* BasePage.sleepForMilliSecond(2000);
	    uploaddoc.click();
	    chooserepo.click();
	    BasePage.sleepForMilliSecond(1000);
	    folder2upld.click();
	    file2upld.click();
	    WaitStatementLib.explicitWaitForVisiblity(driver,100, slctall);
	    slctall.click();
	    embed.click();
	    BasePage.sleepForMilliSecond(3000);
	    close.click();*/
		WaitStatementLib.explicitWaitForVisiblity(driver, 400, gotItbtn);
		gotItbtn.click();
		WaitStatementLib.explicitWaitForVisiblity(driver, 5, systemClose);
		WaitStatementLib.explicitWaitForVisiblity(driver, 10, enterLiveSession);
		enterLiveSession.click();

	}

	public void enterStudent(WebDriver driver, int i, int j) {
		try {
			String username = ExcelUtils.readData("TestData", i, j);
			if (username != "") {
				studentTxtBx.sendKeys(username);
			}
			WaitStatementLib.implicitWaitForSecond(driver, 2);
		} catch (NullPointerException ex) {
		}
	}

	public void joinClass() {
		classBanner.click();
		joinClass.click();
	}
}
