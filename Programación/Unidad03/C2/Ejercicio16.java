package C2;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int i;
		
		if (args.length == 0) { System.out.println("No se ha introducido ningún argumento"); }
		else {
			
			System.out.println("(1) Los argumentos introducidos son los siguientes: ");
			for (i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
			
			i = 0;
			System.out.println("\n\n(2) Los argumentos introducidos son los siguientes: ");
			while (i < args.length) {
				System.out.print(args[i] + " ");
				i++;
			}
			
			i = 0;
			System.out.println("\n\n(3) Los argumentos introducidos son los siguientes: ");
			do {
				System.out.print(args[i] + " ");
				i++;
			} while (i < args.length);
		}
	}
}