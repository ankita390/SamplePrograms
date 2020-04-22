package com.applect.meritnationetutor.scripts;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.EtutorPage;
import org.testng.annotations.Test;

public class EtutorTest extends BaseLib
{
	
	@Test(groups="CurrentTask")
	public void TC_001_CreateClassTest()
	{
		driver.get("https://www.meritnation.com/etutor/etutor_admins/login");
		//driver.get("https://www.meritnation.net/etutor/etutor_admins/login");
		EtutorPage etutorpage = new EtutorPage(driver);
		etutorpage.enterTeacher(driver, 1, 18);
		etutorpage.enterEtutorPassword(driver);
		etutorpage.etutorLogin();
		etutorpage.createClass(driver);
		}

    @Test(groups="CurrentTask")
    public void TC_002_CreateQuizTest() {
        driver.get("https://www.meritnation.com/etutor/etutor_admins/login");
        //driver.get("https://www.meritnation.net/etutor/etutor_admins/login");
        EtutorPage etutorpage = new EtutorPage(driver);
        etutorpage.enterTeacher(driver, 1, 21);
		etutorpage.enterTeacherPassword(driver);
        etutorpage.etutorLogin();
		etutorpage.createQuiz(driver);
		etutorpage.enterClass(driver);
		/*etutorpage.verifyclass(driver);*/
    }
		
/*	@Test(groups="CurrentTas")
	public void TC_003_AttendClassTest() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginButtonClick(driver);
		loginpage.enterUserName(driver, 1, 20);
		loginpage.enterPassword(driver);
		loginpage.signInBtnClick(driver);
		EtutorPage etutorpage = new EtutorPage(driver);
		etutorpage.joinclass();
		etutorpage.verifyclass(driver);
	}*/
	
	}


