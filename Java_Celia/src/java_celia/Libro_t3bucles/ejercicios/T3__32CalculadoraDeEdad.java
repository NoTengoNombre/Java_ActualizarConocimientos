/**
 * @created on : 02-ago-2017, 19:06:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import static java_celia.Libro_t3bucles.ejercicios.ObtenerDatosTeclado.*;

public class T3__32CalculadoraDeEdad {

    private static int diaNac;
    private static int mesNac;
    private static int anioNac;

    public static int anioActual;
    public static int mesActual;
    public static int diaActual;

    public static boolean getAnioBisiesto(int anio) {
        if ((anio % 4 == 0) || ((anio % 100 != 0) && (anio % 400 == 0))) { // bisiesto
            return true;
        }
        return false;
    }

    public static void setDiaAnioMesBisiestoNacimiento(int anioLocal, int mesLocal) {
        int numLocal;
        anioNac = anioLocal;
        mesNac = mesLocal;

        if ((getAnioBisiesto(anioLocal) == false) && (mesLocal == 2)) {
            do {
                numLocal = getTeclado28();
            } while (numLocal < 1 || numLocal > 28);
            diaNac = numLocal;
        }
        if ((getAnioBisiesto(anioLocal) == true) && (mesLocal == 2)) {
            do {
                numLocal = getTecladoDiaBisiesto();
            } while (numLocal < 1 || numLocal > 29);
            diaNac = numLocal;
        }
        if (mesLocal == 4 || mesLocal == 6 || mesLocal == 9 || mesLocal == 11) {//30
            do {
                numLocal = getTeclado30();
            } while (numLocal < 1 || numLocal > 30);
            diaNac = numLocal;
        }
        if (mesLocal == 1 || mesLocal == 3 || mesLocal == 5 || mesLocal == 7 || mesLocal == 8 || mesLocal == 10 || mesLocal == 12) {//31
            do {
                numLocal = getTeclado31();
            } while (numLocal < 1 || numLocal > 31);
            diaNac = numLocal;
        }
    }

    public static void setDiaAnioMesBisiestoActual(int anioLocal, int mesLocal) {
        int numLocal;
        anioActual = anioLocal;
        mesActual = mesLocal;

        if ((getAnioBisiesto(anioLocal) == false) && (mesLocal == 2)) {
            do {
                numLocal = getTeclado28();
            } while (numLocal < 1 || numLocal > 28);
            diaActual = numLocal;
        }
        if ((getAnioBisiesto(anioLocal) == true) && (mesLocal == 2)) {
            do {
                numLocal = getTecladoDiaBisiesto();
            } while (numLocal < 1 || numLocal > 29);
            diaActual = numLocal;
        }
        if (mesLocal == 4 || mesLocal == 6 || mesLocal == 9 || mesLocal == 11) {//30
            do {
                numLocal = getTeclado30();
            } while (numLocal < 1 || numLocal > 30);
            diaActual = numLocal;
        }
        if (mesLocal == 1 || mesLocal == 3 || mesLocal == 5 || mesLocal == 7 || mesLocal == 8 || mesLocal == 10 || mesLocal == 12) {//31
            do {
                numLocal = getTeclado31();
            } while (numLocal < 1 || numLocal > 31);
            diaActual = numLocal;
        }
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static void getComparaAnios() {
        int edad = 0;
        System.out.println("--------- getComparaFechas -----------------");
        System.out.println("Anio Actual : " + anioActual);
        System.out.println("Anio Nacimiento : " + anioNac);
        edad = anioActual - anioNac;
        System.out.println("Edad actual : " + edad);
    }

    public static void main(String[] args) {

        setDiaAnioMesBisiestoNacimiento(getTecladoAnioNac(), getTecladoMes());

        System.out.println("--------- Fecha Nacimiento -----------------");
        System.out.println("Dia Nacimiento : " + diaNac);
        System.out.println("Mes Nacimiento : " + mesNac);
        System.out.println("Anio Nacimiento : " + anioNac);

        setDiaAnioMesBisiestoActual(getTecladoAnioActual(), getTecladoMes());

        System.out.println("--------- Fecha Actual -----------------");
        System.out.println("Dia Actual : " + diaActual);
        System.out.println("Mes Actual : " + mesActual);
        System.out.println("Anio Actual : " + anioActual);

        getComparaAnios();

    }

}
