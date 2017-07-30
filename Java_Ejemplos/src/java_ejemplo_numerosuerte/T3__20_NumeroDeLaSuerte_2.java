/**
 * @created on : 28-jul-2017, 10:48:09
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_numerosuerte;

import java.util.Calendar;
import java.util.Scanner;

public class T3__20_NumeroDeLaSuerte_2 {

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
        dia = sc.nextInt();
        do {
            if (dia <= 0 || dia > 12) {
                System.out.println("♦ Mes incorrecto : " + dia + " -> Vuelve a intro otro numero");
            } else {
                return dia;
            }
            System.out.println("♦ Introduce un mes correcto : ");
            dia = sc.nextInt();
        } while (dia <= 0 || dia > 12);
        return dia;
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

    public static int dividirFechaGeneral(int anio) {
        System.out.println("Anio : " + anio);
        int d1 = anio / 1000;
        int r1 = anio % 1000;
        int d2 = r1 / 100;
        int r2 = anio % 100;
        int d3 = r2 / 10;
        int r3 = anio % 10;
        int d4 = r3 / 1;
        anio = d1 + d2 + d3 + d4;
        System.out.println("=========" + anio + "=========");
        return anio;
    }

    public static int dividir2cifrasAnio(int anio) {
        System.out.println("==========================");
        int total2dividir;
        int total3;
        int total3_resto;
        int total4;
        int total_final;

        total2dividir = anio;
        total2dividir = total2dividir * 10;
        total3 = total2dividir / 100;
        total3_resto = total2dividir % 100;
        total4 = total3_resto / 10;
        total_final = total3 + total4;

        System.out.println("Total : " + total_final);
        if (total_final == 10) {
            total_final = 1;
        }
        System.out.println("Final del Total : " + total_final);

        return total_final; // valor final de sumar las fechas
    }

    public static int dividir2cifrasMes(int mes) {
        System.out.println("--------- MES -----------");
        int total1;
        int total2;
        int total3;
        mes = mes * 10;
        System.out.println("Valor : " + mes);
        total1 = mes / 100;
        int total_resto = mes % 100;
        System.out.println("Total : " + total1);
        System.out.println("Total Resto : " + total_resto);
        total2 = total_resto / 10;
        System.out.println("Total : " + total2);
        total3 = total1 + total2;
        return total3;
    }

    public static int dividir2cifrasDia(int dia) {
        System.out.println("........... Dia ................");
        int dia2;
        int total1;
        int total2;
        int total3;
//      300  =  30   10
        dia2 = dia * 10;
        System.out.println("Valor : " + dia2);
        total1 = dia2 / 100;
        System.out.println("Valor 1 : " + total1);

        int total_resto = dia % 100;
        System.out.println("Total : " + total1);
        System.out.println("• Total Resto : " + total_resto);
        total2 = total_resto % 10;
        System.out.println("♦ Total : " + total2);
        total3 = total1 + total2;
        return total3;
    }

    public static int anioActual() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year;
    }

    public static int totalFecha() {
        totalFecha = dia + dia + anio;
        return totalFecha;
    }

    public static void main(String[] args) {

//        System.out.println("dia : " + dia());
//        System.out.println("mes : " + mes());
//        System.out.println("anio : " + anios());
//        System.out.println("------------------");
//        System.out.println("Dia introducido : " + dia);
//        System.out.println("Mes introducido : " + mes);
//        System.out.println("Anio introducido : " + anio);
        System.out.println("------------------------");
        System.out.println("Division : " + dividirFechaGeneral(anio));
        int fechaDividida = dividirFechaGeneral(anio);
        System.out.println("Division final : " + dividir2cifrasAnio(fechaDividida));
        System.out.println("------------------------");
        int dividir2cifrasMes = dividir2cifrasMes(11);
        System.out.println("Mes total : " + dividir2cifrasMes);
        int dividir2cifrasDia = dividir2cifrasDia(7);
        System.out.println("Mes total : " + dividir2cifrasDia);

    }
}
