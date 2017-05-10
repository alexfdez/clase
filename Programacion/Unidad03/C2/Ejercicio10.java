package C2;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("\n### Tabla de multiplicar del " + i + " ###");
			
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
}