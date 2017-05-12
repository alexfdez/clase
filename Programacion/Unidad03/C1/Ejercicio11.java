package C1;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		double n1 = LibLeer.real("Introduce el primer real: ");
		double n2 = LibLeer.real("Introduce el segundo real: ");
		double n3 = LibLeer.real("Introduce el tercer real: ");
		
		if (n1 == n2 && n2 == n3) {
			System.out.println("SON IGUALES");
		} else {
			System.out.println("SON DISTINTOS");
		}
	}
}
