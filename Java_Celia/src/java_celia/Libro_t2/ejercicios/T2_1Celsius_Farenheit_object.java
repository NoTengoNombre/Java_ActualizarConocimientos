/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

import java.util.Scanner;

public class T2_1Celsius_Farenheit_object {

    public static void farenheit_to_celsius_object(double valor) {
        Object ob;
        ob = (valor - 32) / 1.8;
        System.out.println("• Farenheit to Celsius : " + ob);
    }

    public static void celsius_to_farenheit_object(double valor) {
        Object ob;
        ob = (1.8) * valor + 32;
        System.out.println("• Celsius to farenheit : " + ob);
    }

    public static double get_temperature() {
        Scanner sc = new Scanner(System.in);
        double temp = (double) sc.nextDouble();
        return temp;
    }
}
