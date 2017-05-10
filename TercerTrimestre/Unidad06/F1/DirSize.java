package F1;

import java.io.File;

public class DirSize {
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Error, se necesita un argumento válido");
		}
		else {
			File directorio = new File(args[0]);
			
			if (directorio.isDirectory()) {
				int numeroArchivos = 0;
				double pesoKBytes = 0;
				File[] archivos = directorio.listFiles();
				
				for (int i = 0; i < archivos.length; i++) {
					if (archivos[i].isFile()) {
						numeroArchivos++;
						pesoKBytes += (archivos[i].length() / 1024.0);
					}
				}
				
				System.out.println("Número de archivos: " + numeroArchivos);
				System.out.println("Peso de todos los archivos: " + pesoKBytes + " KBytes");
			}
			else {
				System.out.println("Error, el argumento no es un directorio");
			}
		}
		
	}
	
}