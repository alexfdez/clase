package E1;

import java.util.Random;

public class Ejercicio04 {
	
	public static void imprimirFila(int[] fila) {
		
		System.out.print("[" + fila[0]);
		
		for (int i = 1; i < fila.length; i++) {
			System.out.print(", " + fila[i]);
		}
		
		System.out.print("]");
	}
	
	
	public static void imprimirMatriz(int[][] matriz) {
		
		for (int i = 0; i < matriz.length; i++) {
			imprimirFila(matriz[i]);
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int[][] matriz = new int[5][5];
		
		for (int i = 0, j = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(100);
			}
		}
		
		imprimirMatriz(matriz);
	}
	
}