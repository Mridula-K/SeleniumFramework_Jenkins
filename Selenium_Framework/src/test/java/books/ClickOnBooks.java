package books;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnBooks {
@Test
public void click()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("BOOKS")).click();
	System.out.println("Books clicked successfully");
	Reporter.log("BOOKS PAGE DISPLAYED",true);
}
}
