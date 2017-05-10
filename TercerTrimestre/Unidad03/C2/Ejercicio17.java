package C2;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int i = 0;
		
		if (args.length == 0) { System.out.println("No se ha introducido ningún argumento"); }
		else {
			
			System.out.println("Argumentos introducidos pasados a mayúscula: ");
			while (i < args.length) {
					System.out.print(args[i].toUpperCase() + " ");
					i++;
			}
		}
	}
}