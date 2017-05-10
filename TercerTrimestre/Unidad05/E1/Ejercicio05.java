package E1;

import java.util.Random;

public class Ejercicio05 {
	
	// Orden creciente, genera una lista nueva
	public static int[] ordenarLista(int[] lista) {
		int[] listaOrdenada = lista.clone();
		int aux = 0;
		
		for (int i = lista.length-1, j; i > 0; i--) {
			for (j = i; j >= 0; j--) {
				if ( listaOrdenada[i] < listaOrdenada[j] ) {
					aux = listaOrdenada[j];
					listaOrdenada[j] = listaOrdenada[i];
					listaOrdenada[i] = aux;
				}
			}
		}
		
		return listaOrdenada;
	}
	
	
	public static void imprimirLista(int[] lista) {
		
		System.out.print("[" + lista[0]);
		
		for (int i = 1; i < lista.length; i++) {
			System.out.print(", " + lista[i]);
		}
		
		System.out.print("]");
	}
	
	
	public static void main(String[] args) {
		
		int[] lista = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = rand.nextInt(100);
		}
		
		
		imprimirLista(ordenarLista(lista));
	}

}