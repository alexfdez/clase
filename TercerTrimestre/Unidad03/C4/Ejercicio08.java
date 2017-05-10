package C4;

public class Ejercicio08 {
	
	public static void main(String[] args) {
		
		long suma = 0;
		
		for (int i = 1; i <= 100; i++) {
			suma += i*i;
		}
		
		System.out.println("Resultado de sumar los cuadrados de los 100 primeros números naturales: " + suma);
	}
}