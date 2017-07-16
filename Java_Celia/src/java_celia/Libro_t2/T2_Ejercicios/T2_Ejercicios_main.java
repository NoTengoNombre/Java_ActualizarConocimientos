/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.T2_Ejercicios;

import static java_celia.Libro_t2.T2_Ejercicios.T2_1Ejercicios_Celsius_Farenheit_object.celsius_to_farenheit_object;
import static java_celia.Libro_t2.T2_Ejercicios.T2_1Ejercicios_Celsius_Farenheit_object.farenheit_to_celsius_object;
import static java_celia.Libro_t2.T2_Ejercicios.T2_1Ejercicios_Celsius_Farenheit_object.get_temperature;

public class T2_Ejercicios_main {

    public static void main(String[] args) {

        System.out.println("---------------------------");
        T2_1Ejercicios_Celsius_Farenheit_atributos.show_temp();

        System.out.println("---------------------------");
        System.out.print("• Intro farenheit to Celsius : ");
        farenheit_to_celsius_object(get_temperature());
        System.out.print("• Intro celsius to farenheit : ");
        celsius_to_farenheit_object(get_temperature());

    }
}
