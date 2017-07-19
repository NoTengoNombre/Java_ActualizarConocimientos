/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class T2_1Celsius_Farenheit_atributos {

    private static double farenheit;
    private static double celsius;

    public static void set_farenheit_to_celsius_atribute() {
        System.out.println("- Intro Farenheit to Celsius");
        double valor = get_temperature();
        farenheit = (valor - 32) / 1.8;
        System.out.println("- Farenheit to Celsius : " + farenheit + " \n");
    }

    public static void set_celsius_to_farenheit_atribute() {
        System.out.println("- Intro Celsius to Farenheit");
        double valor = get_temperature();
        celsius = (1.8) * valor + 32;
        System.out.println("- Celsius to Farenheit : " + celsius + " \n");
    }

    public static void show_temp() {
        set_celsius_to_farenheit_atribute();
        set_farenheit_to_celsius_atribute();
    }

    public static double get_temperature() {
        double value = 0;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            value = Double.parseDouble(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(T2_1Celsius_Farenheit_atributos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
    }

}
