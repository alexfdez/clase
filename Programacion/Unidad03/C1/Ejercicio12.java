package C1;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer n�mero, a: ");
		int b = LibLeer.entero("Introduce el segundo n�mero, b: ");
		int c = LibLeer.entero("Introduce el segundo n�mero, c: ");
		int ab = a+b;
		
		if (ab >= c) {
			System.out.println("a + b >= c");
		} else {
			System.out.println("a + b < c");
		}
	}
}
