package com.applect.meritnationetutor.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.EtutorPage;
import com.applect.meritnation.pageobject.LoginPage;

public class EtutorTest extends BaseLib
{
	
	@Test(groups="CurrentTask")
	public void TC_001_CreateClassTest()
	{
		driver.get("https://www.meritnation.com/etutor/etutor_admins/login");
		//driver.get("https://www.meritnation.net/etutor/etutor_admins/login");
		EtutorPage etutorpage = new EtutorPage(driver);
		etutorpage.enterteacher(driver, 1, 16);
		etutorpage.enteretutorPassword(driver);
		etutorpage.etutorlogin();
		etutorpage.createclass(driver);
		etutorpage.enterclass(driver);
		etutorpage.verifyclass(driver);
		}
	@Test(groups="CurrentTask")
	public void TC_002_AttendClassTest() {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.loginButtonClick(driver);
		loginpage.enterUserName(driver, 1, 18);
		loginpage.enterPassword(driver);
		loginpage.signInBtnClick(driver);
		EtutorPage etutorpage = new EtutorPage(driver);
		etutorpage.joinclass();
		etutorpage.verifyclass(driver);
		
		
	}
	
	}


