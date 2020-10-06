package herencia;

public class Lados {

	public static void main(String[] args) {
		
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		
		t1.base= 4.0;
		t1.altura= 4.0;
		t1.estilo = "Estilo 1";
		
		System.out.println("Información para T1: ");
		t1.mostrarEstilo();
		t1.mostrarDimension();
		System.out.println("Su area es: " + t1.area());
		

	}

}
