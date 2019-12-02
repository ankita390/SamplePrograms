package com.applect.meritnation.pageobject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.applect.meritnation.generic.ExcelUtils;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrackingAPIPage {
	
	
	public ArrayList<String> populateAllOtypes(){
		
			int userid = 23040578;
			ArrayList<String> str = new ArrayList<String>();
			ArrayList<String> cnt = new ArrayList<>();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		Date date = new Date();
		String currentdate = formatter.format(date);
		
		RestAssured.baseURI ="http://www.meritnation.com/trackingapi/v1";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET,"/activity?otype=userwise&filters[userId]=23040578&filters[end_date]=" +currentdate+ "&filters[start_date]=" +currentdate);
		for (int i=146;i<156;i++) {
		
		String arr = ExcelUtils.readData("TestData", i, 1);
		int allOtypesCount = response.path("data.otype.size()");
		
		
		str.add(arr);
		int counter =0;
		
		for(int j = 0;j < allOtypesCount;j++ )
		{
		if(arr.equalsIgnoreCase(response.path("data.otype["+j+"]").toString())) {
			counter=counter+1;
		
			}
		
		cnt.add(Integer.toString(counter));
		}
		
		
	}
	return(str);
	
			
}
	
	
	
	public ArrayList<String> populateOtypeCount(){
		
		int userid = 23040578;
		ArrayList<String> cnt = new ArrayList<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
	Date date = new Date();
	String currentdate = formatter.format(date);
	
	RestAssured.baseURI ="http://www.meritnation.com/trackingapi/v1";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.request(Method.GET,"/activity?otype=userwise&filters[userId]=23040578&filters[end_date]=" +currentdate+ "&filters[start_date]=" +currentdate);
	for (int i=146;i<156;i++) {
	
	String arr = ExcelUtils.readData("TestData", i, 1);
	int allOtypesCount = response.path("data.otype.size()");
	int counter =0;
	
	for(int j = 0;j < allOtypesCount;j++ )
	{
	if(arr.equalsIgnoreCase(response.path("data.otype["+j+"]").toString())) {
		counter=counter+1;
	
		}
	
	
	}
	cnt.add(Integer.toString(counter));
	
}
return(cnt);

		
}
	
	
	public TrackingAPIPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
