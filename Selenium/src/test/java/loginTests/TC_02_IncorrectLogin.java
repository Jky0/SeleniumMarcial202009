package loginTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import commonMethods.variablesGlobales;
import driverSetup.DriverSetup;
import navPages.loginPage;

public class TC_02_IncorrectLogin {
	
	
		WebDriver driver = DriverSetup.setupDriver();
		
		
		// Login PageObject
		loginPage login = new loginPage(driver);
		
				
		@BeforeTest
		public void startWebDriver() {
			
			driver.get(variablesGlobales.HOME_PAGE);
			//driver.manage().window().maximize();
			
		}	
	
	
  @Test
  public void TC_02() {
	  
	  boolean isIncorrect = login.loginIncorrect(variablesGlobales.USER_ADMIN, "badPassword");
	  AssertJUnit.assertTrue(isIncorrect);
	  
	 
	// System.out.println(isIncorrect.getText());
	// System.out.println(errorMsj.getText());
  }
  
    
  @AfterTest
  public void closeDriver() {
	  
	  driver.quit();
  
}
}

