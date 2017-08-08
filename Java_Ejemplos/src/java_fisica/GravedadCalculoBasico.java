/**
 * @created on : 07-ago-2017, 12:07:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_fisica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GravedadCalculoBasico {

    private static final double RADIO = 6370000;
    private static double altura = 100;
    private static double gravedad;

    public static void main(String args[]) throws IOException {
        
        System.out.println("altura : " +altura);
   
        System.out.println("Math.pow(RADIO, 2)) : " + (Math.pow(RADIO, 2)));
        System.out.println("Math.pow((RADIO + altura), 2) : " + Math.pow((RADIO + altura), 2));
        gravedad = (9.8) * ((Math.pow(RADIO, 2)) / (Math.pow((RADIO + altura), 2)));

        System.out.println("Valor : " + gravedad);
    }
}
