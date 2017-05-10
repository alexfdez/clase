package C2;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		if (args.length == 0) { System.out.println("No se ha introducido ningún argumento"); }
		else {
			
			System.out.println("Los argumentos introducidos son los siguientes: ");
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i] + " ");
			}
		}
	}
}