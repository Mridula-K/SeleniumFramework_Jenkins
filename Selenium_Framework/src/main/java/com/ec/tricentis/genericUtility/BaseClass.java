package com.ec.tricentis.genericUtility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public static WebDriver driver;
@BeforeClass
public void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod
	public void loginUser() {
	       driver.findElement(By.linkText("Log in")).click();
	       driver.findElement(By.id("Email")).sendKeys("saibaba7166@gmail.com");
	       driver.findElement(By.id("Password")).sendKeys("Sb23@1947");
	       driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}

@AfterMethod
public void logoutUser()
{
	driver.findElement(By.linkText("Log out")).click();
	
}
@AfterClass
public void closeBrowser()
{
	driver.quit();
	
}
}

