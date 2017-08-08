/**
 * @created on : 03-ago-2017, 23:26:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_calendar;

import java.util.Calendar;

public class JavaAnioActual {

    public static int anio() {
        Calendar cAnio = Calendar.getInstance();
        int anio = cAnio.get(Calendar.YEAR);
        System.out.println("El anio Actual es : \nanio " + anio);
        return anio;
    }

    public static int mes() {
        Calendar cAnio = Calendar.getInstance();
        System.out.println("El mes de Enero empieza en 0");
        int mes = cAnio.get(Calendar.MONTH) + 1;
        System.out.println("mes " + mes);
        return mes;
    }

    public static int dia() {
        Calendar cAnio = Calendar.getInstance();
        System.out.println("El dia de Enero empieza en 0");
        int dia = cAnio.get(Calendar.DAY_OF_MONTH);
        System.out.println("dia " + dia);
        return dia;
    }

    public static void main(String[] args) {
        anio();
        mes();
        dia();
    }
}
