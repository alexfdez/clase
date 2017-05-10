package C4;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		long factorial = 1;
        for (int i = 1; i <= 20; i++) factorial *= i;
        
        System.out.println("20! = " + factorial);
	}
}