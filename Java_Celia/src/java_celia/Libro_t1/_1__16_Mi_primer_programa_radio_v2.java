package java_celia.Libro_t1;

import java.math.BigDecimal;

/**
 * @created on : 14-jul-2017, 23:28:34
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
public class _1__16_Mi_primer_programa_radio_v2 {

    public static void get_area(double radio) {
        double PI = Math.PI;
        double area;
        area = Math.pow(radio, 2) * PI;
        System.out.println("Area del circulo de " + radio + " es :  " + area);
    }

    public static void get_circunferencia(double radio) {
        radio += radio;
        double circunferencia = (double) (radio * Math.PI);
        System.out.println("Longitud de la circunferencia es de : " + circunferencia);
    }

    public static void main(String[] args) {

//        get_area((double) (Math.random() * (1 + 10) + 1));
        get_circunferencia(5);
        get_area(5);

    }
}
