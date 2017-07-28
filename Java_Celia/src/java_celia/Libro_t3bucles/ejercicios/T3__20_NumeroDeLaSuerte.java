/**
 * @created on : 28-jul-2017, 10:48:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class T3__20_NumeroDeLaSuerte {

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
            mes = sc.nextInt();
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

    public static int dividirFechaTotal() {
//        int fecha = totalFecha;
        int primeraCifra = 1599;
        int restoPrimeraCifra = primeraCifra;

        int segundaCifra = restoPrimeraCifra;
        int restosegundaCifra = segundaCifra;

        int terceraCifra = restosegundaCifra;
        int restoTerceraCifra = terceraCifra;

        int cuartaCifra = restoTerceraCifra;
        int restoCuartaCifra = cuartaCifra;

        primeraCifra = primeraCifra / 1000;
        System.out.println("- Primera cifra : " + primeraCifra);
        restoPrimeraCifra %= 1000;
        System.out.println("Resto Primera cifra : " + restoPrimeraCifra);

        segundaCifra = restoPrimeraCifra / 100;
        System.out.println("- Segunda cifra : " + segundaCifra);
        restosegundaCifra %= 100;
        System.out.println("Resto Segunda cifra: " + restosegundaCifra);

        restoTerceraCifra = restosegundaCifra / 10;
        System.out.println("- Tercera cifra : " + restoTerceraCifra);
        restoTerceraCifra %= 10;
        System.out.println("Resto Tercera cifra : " + restoTerceraCifra);

        restoCuartaCifra = restoTerceraCifra / 1;
        System.out.println("- Cuarta cifra : " + restoCuartaCifra);
        restoCuartaCifra %= 10;
        System.out.println("Resto Cuarta cifra : " + restoCuartaCifra);

        return 0;
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

//    3 metodos
//    public int 
    public static void main(String[] args) {

        System.out.println("dia : " + dia());
        System.out.println("mes : " + mes());
        System.out.println("anio : " + anios());
        System.out.println("------------------");
        System.out.println("Dia introducido : " + dia);
        System.out.println("Mes introducido : " + mes);
        System.out.println("Anio introducido : " + anio);

        System.out.println("------------------------");

        System.out.println("Division : " + dividirFechaTotal());

    }
}
