package C4;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Creamos array donde guardar los 3 números
		int[] listaNumeros = new int[3];
		
		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = LibLeer.entero("Introduce el entero #" + (i+1) + ": " );
		}
		
		
		// Leemos el array y vamos asignando el menor y el mayor
		if (listaNumeros.length > 0) {
			int numeroMayor = listaNumeros[0];
			int numeroMenor = listaNumeros[0];
			
			for (int i = 1; i < listaNumeros.length; i++) {
				if (listaNumeros[i] < numeroMenor) { numeroMenor = listaNumeros[i]; }
				if (listaNumeros[i] > numeroMayor) { numeroMayor = listaNumeros[i]; }
			}
			System.out.println("\nNúmero mayor: " + numeroMayor + "\nNúmero menor: " + numeroMenor);
			
		} else {
			System.out.println("La lista de números no tiene un tamaño superior a 0");
		}
	}
}