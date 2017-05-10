package B1;

import C1.LibLeer;

public class Ejercicios {
	
	private static final double PI = 3.1416;
	
	public static void main(String[] args) {
		
		// Ejercicio 1
		System.out.println("Hola, ya se imprimir frases");
		
		
		// Ejercicio 2
		int numeroEntero = 597;
		System.out.println(numeroEntero);
		
		
		// Ejercicio 3
		double numeroDecimal = 7.5;
		System.out.println(numeroDecimal);
		
		
		// Ejercicio 4
		int suma = 1234+532;
		System.out.println(suma);
		
		
		// Ejercicio 5
		int resta = 1234-532;
		System.out.println(resta);
		
		
		// Ejercicio 6
		int multiplicacion = 1234*532;
		System.out.println(multiplicacion);
		
		
		// Ejercicio 7
		double division = 1234/532;
		System.out.println(division);
		
		
		// Ejercicio 8
		/* public class Cuadrado {
		 *     public static void main(String[] args) {
		 *         int numero = 2; 					// 1 fallo corregido
		 *         int cuadrado = numero*numero;	// 2 fallos corregidos
		 *         System.out.println("El cuadrado de " + numero + " es: " + cuad);
		 *     }
		 * }
		 * 
		 */
		
		
		// Ejercicio 9
		/* a. float
		 * b. byte
		 * c. byte
		 * d. String o char
		 * e. String o char
		 * f. int
		 * g. String
		 * 
		 */
		
		
		// Ejercicio 10
		/* a. Verdadero.
		 * b. Falso, el programa sólo puede constar de un método main principal.
		 * c. Falso, los métodos pueden devolver valores.
		 * 
		 */
		
		
		// Ejercicio 11
		int a = 0;
		int b = 1;
		int extra;
		
		extra = a;	// 'extra' pasa a valer 0
		a = b;		// 'a' pasa a valer 1
		b = extra;	// 'b' pasa a valer 0
		
		
		// Ejercicio 12
		int pesetas = LibLeer.entero("\nIntroduce las pesetas para convertirlas a euros: ");
		double euros = pesetas / 166.386;
		System.out.println(pesetas + " pesetas son " + euros + "€");
		
		
		// Ejercicio 13
		int numero1 = LibLeer.entero("\nIntroduce un número: ");
		int numero2 = LibLeer.entero("Introduce otro número: ");
		int cociente = numero1 / numero2;
		int resto = numero1 % numero2;
		
		System.out.println("El cociente de la división entre los dos números es " + cociente + " y el resto es " + resto);
		
		
		// Ejercicio 14
		int segundos = LibLeer.entero("\nIntroduce los segundos para pasarlos a formato hh:mm:ss : ");
		int hora = 0, minutos = 0;
		
		if (segundos < 0) {
			segundos = 0;
	    } else if (segundos >= 60) {
			minutos = segundos / 60;
			segundos %= 60;
		}
		
		if (minutos >= 60) {
			hora = minutos / 60;
			minutos %= 60;
		}
		
		if (hora >= 24) {
			hora %= 24;
		}
		
		System.out.println("Hora: " + hora + ":" + minutos + "." + segundos);
		
		
		// Ejercicio 16
		int kmHora = LibLeer.entero("\nIntroduce los km/h: ");
		double mSg = (kmHora / 3600) * 1000;
		
		System.out.println(kmHora + "km/h es igual a " + mSg + "m/sg");
		
		
		// Ejercicio 17
		int num1 = LibLeer.entero("\nIntroduce el primer número: ");
		int num2 = LibLeer.entero("\nIntroduce el segundo número: ");
		int num3 = LibLeer.entero("\nIntroduce el tercer número: ");
		double media = (num1 + num2 + num3) / 3.0;
		
		System.out.println("La media de los tres números es: " + media);
		
		
		// Ejercicio 18
		double precioProducto = LibLeer.real("\nIntroduce el precio del producto sin IVA: ");
		int numProductos = LibLeer.entero("Introduce el número de productos vendidos: ");
		double iva = LibLeer.real("Introduce (en %) el IVA del producto: ");
		double precioVenta = (precioProducto * (1 + iva/100)) * numProductos;
		
		System.out.println("El precio de venta total es: " + precioVenta + "€");
		
		
		// Ejercicio 19
		double n = LibLeer.real("\nIntroduce un número: ");
		System.out.println("El doble del número es " + (2*n) + " y el triple es " + (3*n));
		
		
		// Ejercicio 20
		int baseT = LibLeer.entero("\nIntroduce la base del triángulo: ");
		int alturaT = LibLeer.entero("Introduce la altura del triángulo: ");
		double areaT = (baseT * alturaT) / 2.0;
		
		System.out.println("El área del triángulo es: " + areaT);
		
		
		// Ejercicio 21
		int radioC = LibLeer.entero("\nIntroduce el radio del círculo: ");
		double longC = 2 * PI * radioC;
		double areaC = PI * radioC * radioC;
		
		System.out.println("La longitud del círculo es " + longC + " y el área es " + areaC);
		
		
		// Ejercicio 22
		double cateto1 = LibLeer.real("\nIntroduce el primer cateto: ");
		double cateto2 = LibLeer.real("Introduce el segundo cateto: ");
		double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
	}
}