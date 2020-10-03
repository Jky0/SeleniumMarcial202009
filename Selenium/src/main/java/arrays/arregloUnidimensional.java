package arrays;

public class arregloUnidimensional {

	public static void main(String[] args) {
		
		//Son declaraciones validas
		int intArray[];
		int[] intArray2;

		//tipos de datos
		byte arraybyte[];
		short shortarray[];
		char chararray[];
		
		//declarar array de strings
		String[] arr;
		
		//Asiganr memoria para 5 strings
		arr = new String[5];
		
		
		//Iniciar el primer elemento.
		arr[0]= "cero";
		arr[1]= "uno";
		arr[2]= "dos";
		arr[3]= "tres";
		arr[4]= "cuatro";
		
		//Accediendo a los elementos del array
		
		for (int i =0; i < arr.length; i++) {
			System.out.println("Elemento en el indice " + i + " : " + arr[i]);
		}
		
		// Ejercico por mi cuenta
		
		String[] arreglo2;
		arreglo2 = new String[5];
		
		arreglo2[0] = "rojo";
		arreglo2[1] = "verde";
		arreglo2[2] = "azul";
		arreglo2[3] = "amarillo";
		arreglo2[4] = "morado";
		
		for (int i = 0; i < arreglo2.length; i++ ) {
			System.out.println("Los colores del arreglo son "+ i + " " + arreglo2[i]);
			
		}
		
		// forma simple de declarar un array
		
		String[] sArray = new String[] {"cero","uno"};
		for(int i = 0; i < sArray.length; i++) {
			System.out.println("Elemento en el indice " + i + " : " + sArray[i]);
		}
 		
		// ejemplo de un Array de tipo int
		int[] intArrayunalinea = new int[] {1,2,3,4};
		for(int i = 0; i < intArrayunalinea.length; i++) {
			System.out.println("El arreglo unidimensional de int es: " + i + " : " + intArrayunalinea[i]);
		}
		
		
	}

}
