package F3;

import java.io.*;

public class guardarText {
	
	public static void main(String[] args) {
		
		if (args.length == 1) {
			try {
				File nuevoArchivo = new File("Nuevo archivo");
				File ruta = new File(args[0]);
				File rutaFinal = new File(ruta.getAbsolutePath() + File.separator + nuevoArchivo.getName());
				
				FileWriter archivoW = new FileWriter(rutaFinal);
				BufferedWriter bufferW = new BufferedWriter(archivoW);
					
				String cadena = LibLeer.cadena("Nueva línea: ");
					
				while (!cadena.isEmpty()) {
					bufferW.write(cadena);
					bufferW.newLine();
					cadena = LibLeer.cadena("Nueva línea: ");
				}
					
				bufferW.flush();
				bufferW.close();
					
				System.out.println("Escritura completada en directorio:\n" + rutaFinal.getAbsolutePath());
				
			} catch (FileNotFoundException fnf) {
				System.out.println("La ruta no existe, pruebe una nueva ruta que exista");
			} catch (IOException io) {
				System.out.println(io.getMessage());
			}
		}
		else {
			System.out.println("Los argumentos no son válidos, se necesita 1 argumento\n(directorio donde se guardará el archivo de texto)");
		}
	}
	
}