package com.applect.meritnationetutor.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.EtutorPage;

public class EtutorTest extends BaseLib
{
	
	@Test(groups="CurrentTask")
	public void TC_001_CreateClassTest()
	{
		driver.get("https://www.meritnation.com/etutor/etutor_admins/login");
		EtutorPage etutorpage = new EtutorPage(driver);
		etutorpage.enterteacher(driver, 1, 16);
		etutorpage.enteretutorPassword(driver);
		etutorpage.etutorlogin();
		etutorpage.createclass(driver);
		
		}
	
	}


