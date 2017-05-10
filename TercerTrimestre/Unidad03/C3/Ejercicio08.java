package C3;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		switch (args.length) {
			case 0 : System.out.println("Se han introducido 0 argumentos"); break;
			case 1 : System.out.println("Se ha introducido 1 argumento"); break;
			case 2 : System.out.println("Se han introducido 2 argumentos"); break;
			case 3 : System.out.println("Se han introducido 3 argumentos"); break;
			default: System.out.println("Se han introducido más de 3 argumentos"); break;
		}
	}
}