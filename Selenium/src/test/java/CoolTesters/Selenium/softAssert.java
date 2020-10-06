package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	
	SoftAssert softAssert = new SoftAssert();
	
	
  @Test
  public void softAssertEquas() {
	  
	  
	  int a = 5;
	  int b = 10;
	  int x = 8;
	  int y = 7;
	  
	  softAssert.assertEquals(a, b);
	  softAssert.assertEquals(x, y);
	  
	  softAssert.assertAll();
	  
  }
  
  @Test
  
  public void softAssertDriver() { 
	  
	  String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
	  	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// Establecer la propiedad del .exe
	  	WebDriver driver = new ChromeDriver(); // Inicializando el driver
	  	driver.get("https://opensource-demo.orangehrmlive.com/");
	  	driver.manage().window().maximize(); //Maximizar Ventana
		  
		  
		  String actualTitle = driver.getTitle();
		  String expectedTitle = "OrangeHRM";
		  String badTitle = "asd";
		  
		  softAssert.assertEquals(actualTitle, expectedTitle);
		  softAssert.assertEquals(actualTitle, badTitle);
		  softAssert.assertAll();
	  
  }
  
}
