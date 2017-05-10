package C4;

public class Ejercicio15 {
	
	public static long recursivoFactorial(int numero) {
        if (numero <= 1)
            return 1;
        else
            return numero * recursivoFactorial(numero - 1);
    }
}