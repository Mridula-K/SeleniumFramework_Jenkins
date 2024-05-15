package extentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReports 
{
@Test
public void report()
{
	String time = LocalDateTime.now().toString().replace(":", "-");
	//Create ExtentSparkReporter object
	ExtentSparkReporter spark=new ExtentSparkReporter("./reports/ExtentReport"+time+".html");
	
	//Create ExtentReports object
	ExtentReports extReports=new ExtentReports();
	
	//Attach ExtentSparkreporter to extentReports
	extReports.attachReporter(spark);
	
	//Create ExtentTest object
	ExtentTest test=extReports.createTest("report");
	
	//Call log method to add message inside report
	test.log(Status.PASS, "Home Page is displayed");
	
	//Call Flush Method
	extReports.flush();
	
}
}
