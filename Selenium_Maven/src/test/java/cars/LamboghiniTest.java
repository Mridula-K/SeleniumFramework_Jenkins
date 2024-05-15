package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LamboghiniTest
{
@Test
public void LaunchLambhogini()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://lamboghini.com/");
	Reporter.log("Lamboghini launched Successfully",true);
}
}
