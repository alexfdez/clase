package C4;

public class Ejercicio17 {
	
	public static boolean esNumeroPrimo(int numero) {
        boolean esPrimo = true;
        
        if      ( (numero % 2 != 0) && (numero > 2) ) {
        // La condición se cumple si el número
        // no es múltiplo de 2 y si es mayor o igual que 2
        	
            for (int i = 3; (i*i <= numero) && (esPrimo == true); i += 2)
                if (numero % i == 0) { esPrimo = false; }
        }
        else if (numero != 2) { esPrimo = false; }
        // El resto de números que son múltiplos de 2
        // no son primos, incluyendo mayores o menores que 2 y
        // todos los negativos, excepto el propio 2
        
        return esPrimo;
    }
	
	public static void main(String[] args) {
		
		// El bucle anidado se forma por este principal y
		// el que se encuentra en la función
		
		System.out.println("Números primos menores a 200: ");
		for (int i = 0; i < 200; i++) {
			if (esNumeroPrimo(i)) {
				System.out.print(i + " ");
			}
		}
		
	}
}