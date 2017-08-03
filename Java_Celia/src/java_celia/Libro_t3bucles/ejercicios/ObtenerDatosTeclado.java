/**
 * @created on : 03-ago-2017, 10:19:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class ObtenerDatosTeclado {

    public static int getTeclado28() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un valor entre 1 y 28 : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    public static int getTeclado30() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un valor entre 1 y 30 : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    public static int getTeclado31() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un valor entre 1 y 31 : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    public static int getTecladoMes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un mes : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    public static int getTecladoAnioNac() {
        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("-----------------------------------");
        do {
            System.out.println("Intro el anio Nacimiento : Anio < " + anioActual() + " y " + anioActual() + " > 1917 : ");
            anio = sc.nextInt();
//            System.out.println("VALOR : " + anio);
        } while ((anio > anioActual()) || (anio < 1917));
        return anio;
    }

    public static int getTecladoAnioActual() {
        Scanner sc = new Scanner(System.in);
        int anio;
        System.out.println("-----------------------------------");
        do {
            System.out.println("Intro el anio Actual : Anio < " + anioActual() + " y " + anioActual() + " > 1917 : ");
            anio = sc.nextInt();
//            System.out.println("VALOR : " + anio);
        } while ((anio > anioActual()) || (anio < 1917));
        return anio;
    }

    public static int getTecladoDiaBisiesto() {
        Scanner sc = new Scanner(System.in);
        int dia;
        do {
            System.out.println("Intro un valor entre 1 y 29 ");
            dia = sc.nextInt();
        } while ((29 < dia) || (dia < 1));
        return dia;
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static int getTeclado() {
        Scanner sc = new Scanner(System.in);
        int teclado = sc.nextInt();
        return teclado;
    }

    public static void main(String[] args) {

        int tecladoAnio = getTecladoAnioNac();
        if (tecladoAnio == 2017) {
            System.out.println("" + tecladoAnio);
        } else if (tecladoAnio == 1917);

        int tecladoDiaBisiesto = getTecladoDiaBisiesto();
        if (tecladoDiaBisiesto == 29) {
            System.out.println("Dia de Año Bisiesto : " + tecladoDiaBisiesto);
        } else {
            System.out.println("Dia NO Año Bisiesto : " + tecladoDiaBisiesto);
        }
    }
}
