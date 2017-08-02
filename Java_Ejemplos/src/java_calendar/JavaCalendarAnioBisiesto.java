/**
 * @created on : 02-ago-2017, 19:59:19
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_calendar;

import java.util.GregorianCalendar;

public class JavaCalendarAnioBisiesto {

    public static int getBisiesto(int anio) {
        GregorianCalendar calendar = new GregorianCalendar();

        if (calendar.isLeapYear(anio)) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
        return anio;
    }

    public static void main(String[] args) {
        int bisiesto = getBisiesto(2001);
        int bisiesto1 = getBisiesto(1600);
        int bisiesto2 = getBisiesto(2000);
    }
}
