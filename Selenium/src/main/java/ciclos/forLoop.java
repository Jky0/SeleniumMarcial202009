package ciclos;

public class forLoop {

	public static void main(String[] args) {
		int y = 5;
		//Bucle for comienza cuando X=0, X es una variable local dentro del for loop
		for(int x = 0; x <= y; x++) { // Y  corre hasta >= 5 
			System.out.println("Valor de x: " + x);
		}
		
		for(int x= 0; x <= y; x++) {
			System.out.println("valor de X2 es "+ x);
		}
	}
}
