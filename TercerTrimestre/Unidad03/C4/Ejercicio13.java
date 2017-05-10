package C4;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce un número: ");
		
		System.out.println("Números impares menores a él (hasta 0): ");
		for (int i = n; i > 0; i--) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
}