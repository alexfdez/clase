package C2;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		int a = LibLeer.entero("Introduce el primer n�mero, a: ");
		int b = LibLeer.entero("Introduce el segundo n�mero, b: ");
		int resultado = a;
		
		if (b == 0) {
			resultado = 0;
		}
		
		for (int i = 2; i <= b; i++) {
			resultado += a;
		}
		
		System.out.println("El resultado de la multiplicaci�n mediante sumas sucesivas es: " + resultado);
	}
}