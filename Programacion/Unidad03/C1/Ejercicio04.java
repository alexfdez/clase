package C1;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		
		int n1 = LibLeer.entero("Introduce el primer número: ");
		int n2 = LibLeer.entero("Introduce el segundo número: ");
		int n3 = LibLeer.entero("Introduce el tercer número: ");
		int n4 = LibLeer.entero("Introduce el cuarto número: ");
		int n5 = LibLeer.entero("Introduce el quinto número: ");
		double media = (n1+n2+n3+n4+n5) / 5.0;
		
		System.out.println("\nEstos son los números mayores que la media: ");
		
		if (n1 > media) {
			System.out.println(n1);
		}
		
		if (n2 > media) {
			System.out.println(n2);
		}
		
		if (n3 > media) {
			System.out.println(n3);
		}
		
		if (n4 > media) {
			System.out.println(n4);
		}
		
		if (n5 > media) {
			System.out.println(n5);
		}
	}
}