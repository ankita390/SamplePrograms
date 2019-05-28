package com.applect.meritnation.scripts;


import org.testng.annotations.Test;

import com.applect.meritnation.generic.BaseLib;
import com.applect.meritnation.pageobject.ProfessorApiPage;



public class ProfessorApiTest extends BaseLib{
	
	@Test(invocationCount=1, groups="CurrentTas", priority =1)
	public void TC_001_ProfessorIDTest() 
	{
		
		driver.get("https://www.meritnation.com/etutorapi/v1/classes/206513?projection=details&filter[course_id]=12&filter[subject_id]=3&q=23042019");
		ProfessorApiPage professorApiPage = new ProfessorApiPage(driver);
		professorApiPage.checkProfessorID();
		
	}

}
