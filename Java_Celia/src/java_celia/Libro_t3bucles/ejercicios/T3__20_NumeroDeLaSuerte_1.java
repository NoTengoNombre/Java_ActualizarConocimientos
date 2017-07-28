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

public class T3__20_NumeroDeLaSuerte_1 {

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

    public static int dividirFechaGeneral(int anio) {
        anio = 1990;
        System.out.println("r0 " + anio);
        int d1 = anio / 1000;
        System.out.println(" 1 divison : " + d1);
        int r1 = anio % 1000;
        System.out.println(" 1 resto : " + r1);
        System.out.println("-----------------");
        System.out.println("r1 " + r1);
        int d2 = r1 / 100;
        System.out.println(" 2 divison : " + d2);
        int r2 = anio % 100;
        System.out.println(" 2 resto : " + r2);
        System.out.println("-----------------");
        System.out.println("r2 " + r2);
        int d3 = r2 / 10;
        System.out.println(" 3 divison : " + d3);
        int r3 = anio % 10;
        System.out.println(" 3 resto : " + r3);
        System.out.println("-----------------");
        System.out.println("r3 " + r3);
        int d4 = r3 / 1;
        System.out.println(" 4 divison : " + d4);
        int r4 = anio % 1;
        System.out.println(" 4 resto : " + r4);
        System.out.println("r4 " + r4);
        anio = d1 + d2 + d3 + d4;
        System.out.println("=========" + anio + "=========");
        return anio;
    }

    public static int dividir2cifras(int resto) {
        int total2dividir;
        int total3;
        int total3_resto;
        int total4;
        int total4_resto;
        int total_final;

        total2dividir = resto;
        System.out.println("-----------" + resto + "---------------");

        total2dividir = total2dividir * 10;
        System.out.println("Total2 : " + total2dividir); // 100

        total3 = total2dividir / 100;
        System.out.println("Total 3 : " + total3); // 1

        total3_resto = total2dividir % 100;
        System.out.println("Totalr 3 : " + total3_resto); // 1

        total4 = total3_resto / 10;
        System.out.println("Total 4 : " + total4); // 1

        total4_resto = total3_resto % 10;
        System.out.println("Totalr 4 : " + total4_resto); // 1

        total_final = total3 + total4;

        if (total_final == 10) {
            total_final = 1;
        }

        System.out.println("Total final : " + total_final);

        return total_final;
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
        System.out.println("Division : " + dividir2cifras(fechaDividida));

    }
}
