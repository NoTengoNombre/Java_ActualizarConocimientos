package java_celia.Libro_t1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class _1__16_Mi_primer_programa_radio_v3_profesor {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        double radio = 0, area, circunferencia = 0;
        radio = leeTeclado();
        area = calculaArea(radio);
        circunferencia = calculaCircunferencia(radio);
        muestraResultado(radio, area, circunferencia);
    }

    /**
     *
     * @param r
     * @return
     */
    public static double calculaArea(double r) {
        double a;
        a = Math.PI * (r * r);
        return a;
    }

    /**
     *
     * @param r
     * @return
     */
    public static double calculaCircunferencia(double r) {
        double c;
        c = 2 * Math.PI * r;
        return c;
    }

    /**
     *
     * @return r
     */
    public static double leeTeclado() {
        double radio = 0;
//        otra forma de capturar por teclado
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribe el valor del radio : ");
        try {
            radio = Double.parseDouble(buffer.readLine());
        } catch (IOException | NumberFormatException e) {
            System.out.println(" --> Error de lectura de datos " + e.getMessage() + " - " + e.getLocalizedMessage());
        }
        return radio;
    }

    /**
     *
     * @param r - radio circulo
     * @param area - area circulo
     * @param circunferencia - longitud de la circunferencia
     *
     */
    public static void muestraResultado(double r, double area, double circunferencia) {
        System.out.println("Radio : " + r);
        System.out.format("Circunferencia: %.2f\n", circunferencia);
        System.out.println("Area : " + area);
    }

}
