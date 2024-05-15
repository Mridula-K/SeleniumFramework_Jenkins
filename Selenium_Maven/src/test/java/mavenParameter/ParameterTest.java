package mavenParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParameterTest
{
@Test
public void receiveData()
{
	String url = System.getProperty("url");
	Reporter.log(url,true);
	String email = System.getProperty("email");
	Reporter.log(email,true);
	String password = System.getProperty("password");
    Reporter.log(password,true);
    
    WebDriver driver=new ChromeDriver();
    driver.get(url);
    driver.findElement(By.xpath("//input[@name='username']")).sendKeys(email);
    driver.findElement(By.name("password")).sendKeys(password);
}
}
