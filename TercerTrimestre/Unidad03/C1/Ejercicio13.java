package C1;

import B1.LibLeer;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		double n = LibLeer.real("Introduce un n�mero real: ");
		while (n < 0) {
			n = LibLeer.real("Que sea positivo el n�mero, por favor: ");
		}
		
		double raizN = Math.sqrt(n);
		
		System.out.println("La ra�z cuadrada de " + n + " es: " + raizN);
	}
}
