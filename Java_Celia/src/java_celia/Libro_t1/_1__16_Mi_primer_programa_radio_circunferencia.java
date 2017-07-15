package java_celia.Libro_t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Profesor
 */
public class _1__16_Mi_primer_programa_radio_circunferencia {

    public static void main(String[] args) {
        show_data();
    }

    /**
     * Get area
     *
     * @param r
     * @return
     */
    private static double get_area(double r) {
        double a;
        a = Math.PI * (r * r);
        return a;
    }

    /**
     * Leer desde teclado
     *
     * @return
     */
    private static double get_area_keywoard() {
        double radio = 0;
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(s);

        System.out.println(" • Write value of radio : ");

        try {
            radio = Double.parseDouble(br.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println(" • Error in the read data : " + e.getMessage());
        }
        return radio;
    }

    /**
     *
     * @param r
     * @return
     */
    private static double get_circumference(double r) {
        double c;
        c = 2 * Math.PI * r;
        return c;
    }

    private static void show_data() {
        double r = get_area(get_area_keywoard());
        System.out.println("- Get area circumference : " + get_circumference(get_area_keywoard()));
        System.out.println("- Get area " + r);
    }
}
