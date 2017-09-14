/**
 * @created on : 14-sep-2017, 9:42:04
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.Arrays;

public class JavaArrayMoverPalabraDentroLongitudMaxima {
    
    public static String moverPalabra = "OSO";
    
    public static void moverPalabra(String paParam) {
        
        char[] p = new char[4];
        System.out.println("Longitud total del array : " + Arrays.toString(p));
        
    }
    
    public static void main(String[] args) {
        
        String palabra = "OSO";
        System.out.println("\t     012");
        System.out.println("\t     123456");
        System.out.println("La palabra : " + palabra);
        System.out.println("Longitud de la palabra : " + palabra.length());
        
        char[] contenedorPalabra = new char[palabra.length()];
        
        System.out.println("contenedorPalabra : " + contenedorPalabra.length);
        
        for (int i = 0; i < palabra.length(); i++) {
            contenedorPalabra[i] = palabra.charAt(i);
            System.out.println("\u001b[33mIndice " + i + " contenedorPalabra " + contenedorPalabra[i]);
        }
        
        System.out.println("Espacio dentro de un array que empieza de 0 a 2 -");
        System.out.println(Arrays.toString(contenedorPalabra));
        
        char[] c = new char[4];
        
        System.out.println("-----------------");
        System.out.println("4 Espacios " + (c.length - 4) + " a " + (c.length - 1) + " para una palabra de 3 espacios '0 a 2' ");
        for (int i = 0; i < palabra.length(); i++) {
            c[i + 1] = palabra.charAt(i);
            System.out.println("posicion " + i + " " + c[i] + " ");
        }
        
        System.out.println("\n" + Arrays.toString(c));
        
        System.out.println("Insertar un espacio al array total");
        
        System.out.println();
        
    }
    
}
