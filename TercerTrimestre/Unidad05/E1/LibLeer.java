package E1;

import java.util.Scanner;

/**
 * Su función es leer por teclado un valor en concreto para después devolverlo.
 */
public class LibLeer {
    
    /**
     * Pregunta por pantalla que introduzcas tal caracter por teclado y
     * devuelve ese mismo caracter.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return caracter - El caracter introducido
     */
    public static char caracter(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        char    caracter;
        
        System.out.print(mensaje);
        cadena = teclado.nextLine();
        caracter = cadena.charAt(0);
        
        teclado.close();
        
        return caracter;
    }
    
    
    /**
     * Pregunta por pantalla que introduzcas tal string por teclado y
     * devuelve ese mismo string.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return cadena - El string introducido
     */
    public static String cadena(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        
        System.out.print(mensaje);
        cadena = teclado.nextLine();
        
        teclado.close();
        
        return cadena;
    }
    
    
    /**
     * Pregunta por pantalla que introduzcas tal entero por teclado y
     * devuelve ese mismo entero.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return entero - El entero introducido
     */
    public static int entero(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        int     entero = 0;
        boolean noEsEntero = true;
        
        while (noEsEntero)
        {
            try {
                System.out.print(mensaje);
                cadena = teclado.nextLine();
                entero = Integer.parseInt(cadena);
                noEsEntero = false;
                
            } catch (NumberFormatException e) {
                System.out.println("/!\\ ERROR: Tipo inválido, ha de ser un entero");
            }
        }
        
        teclado.close();
        
        return entero;
    }
    
    
    /**
     * Pregunta por pantalla que introduzcas tal entero grande por teclado y
     * devuelve ese mismo entero grande.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return nLong - El entero grande introducido
     */
    public static long longg(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        long    nLong = 0;
        boolean noEsLong = true;
        
        while (noEsLong)
        {
            try {
                System.out.print(mensaje);
                cadena = teclado.nextLine();
                nLong = Long.parseLong(cadena);
                noEsLong = false;
                
            } catch (NumberFormatException e) {
                System.out.println("/!\\ ERROR: Tipo inválido, ha de ser un entero");
            }
        }
        
        teclado.close();
        
        return nLong;
    }
    
    
    /**
     * Pregunta por pantalla que introduzcas tal número real por teclado y
     * devuelve ese mismo número real.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return numero - El número decimal (float) introducido
     */
    public static float floatt(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        float   numero = 0;
        boolean noEsFloat = true;
        
        while (noEsFloat)
        {
            try {
                System.out.print(mensaje);
                cadena = teclado.nextLine();
                numero = Float.parseFloat(cadena);
                noEsFloat = false;
                
            } catch (NumberFormatException e) {
                System.out.println("/!\\ ERROR: Tipo inválido, ha de ser un float");
            }
        }
        
        teclado.close();
        
        return numero;
    }
    
    
    /**
     * Pregunta por pantalla que introduzcas tal número real por teclado y
     * devuelve ese mismo número real.
     * 
     * @param mensaje Mensaje que aparece en pantalla antes de introducir el valor
     * @return real - El número decimal (double) introducido
     */
    public static double real(String mensaje) {
        Scanner teclado = new Scanner(System.in);
        String  cadena;
        double  real = 0;
        boolean noEsReal = true;
        
        while (noEsReal)
        {
            try {
                System.out.print(mensaje);
                cadena = teclado.nextLine();
                real = Double.parseDouble(cadena);
                noEsReal = false;
                
            } catch (NumberFormatException e) {
                System.out.println("/!\\ ERROR: Tipo inválido, ha de ser un real");
            }
        }
        
        teclado.close();
        
        return real;
    }
}