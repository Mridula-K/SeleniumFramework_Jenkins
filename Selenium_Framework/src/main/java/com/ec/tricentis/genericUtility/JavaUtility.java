package com.ec.tricentis.genericUtility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	public void time() {
		LocalDateTime.now().toString().replace(":", "-");
	}

}
