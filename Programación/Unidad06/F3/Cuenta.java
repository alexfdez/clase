package F3;

import java.io.*;

public class Cuenta {
	
	public static void main(String[] args) {
		
		if (args.length == 1) {
			try {
				File archivoOriginal = new File(args[0]);
				
				FileReader archivoR = new FileReader(archivoOriginal);
				BufferedReader bufferR = new BufferedReader(archivoR);
					
				String linea = bufferR.readLine();
				char[] caracteres;
				int contEspacios = 0;
				int contLetras = 0;
				int contPalabras = 0;
				
				while (linea != null) {
					caracteres = linea.toCharArray();
					
					for (int i = 0; i < caracteres.length; i++) {
						if (caracteres[i] != ' ') {
							contLetras++;
							contEspacios = 0;
						}
						else if (caracteres[i] == ' ') {
							if (contEspacios == 0 && contLetras > 0) {
								contPalabras++;
							}
							
							contEspacios++;
							contLetras = 0;
						}
					}
					
					if (contLetras > 0) {
						contPalabras++;
					}
					
					linea = bufferR.readLine();
				}
					
				bufferR.close();
					
				System.out.println("El archivo " + archivoOriginal.getName() + " contiene " + contPalabras + " palabras");
				
			} catch (FileNotFoundException fnf) {
				System.out.println(fnf.getMessage());
			} catch (IOException io) {
				System.out.println(io.getMessage());
			}
		}
		else {
			System.out.println("Los argumentos no son válidos, se necesita un argumento (ruta absoluta del archivo)");
		}
	}
	
}