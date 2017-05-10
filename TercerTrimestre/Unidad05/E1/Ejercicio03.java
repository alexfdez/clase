package E1;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		int[] lista = new int[10];
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = LibLeer.entero("Introduce un número entero: ");
		}
		
		System.out.println("\nMostrando la lista de números en orden inverso: ");
		for (int i = lista.length-1; i >= 0; i--) {
			System.out.print(lista[i] + " ");
		}
		
	}

}