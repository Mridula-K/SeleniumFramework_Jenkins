package register;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ec.tricentis.genericUtility.FileUtility;

public class TC_DWS_002_Test 
{
@Test
public void getDataFromFile() throws IOException
{
FileUtility file=new FileUtility();
String url = file.getDataFromFile("url");
System.out.println(url);


}
}
