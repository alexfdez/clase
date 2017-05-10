package C4;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer número, a: ");
		int b = LibLeer.entero("Introduce el segundo número, b: ");
		
		System.out.println( (a >= b) ?
							"a es mayor o igual que b" :
							"a es menor que b" );
	}
}