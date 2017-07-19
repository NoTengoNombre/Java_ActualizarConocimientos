/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

import java.util.Scanner;

public class T2_2Converter_Currency {

    private static double cambio;

    public T2_2Converter_Currency() {
        cambio = 0.85;
    }

    public T2_2Converter_Currency(double value) {
        cambio = value;
    }

    public void libraToEuros() {
        double valor_euros = get_keyboard() / cambio;
        System.out.println("- Libra to Euros : " + valor_euros);
    }

    public void eurosTolibra() {
        double valor_libra = get_keyboard() * cambio;
        System.out.println("- Euros to Libra : " + valor_libra);

    }

    public static double get_keyboard() {
        System.out.println("• Intro value : ");
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();
        return pound;
    }

    public static double get_keywoard_change() {
        System.out.println("• Enter a new value for the currency : ");
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();
        return pound;
    }

}
