package GoPadelLoginTest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import GoPadelPages.GoPadelDashboardPage;
import GoPadelPages.GoPadelLoginPage;
import TestScenario.GoPadelTestBase;


public class GoPadelLoginTest extends GoPadelTestBase {
	
	GoPadelLoginPage loginPage;
	

	//Log4j configuration
	private static final Logger log = LogManager.getLogger(GoPadelLoginTest.class);
	
	@Test
	public void loginTest(){
		
		log.info("Verifying successful login.");
		
		loginPage = new GoPadelLoginPage(driver);
		
		//Should fetch the username and password from external test data files
		GoPadelDashboardPage dashboardPage = loginPage.login("admin", "Admin@12345");
//		String expectedProductLabel = "Products";
//		String actualProductLabel = dashboardPage.getProductLabel();
//		
//		log.info("expectedProductLabel-" + expectedProductLabel + " and actualProductLabel - " + actualProductLabel);
//		Assert.assertEquals(expectedProductLabel, actualProductLabel);
		
	}

}
