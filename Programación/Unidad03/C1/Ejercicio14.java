package C1;

import B1.LibLeer;

public class Ejercicio14 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer n�mero, a: ");
		int b = LibLeer.entero("Introduce el segundo n�mero, b: ");
		
		int cuadB = b*b;
		
		if (a == cuadB) {
			System.out.println("a es el cuadrado de b");
		} else {
			System.out.println("a no es el cuadrado de b");
		}
	}
}