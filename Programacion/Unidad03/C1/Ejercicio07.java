package C1;

import B1.LibLeer;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		int nota = LibLeer.entero("Introduce la nota: ");
		
		if (nota >= 5) {
			System.out.println("APTO");
		} else {
			System.out.println("NO APTO");
		}
	}
}