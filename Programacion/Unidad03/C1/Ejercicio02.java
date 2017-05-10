package C1;

import B1.LibLeer;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		
		int nota = LibLeer.entero("Introduce la nota: ");
		int edad = LibLeer.entero("Introduce la edad: ");
		char sexo = LibLeer.caracter("Introduce el sexo (V/M): ");
		
		if (nota >= 5 && edad >= 18 && sexo == 'M') {
			System.out.println("ACEPTADA");
			
		} else if (nota >= 5 && edad >= 18 && sexo == 'V') {
			System.out.println("POSIBLE");
		}
	}
}
