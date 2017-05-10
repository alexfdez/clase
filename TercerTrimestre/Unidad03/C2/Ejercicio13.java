package C2;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		int suma = 0;
		
		if (args.length == 0) { System.out.println("No se ha introducido ning�n argumento"); }
		else {
			
			try {
				
				for (int i = 0; i < args.length; i++) {
					suma = Integer.parseInt(args[i]);
				}
				System.out.println("La suma de los argumentos introducidos es: " + suma);
				
			} catch (NumberFormatException e) {
				System.out.println("/!\\ ERROR: Uno de los argumentos no es un n�mero");
			}
		}
	}
}