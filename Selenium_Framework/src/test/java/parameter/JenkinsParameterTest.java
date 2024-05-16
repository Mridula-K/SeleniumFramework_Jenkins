package parameter;

import org.testng.annotations.Test;

public class JenkinsParameterTest {

	@Test
	public void recieveDataFromJenkins()
	{
		String browserValue = System.getProperty("browser");
		System.out.println(browserValue);
	}
}
