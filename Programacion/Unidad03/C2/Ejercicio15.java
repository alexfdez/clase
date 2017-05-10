package C2;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		if (args.length == 0) { System.out.println("No se ha introducido ning�n argumento"); }
		else if (args.length > 1) { System.out.println("Introduce un s�lo argumento y que sea un n�mero entero"); }
		else {
			try {
				int numero = Integer.parseInt(args[0]);
				
				System.out.println("### TABLA DE MULTIPLICAR DEL " + numero +" ###");
				for (int i = 1; i <= 10; i++) {
					System.out.println(numero + " * " + i + " = " + (numero*i));
				}
				
			} catch (NumberFormatException e) {
				System.out.println("/!\\ ERROR: El argumento introducido no es un n�mero");
			}
		}
	}
}