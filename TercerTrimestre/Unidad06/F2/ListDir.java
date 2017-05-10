package F2;

import java.io.File;

public class ListDir {
	
	public static void mostrarArchivos(File directorio) {
		if (directorio.isDirectory()) {
			
			File[] archivos = directorio.listFiles();
			
			for (int i = 0; i < archivos.length; i++) {
				if (archivos[i].isFile()) {
					System.out.println(archivos[i].getName());
				}
				else if (archivos[i].isDirectory()) {
					mostrarArchivos(archivos[i]);
				}
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("Error, se necesita un argumento válido");
		}
		else {
			File directorio = new File(args[0]);
			
			System.out.println("Mostrando archivos del directorio " + directorio.getAbsolutePath() + " y archivos de sus subdirectorios:");
			mostrarArchivos(directorio);
		}
	}
	
}