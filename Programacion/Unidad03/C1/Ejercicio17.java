package C1;

public class Ejercicio17 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer n�mero, a: ");
		int b = LibLeer.entero("introduce el segundo n�mero, b: ");
		
		if ( a > 0 || (a > 0 && b > 0) ) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
	}
}