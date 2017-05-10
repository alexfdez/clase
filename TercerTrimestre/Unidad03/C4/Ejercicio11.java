package C4;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		double base = LibLeer.real("Introduce la base del rectángulo: ");
		double altura = LibLeer.real("Introduce la altura del rectángulo: ");
		double area = base * altura;
		
		System.out.println("Área del rectángulo: " + area);
	}
}