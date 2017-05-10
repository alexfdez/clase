package C2;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer número, a: ");
		int b = LibLeer.entero("Introduce el segundo número, b: ");
		int extra;
		
		if (a > b) {
			extra = a;
			a = b;
			b = extra;
		}
		
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
}