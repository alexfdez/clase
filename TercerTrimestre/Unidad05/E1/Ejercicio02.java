package E1;

public class Ejercicio02 {
	
	
	public static void main(String[] args) {
		
		double[][] matriz = new double[10][5];
		
		for (int i = 0, j = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println("");
		}
		
	}

}