package C2;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		if (args.length == 0) { System.out.println("No se ha introducido ning�n argumento"); }
		else {
			
			System.out.println("Argumentos introducidos pasados a min�scula: ");
			for (int i = 0; i < args.length; i++) {
					System.out.print(args[i].toLowerCase() + " ");
			}
		}
	}
}