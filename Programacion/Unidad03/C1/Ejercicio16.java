package C1;

public class Ejercicio16 {
	
	public static void main(String[] args) {
		
		int n1 = LibLeer.entero("Introduce el primer número: ");
		int n2 = LibLeer.entero("introduce el segundo número: ");
		int suma = n1 + n2;
		
		if (suma > 0) {
			System.out.println("La suma es positiva y mayor que 0");
		} else if (suma == 0) {
			System.out.println("La suma es 0");
		} else {
			System.out.println("La suma es negativa");
		}
	}
}