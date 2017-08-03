/**
 * @created on : 29-jul-2017, 0:03:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;
import static java_celia.Libro_t3bucles.ejercicios.T3__33ContarDias.getBisiesto;

public class DiaMesAnio {

    private static int dia;
    private static int mes;
    private static int anio;
    private static int totalFecha;

    public static int dia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un día : ");
        dia = sc.nextInt();
        do {
            if (dia <= 0 || dia > 31) {
                System.out.println("♦ Dia incorrecto : " + dia + " -> Vuelve a intro otro numero");
            } else {
                return dia;
            }
            System.out.println("♦ Introduce un día correcto : ");
            dia = sc.nextInt();
        } while (dia <= 0 || dia > 31);
        return dia;
    }

    public static int mes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un mes : ");
        mes = sc.nextInt();
        do {
            if (mes <= 0 || mes > 12) {
                System.out.println("♦ Mes incorrecto : " + mes + " -> Vuelve a intro otro numero");
            } else {
                return mes;
            }
            System.out.println("♦ Introduce un mes correcto : ");
            dia = sc.nextInt();
        } while (mes <= 0 || mes > 12);
        return mes;
    }

    public static int anios() {
        Scanner sc = new Scanner(System.in);
        System.out.println("• Introduce un anio : ");
        anio = sc.nextInt();
        do {
            if (anio < 1917 || anio > anioActual()) {
                System.out.println("♦ Anio incorrecto : " + anio + " -> Vuelve a intro otro numero");
            } else {
                return anio;
            }
            System.out.println("♦ Introduce un anio correcto : ");
            anio = sc.nextInt();
        } while (anio <= 1900 || anio > anioActual());
        return anio;
    }

    public static int mes(int mes, int anio) {
        int total = 0;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
//x 31
        }
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
//x 30
        }
        if (mes == 2 && getBisiesto(anio)) {
// x 28
        }
        return mes;
    }

    public static boolean getBisiesto(int anio) {
        boolean booleano;
        if ((anio % 4 == 0) && ((anio % 4 == 0) || (anio % 100 != 0))) {
            System.out.println("Bisiesto");
            return booleano = true;
        } else {
            return booleano = false;
        }
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static int totalFecha() {
        totalFecha = dia + mes + anio;
        return totalFecha;
    }
}
