package C1;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		int n1 = LibLeer.entero("Introduce el primer número: ");
		int n2 = LibLeer.entero("Introduce el segundo número: ");
		int n3 = LibLeer.entero("Introduce el tercer número: ");
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
		
		System.out.println("El máximo es " + n3 + " y el mínimo es " + n1);
	}
}