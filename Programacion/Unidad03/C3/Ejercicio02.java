package C3;

public class Ejercicio02 {
	
    private static long factorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) factorial *= i;
        
        return factorial;
    }
    
    
    public static void main(String[] args) {
    	
    	for (int i = 1; i <= 8; i++) {
    		System.out.println("El factorial de " + i + " es " + factorial(i));
    	}
    }
}