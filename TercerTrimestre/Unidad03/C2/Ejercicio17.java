package C2;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int i = 0;
		
		if (args.length == 0) { System.out.println("No se ha introducido ning�n argumento"); }
		else {
			
			System.out.println("Argumentos introducidos pasados a may�scula: ");
			while (i < args.length) {
					System.out.print(args[i].toUpperCase() + " ");
					i++;
			}
		}
	}
}