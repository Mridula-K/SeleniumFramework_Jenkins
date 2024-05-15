package mavenParameterPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoWebShopMavenParameter
{
	@Test
	public void data()
	{
		String url = System.getProperty("url");
		Reporter.log(url,true);
		String email = System.getProperty("email");
		Reporter.log(email,true);
		String password = System.getProperty("password");
	    Reporter.log(password,true);
	    
	    WebDriver driver=new ChromeDriver();
	    driver.get(url);
//	    driver.findElement(By.linkText("Log in")).click();
	    driver.findElement(By.id("Email")).sendKeys(email);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
}

