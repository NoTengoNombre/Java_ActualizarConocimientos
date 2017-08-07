/**
 * @created on : 07-ago-2017, 10:19:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import static java_celia.Libro_t3bucles.ejercicios.Redondeo.redondeo;

public class T3__36AtraccionGravitatoria {

    private static final double RADIO = 6370; //km
    private static double gravedadTotal;

    public static double getGravedadBasica2(double h) {
        gravedadTotal = ((9.8) * ((Math.pow(RADIO, 2)) / (Math.pow((RADIO + h), 2))));
        double redondeo = redondeo(gravedadTotal, 2);
        return redondeo;
    }

    public static double getDatosGravedad(double h) {
        double gravedadBasica2 = 0;
        System.out.println("Altitud (km)           Gravedad (m /s2) ");
        System.out.println("-----------------------------------------");
        for (int i = 0; i <= h; i += 100) {
            gravedadBasica2 = getGravedadBasica2(i);
            System.out.println("\t" + i + "  \t \t \t " + gravedadBasica2);
        }
        return gravedadBasica2;
    }

    public static void main(String[] args) {

        getDatosGravedad(1400);
    }

}
