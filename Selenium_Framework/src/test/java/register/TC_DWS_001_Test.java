package register;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ec.tricentis.genericUtility.ExcelUtility;

public class TC_DWS_001_Test {
@Test
public void receiveData() throws EncryptedDocumentException, IOException{
	ExcelUtility eLib=new ExcelUtility();
	String email = eLib.getDataFromExcel("Login", 1,0);
	System.out.println(email);
	
}
	
}
