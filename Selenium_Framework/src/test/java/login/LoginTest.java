package login;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
public static void main(String[] args) {
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapp.skillrary.com/");
}
}
