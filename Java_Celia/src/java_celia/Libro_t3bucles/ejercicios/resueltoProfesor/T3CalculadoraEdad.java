/**
 * @created on : 21-ago-2017, 20:59:11
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Calendar;
import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3CalculadoraEdad {

    // Devuelve la edad en años de una persona
    public int anio(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int edadAnos = anioAct - anioNac;
        if (mesNac > mesAct) {
            edadAnos--;
        }
        if ((mesNac == mesAct) && (diaNac > diaAct)) {
            edadAnos--;
        }
        return edadAnos;
    }

    // Devuelve la edad en meses de una persona
    public int mes(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int edadAnos = anio(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct);
        int edadMeses = edadAnos * 12;
        int meses = 0;

        // Calculamos el números de meses transcurrido desde el último cumpleaños
        if (mesNac < mesAct) {	// El cumpleaños ya ha ocurrido en el año actual
            meses = mesAct - mesNac;
        }
        if (mesNac > mesAct) {	// Aún no ha cumplido los años en el año actual
            meses = (12 - mesNac) + mesAct;
        }

        // Ajustamos el pico de meses mirando si ya ha llegado el "cumplemeses" o no
        if (diaNac > diaAct) {
            meses--;	// Aún no ha llegado el "cumplemeses", así que quitamos un mes
        }
        edadMeses += meses;
        return edadMeses;
    }

    // Devuelve la edad en días de una persona
    public int dia(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {

        int[] mesr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int quitar = 0;
        int edadDias = 0;

        for (int i = anioNac; i <= anioAct; i++) {
            if (esBisiesto(i) == true) {
                edadDias += 366;
            }
            if (esBisiesto(i) == false) {
                edadDias += 365;
            }
        }
        for (int i = 1; i < mesNac; i++) {	//para saber los dias del año en el que naciste
            quitar = mesr[i] + quitar;
            if (esBisiesto(anioNac) && (i == 2)) {
                quitar++;
            }
        }
        quitar = diaNac + quitar;

        for (int i = 12; i > mesAct; i--) {	//para saber los dias del año actual
            quitar = mesr[i] + quitar;
            if (esBisiesto(anioAct) && (i == 2)) {
                quitar++;
            }
        }
        quitar += (mesr[mesAct] - diaAct);

        edadDias -= quitar;
        return edadDias;
    }

    // Devuelve la edad en horas de una persona
    public int hora(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int h = dia(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 24;
        return h;
    }

    // Devuelve la edad en minutos de una persona
    public int minuto(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int m = hora(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return m;
    }

    // Devuelve la edad en segundos de una persona
    public int segundo(int anioNac, int anioAct, int mesNac, int mesAct, int diaNac, int diaAct) {
        int s = minuto(anioNac, anioAct, mesNac, mesAct, diaNac, diaAct) * 60;
        return s;
    }

    // Determina si un año es bisiesto o no
    // Devuelve true si el año a es bisiesto y false en caso contrario
    public boolean esBisiesto(int a) {

        boolean bisiesto = false;

        if (a % 4 == 0) {
            bisiesto = true;
        }
        if (a % 100 == 0) {
            bisiesto = false;
        }
        if (a % 400 == 0) {
            bisiesto = true;
        }

        return bisiesto;
    }

    public static void main(String[] args) {

        T3CalculadoraEdad fecha = new T3CalculadoraEdad();

        Calendar calendario = Calendar.getInstance();

        int diaA = calendario.get(Calendar.DAY_OF_MONTH);
        int mesA = calendario.get(Calendar.MONTH) + 1;
        int anoA = calendario.get(Calendar.YEAR);

        System.out.println("Fecha actual: " + diaA + "/" + mesA + "/" + anoA);

        System.out.println("Introduce tu dia de nacimiento");
//        int diaN = Integer.parseInt(System.console().readLine());
        int diaN = SC.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
//        int mesN = Integer.parseInt(System.console().readLine());
        int mesN = SC.nextInt();
        System.out.println("Introduce tu año de nacimiento");
//        int anoN = Integer.parseInt(System.console().readLine());
        int anoN = SC.nextInt();

        System.out.println("Tu edad es de: ");
        System.out.println(fecha.anio(anoN, anoA, mesN, mesA, diaN, diaA) + " años ");
        System.out.println(fecha.mes(anoN, anoA, mesN, mesA, diaN, diaA) + " meses ");
        System.out.println(fecha.dia(anoN, anoA, mesN, mesA, diaN, diaA) + " días ");
        System.out.println(fecha.hora(anoN, anoA, mesN, mesA, diaN, diaA) + " horas ");
        System.out.println(fecha.minuto(anoN, anoA, mesN, mesA, diaN, diaA) + " minutos ");
        System.out.println(fecha.segundo(anoN, anoA, mesN, mesA, diaN, diaA) + " segundos ");

    }

}
