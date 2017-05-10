package C1;

import B1.LibLeer;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		double n = LibLeer.real("Introduce un número real: ");
		while (n < 0) {
			n = LibLeer.real("Que sea positivo el número, por favor: ");
		}
		
		double raizN = Math.sqrt(n);
		
		System.out.println("La raíz cuadrada de " + n + " es: " + raizN);
	}
}
