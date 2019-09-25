package com.applect.meritnation.generic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	private int retryCnt = 0;
	private  String  maxRetryCnt = GetPropertyValues.getPropertyValue("maxCountToRetryFailedTests");
	String number = maxRetryCnt ;
	Integer retryCounter = Integer.valueOf(number);
	public boolean retry(ITestResult result) 
	{
        if (retryCnt < retryCounter)
	        {
        		retryCnt++;
	            return true;
	        }
	        return false;
	  }
}
