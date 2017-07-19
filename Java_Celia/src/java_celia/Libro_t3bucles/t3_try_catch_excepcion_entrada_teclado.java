/**
 * @created on : 17-jul-2017, 21:24:33
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class t3_try_catch_excepcion_entrada_teclado {

    public static void main(String[] args) {

//        Clase           obj   inst  Constructor      Clase.propiedad
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int s1, s2, suma;

        try {
            System.out.println("Sumando 1: ");
            s1 = Integer.parseInt(br.readLine());

            System.out.println("Sumando 2: ");

            s2 = Integer.parseInt(br.readLine());

        } catch (IOException | NumberFormatException e) {
            System.out.println("Se ha producido un error "
                    + "- Asegurate de haber introducido 2 numeros : ");
            System.out.println(" • " + e.getLocalizedMessage() + " ♠ " + e.getMessage());
            s1 = 0;
            s2 = 0;
        }
        suma = s1 + s2;
        System.out.println("La suma es : " + s1 + " + " + s2 + " = " + suma);
    }
}
