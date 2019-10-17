package com.applect.meritnation.scripts;

import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.BasePage;
import com.applect.meritnation.pageobject.GradePage;

public class GradeTest extends BaseLib {
	@Test(groups = "grade")
	public void TC_001_VerifyGradePageContent() {
		BasePage.loginAsClassTenUser(driver);
		gradePage.verifyAllPagesOfGradeMenu(driver);
	}

}
