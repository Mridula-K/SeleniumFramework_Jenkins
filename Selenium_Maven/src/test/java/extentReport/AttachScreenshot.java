package extentReport;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AttachScreenshot 
{
@Test
public void screenshot() {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	ExtentSparkReporter spark = new ExtentSparkReporter("./reports/screeshotReport.html");
	ExtentReports extReport = new ExtentReports();
	extReport.attachReporter(spark);
	ExtentTest test = extReport.createTest("Screenshot");
	test.log(Status.PASS, "Welcome Page is displayed and screenshot attached");
	test.addScreenCaptureFromBase64String(ts.getScreenshotAs(OutputType.BASE64));
	extReport.flush();
}
}
