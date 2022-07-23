package package1;

import org.testng.annotations.Test;

public class Grouping {
	
	
	
	@Test(groups= {"sanity","regression"})
	public void OpenBrowser() {
		  System.out.println("This will open browser");
	  }

	
	@Test(groups= {"sanity"})
	public void CloseBrowser() {
		  System.out.println("This will close browser");
	  }

	
	@Test(groups= {"regression"})
	public void ActionOnBrowser() {
		  System.out.println("This will do action on browser");
	  }

}
