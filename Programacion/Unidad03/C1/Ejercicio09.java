package C1;

import B1.LibLeer;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce el n�mero: ");
		
		if (n%2 == 0 && n%5 == 0) {
			System.out.println("El n�mero es m�ltiplo de 2 y de 5");
			
		} else if (n%2 != 0 && n%5 == 0) {
			System.out.println("El n�mero no es m�ltiplo de 2, pero s� de 5");
			
		} else if (n%2 == 0 && n%5 != 0) {
			System.out.println("El n�mero es m�ltiplo de 2, pero no de 5");
			
		} else {
			System.out.println("El n�mero no es m�ltiplo de 2 ni de 5");
		}
	}
}