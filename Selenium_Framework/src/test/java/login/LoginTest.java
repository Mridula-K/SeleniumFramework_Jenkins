package login;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {
@Test
public void login()
{
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapp.skillrary.com/");
	 Reporter.log("Successfully executed");
	 System.out.println("Successfully executed");
}
}
