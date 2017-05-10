package C3;

public class Ejercicio09 {
	
    private static int EurosAPesetas(double euros) {
    	return (int) (euros * 166.386);
    }
    
    private static double PesetasAEuros(int pesetas) {
    	return pesetas / 166.386;
    }
}