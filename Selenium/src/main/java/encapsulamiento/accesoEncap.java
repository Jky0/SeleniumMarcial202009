package encapsulamiento;

public class accesoEncap {

	public static void main(String[] args) {
		
		encap encapsulado = new encap();
		
		encapsulado.setTipo(5);
		
		System.out.println("El tipo contiene: " + encapsulado.getTipo());
		
//		encapsulado.tipo = 5;  
		

	}

}
