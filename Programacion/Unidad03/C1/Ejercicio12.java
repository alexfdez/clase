package C1;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer número, a: ");
		int b = LibLeer.entero("Introduce el segundo número, b: ");
		int c = LibLeer.entero("Introduce el segundo número, c: ");
		int ab = a+b;
		
		if (ab >= c) {
			System.out.println("a + b >= c");
		} else {
			System.out.println("a + b < c");
		}
	}
}
