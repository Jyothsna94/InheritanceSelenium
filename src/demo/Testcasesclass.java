package demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcasesclass extends Driversclass {
	Propertiesclass page;
	@BeforeClass
	  public void beforeClass() {
		  browserLaunch("CHROME", "https://www.facebook.com");
	  }
	@Test
	  public void registration() throws Exception
	  {
		  page=new Propertiesclass(driver);
		  page.UserLogin();
	  }
 

}
