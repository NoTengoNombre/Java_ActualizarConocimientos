/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t2.ejercicios;

import static java_celia.Libro_t2.ejercicios.T2_2Converter_Currency.get_keywoard_change;

public class T2_2main_converter_currency {

    public static void main(String[] args) {
        T2_2Converter_Currency t1 = new T2_2Converter_Currency();
        t1.libraToEuros();
        t1.eurosTolibra();

        T2_2Converter_Currency t2 = new T2_2Converter_Currency(get_keywoard_change());
        t2.libraToEuros();
        t2.eurosTolibra();

    }
}
