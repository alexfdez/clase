package C4;

public class Ejercicio11 {
	
	public static void main(String[] args) {
		
		double base = LibLeer.real("Introduce la base del rect�ngulo: ");
		double altura = LibLeer.real("Introduce la altura del rect�ngulo: ");
		double area = base * altura;
		
		System.out.println("�rea del rect�ngulo: " + area);
	}
}