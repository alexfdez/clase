package C1;

public class Ejercicio05 {
	
	public static void main(String[] args) {
		
		int n = LibLeer.entero("Introduce el n�mero: ");
		
		switch (n) {
			case 1 : System.out.println("El mes tiene 31 d�as"); break;
			case 2 : System.out.println("El mes tiene 28 d�as"); break;
			case 3 : System.out.println("El mes tiene 31 d�as"); break;
			case 4 : System.out.println("El mes tiene 30 d�as"); break;
			case 5 : System.out.println("El mes tiene 31 d�as"); break;
			case 6 : System.out.println("El mes tiene 30 d�as"); break;
			case 7 : System.out.println("El mes tiene 31 d�as"); break;
			case 8 : System.out.println("El mes tiene 31 d�as"); break;
			case 9 : System.out.println("El mes tiene 30 d�as"); break;
			case 10 : System.out.println("El mes tiene 31 d�as"); break;
			case 11 : System.out.println("El mes tiene 30 d�as"); break;
			case 12 : System.out.println("El mes tiene 31 d�as"); break;
			default : System.out.println("Este mes no existe"); break;
		}
	}
}