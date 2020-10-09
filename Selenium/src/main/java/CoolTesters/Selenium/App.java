package CoolTesters.Selenium;

import java.io.File;
import java.nio.file.Paths;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class App 
{
    public static void main( String[] args ) throws InterruptedException
        
    {
    	   	
    	System.out.println("Curso Septiembre 05.09.2020");
    	
    	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator; //tomando el path del driver en el sistema
    	System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");// Establecer la propiedad del .exe
    	WebDriver driver = new ChromeDriver(); // Inicializando el driver
    	driver.get("https://opensource-demo.orangehrmlive.com/"); //Iniciar chrome en la URL especificada
    	//driver.manage().window().maximize();//Maximizar Ventana
    	
    	
    	//Obteniendo objetos / elementos de la pagina de login
    	
    	WebElement txtUserName = driver.findElement(By.id("txtUsername"));
    	WebElement txtpassword = driver.findElement(By.id("txtPassword"));
    	WebElement btnLogin = driver.findElement(By.id("btnLogin"));
    	
    	
    	//Haciendo login
    	
    	txtUserName.sendKeys("Admin");
    	Thread.sleep(3000);
    	txtpassword.sendKeys("admin123");
    	Thread.sleep(3000);
    	btnLogin.click();
    	Thread.sleep(5000);
    	
    	//Validacion de Home Page
    	
    	String urlDashboard = driver.getCurrentUrl();
    	System.out.println("URL: " + urlDashboard);
    	urlDashboard.contains("/dashboard"); // Verificando que la URL contenga /dashboard
    	
    	// Metodos de navegación
    	
//    	driver.navigate().back();
//    	Thread.sleep(3000);
//    	driver.navigate().forward();
//    	Thread.sleep(3000);
//    	driver.navigate().refresh();
//    	Thread.sleep(3000);
    	
    	// Como imprimir el titulo de la pagina
    	
    	String title = driver.getTitle();
    	System.out.println("El titulo de la pagina es: " + title);
    	
    	//Click assignLeaveBtn
    	
    	WebElement btnAssignLeave = driver.findElement(By.className("quickLinkText"));
    	btnAssignLeave.click();
    	Thread.sleep(3000);
    	
    	
    	// Obtener Texto de un Web Element
    	
    	String welcomeMsj = driver.findElement(By.id("welcome")).getText();
    	boolean verifywelcomeMsj = welcomeMsj.contains("Linda");
    	if (verifywelcomeMsj) {
    		System.out.println("El mensaje contiene el nombre de Linda");
    	}else {
    		
    		System.out.println("Error el mensaje NO contiene el nombre esperado");
    	}
    	
    	// Dropdowns

    	Select oSelect = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
    	oSelect.selectByVisibleText("Maternity US");
    	Thread.sleep(3000);
    	
    	
	
    	
    	
        // Cerrar Navegador Web
    	
    	driver.close(); // Cierra la ventana actual
    	driver.quit();  // Cierra todas las ventanas creadas por el WebDriver
    	
    	
    }
    
}
    	
    	
    	
//    	byte x;
//    	
//    	x=127;
//    	System.out.println(x);
//    	
//    	short y=130;
//    	System.out.println(y);
//    	
//    	int z = 98345;
//    	System.out.println(z);
//    	
//    	long a = 3456789;
//    	float base = 30.5f;
//    	double altura = 40.76d;
//    	
//    	char letraA= 'A';
//    	System.out.println(letraA);
//    	
//    	String cadenaText0= "Cool Testers";
//    	
//    	System.out.println(cadenaText0);
//    			
//    	boolean avesVuela n;
//    	avesVuelan = true;
//    	
//    	System.out.println("Las aves vuelan? "+ avesVuelan);
    	
    	/*
    	 * Operadores Aritmeticos 
    	 */
  

//      	int x=1;
//    	int y=2;
//    	int resultado;
//    	
//    	resultado= x+y;
//    	System.out.println("resultado"+resultado);
//    	
//    	/*
//    	 * Operadores Unarios
//    	 */
//    	
//    	int valor1 =3;
//    	System.out.println("valor1 es igual a "+ valor1);
//    	int incrementar = ++valor1;
//    	System.out.println("incrementar es igual a "+incrementar);
//    	

    	/*
    	 * Operadores relacionales y condicionales
    	 */
