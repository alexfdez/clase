package C1;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce un número: ");
		
		if (n > 0) {
			System.out.println("El número es positivo y mayor que 0");
		} else if (n == 0) {
			System.out.println("El número es 0");
		} else {
			System.out.println("El número es negativo");
		}
	}
}