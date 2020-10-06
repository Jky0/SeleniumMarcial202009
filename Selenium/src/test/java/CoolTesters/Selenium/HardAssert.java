package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
  @Test
  public void assertEquals() {
	  
	  int a = 10;
	  int b = 10;
	  Assert.assertEquals(a,b,"Los Numeros no son Iguales");
  }
  
  @Test
  
  public void assertNoEquals() {
	  int a = 10;
	  int b = 10;
	  
	  Assert.assertNotEquals(a,b,"los Numeros iguales");
	  }
  
  @Test
  public void assertTrue() {
	int a = 10;
	int b = 10;
	Assert.assertTrue(a==b);
	}
  
  @Test
  public void assertfalse() {
	int a = 10;
	int b = 10;
	Assert.assertFalse(a==b);
	}
  
  @Test
  public void verificarTituloDepagina() {
	  
	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
  	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// Establecer la propiedad del .exe
  	WebDriver driver = new ChromeDriver(); // Inicializando el driver
  	driver.get("https://opensource-demo.orangehrmlive.com/");
  	driver.manage().window().maximize(); //Maximizar Ventana
	  
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "OrangeHRM";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
	  }
   
  @Test
  public void verificarTituloDepaginaBoolean() {
	  
	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
  	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// Establecer la propiedad del .exe
  	WebDriver driver = new ChromeDriver(); // Inicializando el driver
  	driver.get("https://opensource-demo.orangehrmlive.com/");
  	driver.manage().window().maximize(); //Maximizar Ventana
	  
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "OrangeHRM";
	  
	  boolean titulo = actualTitle.contains(expectedTitle);
	  
	  Assert.assertTrue(titulo);
	  }
  
  
  }