//    	
//    	int x = 7;
//    	int z = 8;
//    	
//    	if (x==z) {
//    		System.out.println("x es igual a z");
//    	}
//    	else {
//    		System.out.println("x es diferente de z");
//    	}
//    	
        	
//    	//FindElements
//    	List<WebElement> firstLevelMenu = driver.findElements(By.xpath("//*[@class='firstLevelMenu']/b"));
//    	System.out.println("Numero de elementos: " + firstLevelMenu.size());
//    	String primerMenu = firstLevelMenu.get(0).getText();
//    	System.out.println(primerMenu);
//    	String segundoMenu = firstLevelMenu.get(1).getText();
//    	System.out.println(segundoMenu);
//    	
//    	for(int i = 0; i < firstLevelMenu.size(); i++ ) {
//    		System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
//    	}
//    	
//    	
    	
//    	
//    }
//}




//    	String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "chromedriver" + File.separator; //Tomando path del driver en el sistema
//        System.setProperty("webdriver.chrome.driver",exePath + "chromedriver.exe");
//    	WebDriver driver = new ChromeDriver();// Inicializando el driver
//    	driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
//    	driver.manage().window().maximize();//Maximizar Ventana
//    	
//    	//Obteniendo objetos/elementos de la pagina del login
//    	WebElement txtUserName = driver.findElement(By.id("txtUsername"));
//    	WebElement txtPassword = driver.findElement(By.id("txtPassword"));
//    	WebElement btnLogin = driver.findElement(By.id("btnLogin"));
//    	
//    	//Haciendo login
//    	txtUserName.sendKeys("Admin");
//    	Thread.sleep(3000);
//       	txtPassword.sendKeys("admin123");
//       	Thread.sleep(3000);
//    	btnLogin.click();
//    	Thread.sleep(5000);
//    	
//    	//Validacion de Home Page
//    	String urlDashboard = driver.getCurrentUrl();
//    	System.out.println("URL: "+ urlDashboard);
//    	urlDashboard.contains("/dashboard");//Verificando que la URL contenga /dashboard
//    	
//    	//metodos de navegacion
//    	driver.navigate().back();
//    	Thread.sleep(3000);
//    	driver.navigate().forward();
//    	Thread.sleep(3000);
//    	driver.navigate().refresh();
//    	Thread.sleep(3000);
//    	
//    	//
//    	String title = driver.getTitle();
//    	System.out.println("Title is: " + title);
//    	
//    	//Click assignLeaveBtn
//    	WebElement assignLeaveBtn = driver.findElement(By.className("quickLinkText"));
//    	assignLeaveBtn.click();
//    	Thread.sleep(3000);
//    	
//    	//Obtener TExt de un WebElement
//    	
//    	String WelcomeMsj = driver.findElement(By.id("welcome")).getText();
//    	boolean verifyWelcomeMsj = WelcomeMsj.contains("Smith");
//    	if(verifyWelcomeMsj) {
//    		System.out.println("El mensaje contiene el nombre de Smith");
//    	}else {
//    		System.out.println("ERROR el mensaje NO contiene el nombre esperado");
//    	}
//    	
//    	//Dropdowns
//    	
//    	Select leaveTypeDrpDwn = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
//    	leaveTypeDrpDwn.selectByVisibleText("Maternity US");
//    	
//    	  	
//    	
//    	   	
//    	//Cerrar Navegador Web
//    	driver.close();//Cierra la ventana actual
//    	driver.quit();//Cierra todas las ventanas creadas por el webDriver
//    }
//}

//String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "driver" + File.separator;//Tomando path del driver en el sistema
//System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//Establecer la propiedad del .exe
//WebDriver driver = new ChromeDriver();//Inicializando el driver
//driver.get("https://opensource-demo.orangehrmlive.com/");//Iniciar chrome en la URL especificada
//driver.manage().window().maximize();//Maximizar Ventana