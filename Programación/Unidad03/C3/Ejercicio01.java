package C3;

public class Ejercicio01 {
	
	private static long factorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) factorial *= i;
        
        return factorial;
    }
}