package C1;

import B1.LibLeer;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce el número: ");
		
		if (n%2 == 0 && n%5 == 0) {
			System.out.println("El número es múltiplo de 2 y de 5");
			
		} else if (n%2 != 0 && n%5 == 0) {
			System.out.println("El número no es múltiplo de 2, pero sí de 5");
			
		} else if (n%2 == 0 && n%5 != 0) {
			System.out.println("El número es múltiplo de 2, pero no de 5");
			
		} else {
			System.out.println("El número no es múltiplo de 2 ni de 5");
		}
	}
}