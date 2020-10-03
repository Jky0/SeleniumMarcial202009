package arrays;

public class arrayMulti {

	public static void main(String[] args) {
		
		//declarar e inicializar un array de dos dimensiones
		
		int arr[][] = {{2,3,4},{5,6,7},{8,9,0}};
		
		//La primera posicion es el Array y la segunda es la posicion dentro del array
		System.out.println(arr[2][1]);
		
		
		
		for(int i = 0; i < 3; i++) {
			for( int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " ");
				
			}
			System.out.println();
		}
		
	}

}
