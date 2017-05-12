package C1;

public class Ejercicio06 {
	
	public static void main(String[] args) {
		
		char letra = LibLeer.caracter("Introduce una letra, sin símbolos ni acentos: ");
		
		switch (letra) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("La letra es una vocal"); break;
			default :
				System.out.println("La letra es una consonante"); break;
		}
	}
}