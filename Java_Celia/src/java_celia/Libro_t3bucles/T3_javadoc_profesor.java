/**
 * @created on : 18-jul-2017, 10:56:45
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 *
 * Escribir un algoritmo que sume todos los números naturales de n hasta m,
 * siendo n y m números recibidos como parámetros.
 *
 * Devuelve la suma si todo ha ido bien o ­1 en caso de error
 */
package java_celia.Libro_t3bucles;

public class T3_javadoc_profesor {

    /**
     * Suma todos los numeros naturales entre 1 y 1000.
     * 
     * @version: 1.0
     * @author: Raul Vela Salas
     * @param n int numero inicial de la secuencia
     * @param m int numero final de la secuencia
     * @return suma int : la suma de todo , -1 en caso de fallo
     */
    public static int sumarNumeros(int n, int m) {
        int i;
        int suma; // variable acumulador
        if (n <= m) { // comprobamos los limites
            suma = 0;
            for (i = n; i <= m; i++) {
                suma = suma + i;
            }
        } else { // si n = m , tenemos un error
            suma = -1; // en caso de error , devolvemos -1
        }
        return suma;
    }

    
    public static void main(String[] args) {
        int sumar = sumarNumeros(1, 100);
        System.out.println(" " + sumar);
    }
    
    
}
