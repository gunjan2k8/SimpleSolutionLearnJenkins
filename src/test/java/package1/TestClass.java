package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void OpenBrowser() {
		  System.out.println("This will open browser");
	  }

	
	@Test
	public void CloseBrowser() {
		  System.out.println("This will close browser");
		  String str="test";
		  Assert.assertNotEquals(str, "test1");
		  Assert.assertTrue(false);
	  }
	

	
	@Test
	public void ActionOnBrowser() {
		  System.out.println("This will do action on browser");
	  }

	
	
}
