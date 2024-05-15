package com.ec.tricentis.genericUtility;


import java.io.File;
import java.io.IOException;

import  org.openqa.selenium.io.FileHandler;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot; 

public class ListenerUtility  extends BaseClass implements ITestListener,ISuiteListener
{
	
   @Override
	public void onTestFailure(ITestResult result) 
   {

 	 TakesScreenshot ts =(TakesScreenshot) driver;
	   File temp = ts.getScreenshotAs(OutputType.FILE);
	   File dest=new File("./Selenium_Framework/Screenshots");
	   try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
