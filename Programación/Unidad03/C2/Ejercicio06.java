package C2;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer n�mero, a: ");
		int b = LibLeer.entero("Introduce el segundo n�mero, b: ");
		
		if (a > b) {
			System.out.println("ERROR, a es mayor que b");
		} else {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}
	}
}