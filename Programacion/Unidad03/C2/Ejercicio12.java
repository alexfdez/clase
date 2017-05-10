package C2;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		int numero = LibLeer.entero("Introduce un número para calcular su factorial: ");
		
		long factorial = 1;
        for (int i = 1; i <= numero; i++) factorial *= i;
        
        System.out.println(numero + "! = " + factorial);
	}
}