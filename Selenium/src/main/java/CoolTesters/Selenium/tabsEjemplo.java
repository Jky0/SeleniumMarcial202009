package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tabsEjemplo {

	public static void main(String[] args) throws InterruptedException {
		
			

    	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
    	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// Establecer la propiedad del .exe
    	WebDriver driver = new ChromeDriver(); // Inicializando el driver
      	driver.get("http://demo.guru99.com/popup.php");
      	driver.manage().window().maximize();// Maximizar Ventana
    	

		
		//Obtener e imprimir el ID de la venta / Tab Original
		
		String originalTab = driver.getWindowHandle();
		System.out.println(originalTab);
		Thread.sleep(5000);
		
		//Click en el link que abre otra ventana
		WebElement clickHere = driver.findElement(By.xpath("//*[contains(@href, 'popup.php')]"));
		clickHere.click();
		
		Set<String> ventanasAbiertas = driver.getWindowHandles(); //Set es una utilieria de Java guardar
		                                                          // una lista sin duplicados
		
		System.out.println(ventanasAbiertas); 
		
		for (String tabNueva : driver.getWindowHandles()) {  //Estructura FOR simplificado
			if (!originalTab.contentEquals(tabNueva)) { // el operador booleano "|" significa 
				driver.switchTo().window(tabNueva);
				break;
			}
		}
		
		//Escribir el email en la nueva ventana
		
		WebElement emailTxt = driver.findElement(By.name("emailid"));
		emailTxt.sendKeys ("test@test.com");
		
		
		//regresar a la ventana original
		driver.switchTo().window(originalTab);
		

	}

}
