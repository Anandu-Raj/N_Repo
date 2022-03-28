package GoPadelPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoPadelDashboardPage {
	
WebDriver driver;

	public GoPadelDashboardPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}

	public String getProductLabel() {
		// TODO Auto-generated method stub
		return null;
	}

}
