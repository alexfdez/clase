package C1;

import B1.LibLeer;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		int n1 = LibLeer.entero("Introduce el primer n�mero: ");
		int n2 = LibLeer.entero("Introduce el segundo n�mero: ");
		int n3 = LibLeer.entero("Introduce el tercer n�mero: ");
		int extra;
		
		if (n2 > n3) {
			extra = n2;
			n2 = n3;
			n3 = extra;
		}
		
		if (n1 > n3) {
			extra = n1;
			n1 = n3;
			n3 = extra;
		}
		
		if (n1 > n2) {
			extra = n1;
			n1 = n2;
			n2 = extra;
		}
		
		System.out.println("Ordenados: " + n1 + ", " + n2 + ", " + n3);
	}
}
