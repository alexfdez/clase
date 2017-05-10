package F1;

import java.io.File;

public class ListFileSystem {
	
	public static void main(String[] args) {
		
		System.out.println("Separador de direcciones: " + File.pathSeparator);
		System.out.println("Separador de directorios: " + File.separator);
		System.out.println("Directorios raíces del sistema: ");
		
		File[] raices = File.listRoots();
		
		for (int i = 0; i < raices.length; i++) {
			System.out.println(raices[i]);
		}
		
	}
	
}