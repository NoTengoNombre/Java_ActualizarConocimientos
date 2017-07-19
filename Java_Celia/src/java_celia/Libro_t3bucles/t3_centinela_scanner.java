/**
 * @created on : 18-jul-2017, 0:35:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

import java.util.Scanner;

public class t3_centinela_scanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, suma = 0;

        do {
            System.out.println("Intro un numero ( negativo ) para terminar");
            n = sc.nextInt();
            if (n >= 0) {
                suma = suma + n;
            }
//Señalador / Centinela : 
        } while (n >= 0); // valor del centinela 

        System.out.println("La suma total es : " + suma);
    }

}
