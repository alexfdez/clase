package C1;

public class Ejercicio15 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce un n�mero: ");
		
		if (n > 0) {
			System.out.println("El n�mero es positivo y mayor que 0");
		} else if (n == 0) {
			System.out.println("El n�mero es 0");
		} else {
			System.out.println("El n�mero es negativo");
		}
	}
}