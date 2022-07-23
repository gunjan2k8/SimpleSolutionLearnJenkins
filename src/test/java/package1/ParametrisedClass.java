package package1;

import org.testng.annotations.Test;

public class ParametrisedClass {
	
	String browser=System.getProperty("browsername");
	
	@Test
	public void OpenBrowser() {
		if(browser.equals("chrome"))
		  System.out.println("This will open chrome ");
	  
	else if(browser.equals("firefox")){
		
		  System.out.println("This will open firefox browser");
	}
		
	}


}
