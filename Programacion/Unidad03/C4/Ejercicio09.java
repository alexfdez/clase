package C4;

public class Ejercicio09 {
	
	public static void main(String[] args) {
		
		long suma = 0;
		
		int n = LibLeer.entero("Introduce un n�mero entero: ");
		
		for (int i = n+1; i <= n+100; i++) {
			suma += i*i;
		}
		
		System.out.println("Resultado de sumar los cuadrados de los 100 n�meros posteriores al introducido: " + suma);
	}
}