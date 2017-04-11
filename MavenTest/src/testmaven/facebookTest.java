package testmaven;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebookTest {
	
	
	@Test
	public void testt(){
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		Assert.assertEquals(driver.getTitle(), "facebook");
		
		
	}

}
