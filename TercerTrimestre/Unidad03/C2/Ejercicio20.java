package C2;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int numeroMenor;
		
		if (args.length == 0) { System.out.println("No se ha introducido ningún argumento"); }
		else {
			
			try {
				numeroMenor = Integer.parseInt(args[0]);
				
				for (int i = 1, j = 0; i < args.length; i++) {
					j = Integer.parseInt(args[i]);
					if (j < numeroMenor) { numeroMenor = j; }
				}
				System.out.println("El menor de los números introducidos es: " + numeroMenor);
				
			} catch (NumberFormatException e) {
				System.out.println("/!\\ ERROR: Uno de los argumentos no es un número");
			}
		}
	}
}