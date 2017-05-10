package C4;

public class Ejercicio10 {
	
	private static final double DOLARESPOREURO = 1.06425;
	
	public static void main(String[] args) {
		
		double euros = LibLeer.real("Introduce la cantidad en euros para convertirla en dólares: ");
		double conversion = euros * DOLARESPOREURO;
		
		System.out.println(euros + " euros equivale a " + conversion + " dólares");
	}
}