/**
 * @created on : 11-ago-2017, 21:11:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaAlmacenarElementoArrayString {

    private static Scanner SC = new Scanner(System.in);
    private static int num;

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

//                     0  1  2  3  4  5  6  7  8  9
        int[] datos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println("Longitud : " + datos.length);

        System.out.println("Introduce el " + datos[0] + " : ");
        if (datos[0] == (num = Integer.parseInt(br.readLine()))) {
            System.out.println(datos[0]);
        }
        System.out.println("Introduce el " + datos[0] + "" + datos[1]);
        if (datos[0] == (num = SC.nextInt())) {
            if (datos[1] == (num = SC.nextInt())) {
                System.out.println("Entra ");
                System.out.print(datos[0]);
                System.out.print(datos[1]);
            }
//            
//            System.out.println("Introduce el " + datos[0] + "" + datos[1] + "" + datos[2]);
//            if (datos[0] == (num = SC.nextInt())) {
//                if (datos[1] == (num = SC.nextInt())) {
//                    if (datos[2] == (num = SC.nextInt())) {
//                        System.out.println("Entra ");
//                        System.out.print(datos[0]);
//                        System.out.print(datos[1]);
//                        System.out.print(datos[2]);
//                    }
//                    
//                    System.out.println();
//                    
//                }
//            }
        }
    }
}
