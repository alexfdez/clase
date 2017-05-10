package F3;

import java.io.*;

public class copyFile {
	
	public static void main(String[] args) {
		
		if (args.length == 2) {
			try {
				File archivoOriginal = new File(args[0]);
				File ruta = new File(args[1]);
				File rutaFinalCopia = new File(ruta.getAbsolutePath() + File.separator + archivoOriginal.getName());
				
				if (!rutaFinalCopia.exists()) {
					FileReader archivoR = new FileReader(archivoOriginal);
					BufferedReader bufferR = new BufferedReader(archivoR);
					
					FileWriter archivoW = new FileWriter(rutaFinalCopia);
					BufferedWriter bufferW = new BufferedWriter(archivoW);
					
					String cadena = bufferR.readLine();
					
					while (cadena != null) {
						bufferW.write(cadena);
						bufferW.newLine();
						cadena = bufferR.readLine();
					}
					
					bufferW.flush();
					
					bufferR.close();
					bufferW.close();
					
					System.out.println("Escritura completada del archivo " + archivoOriginal.getName() + " al directorio " + ruta.getAbsolutePath());
				}
				else {
					System.out.println("El archivo ya existe");
				}
				
			} catch (FileNotFoundException fnf) {
				System.out.println(fnf.getMessage());
			} catch (IOException io) {
				System.out.println(io.getMessage());
			}
		}
		else {
			System.out.println("Los argumentos no son válidos, se necesitan 2 argumentos\n(#1: ruta absoluta del archivo, #2: directorio donde se guardará el archivo)");
		}
	}
	
}