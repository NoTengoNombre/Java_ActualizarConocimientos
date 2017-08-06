/**
 * @created on : 03-ago-2017, 21:41:20
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Calendar;
import java.util.Scanner;

public class DiaMesAnio2 {

    private static int total = 0;
    private static int anio = 0;

    public static int getAnioActual() {
        Calendar fecha = Calendar.getInstance();
        int anioBisiestoNo = fecha.get(Calendar.YEAR);
        return anioBisiestoNo;
    }

    public static boolean getBisiesto(int anio) {
        boolean verdadero = false;
        if ((anio % 4 == 0) && ((anio % 400 == 0) || (anio % 100 != 0))) {
            verdadero = true;
        }
        return verdadero;
    }

    public static int diasTranscurridosDesdeDiaFijado() {
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        anio = getAnioActual();
        System.out.println("Intro un mes : ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                while (dia < 1 || dia > 31) {
                    System.out.println("Enero : Intro un dia para Enero entre 1 y 31");
                    dia = sc.nextInt();
                }
                System.out.println("dia 1 : " + dia);
                total = total + dia;
                System.out.println("Total dias de Enero : " + total);
                break;

            case 2:
                if (getBisiesto(anio) == true) {
                    System.out.println("Febrero : Anio Bisiesto - Intro un dia entre 1 y 29 ");
                    while (dia < 1 || dia > 29) {
                        System.out.println("Intro un dia entre 1 y 29 ");
                        dia = sc.nextInt();
                    }
                    total = 31 + dia;
                    System.out.println("Total dias de Febrero Bisiesto : " + total);
                } else {
                    while (dia < 1 || dia > 28) {
                        System.out.println("Febrero : Intro un dia entre 1 y 28 ");
                        dia = sc.nextInt();
                    }
                    total = 31 + dia;
                    System.out.println("Total dias de Febrero No Bisiesto : " + total);
                }
                break;

            case 3:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Marzo 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 60 + dia;
                    System.out.println("Total dias de Marzo Bisiesto : " + total);
                } else {
                    total = 59 + dia;
                    System.out.println("Total dias de Marzo No Bisiesto : " + total);
                }
                break;

            case 4:
                while (dia < 1 || dia > 30) {
                    System.out.println("Intro un dia para Abril 1 y 30");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 90 + dia;
                    System.out.println("Total dias de Abril en anio bisiesto : " + total);
                } else {
                    total = 89 + dia;
                    System.out.println("Total dias de Abril en anio no bisiesto : " + total);
                }
                break;

            case 5:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Mayo 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 121 + dia;
                    System.out.println("Total dias de Mayo en anio bisiesto : " + total);
                } else {
                    total = 120 + dia;
                    System.out.println("Total dias de Mayo en anio no bisiesto : " + total);
                }
                break;

            case 6:
                while (dia < 1 || dia > 30) {
                    System.out.println("Intro un dia para Junio 1 y 30");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 151 + dia;
                    System.out.println("Total dias de Junio en anio bisiesto : " + total);
                } else {
                    total = 150 + dia;
                    System.out.println("Total dias de Junio en anio no bisiesto : " + total);
                }
                break;

            case 7:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Julio 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 182 + dia;
                    System.out.println("Total dias de Julio en anio bisiesto : " + total);
                } else {
                    total = 181 + dia;
                    System.out.println("Total dias de Julio en anio no bisiesto : " + total);
                }
                break;

            case 8:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Agosto 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 213 + dia;
                    System.out.println("Total dias de Agosto en anio bisiesto : " + total);
                } else {
                    total = 212 + dia;
                    System.out.println("Total dias de Agosto en anio no bisiesto : " + total);
                }
                break;

            case 9:
                while (dia < 1 || dia > 30) {
                    System.out.println("Intro un dia para Septiembre 1 y 30");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 243 + dia;
                    System.out.println("Total dias de Septiembre en anio bisiesto : " + total);
                } else {
                    total = 242 + dia;
                    System.out.println("Total dias de Septiembre en anio no bisiesto : " + total);
                }
                break;

            case 10:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Octubre 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 274 + dia;
                    System.out.println("Total dias de Octubre en anio bisiesto : " + total);
                } else {
                    total = 273 + dia;
                    System.out.println("Total dias de Octubre en anio no bisiesto : " + total);
                }
                break;

            case 11:
                while (dia < 1 || dia > 30) {
                    System.out.println("Intro un dia para Noviembre 1 y 30");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 304 + dia;
                    System.out.println("Total dias de Noviembre en anio bisiesto : " + total);
                } else {
                    total = 303 + dia;
                    System.out.println("Total dias de Noviembre en anio no bisiesto : " + total);
                }
                break;

            case 12:
                while (dia < 1 || dia > 31) {
                    System.out.println("Intro un dia para Diciembre 1 y 31");
                    dia = sc.nextInt();
                }
                if (getBisiesto(anio)) {
                    total = 335 + dia;
                    System.out.println("Total dias de Diciembre en anio bisiesto : " + total);
                } else {
                    total = 334 + dia;
                    System.out.println("Total dias de Diciembre en anio no bisiesto : " + total);
                }
                break;
            default:
                System.out.println("Has agregado un mes que no es valido");
                break;
        }
        return total;
    }

    public static void getDiasPasados() {
        int dias;
        int totalDias = diasTranscurridosDesdeDiaFijado();
        System.out.println("Total de dias transcurridos : " + totalDias);
        if (getBisiesto(anio)) {
            dias = 366 - totalDias;
            System.out.println("Dias que faltan para llegar a Diciembre en anio bisiesto : " + dias);
        } else {
            dias = 365 - totalDias;
            System.out.println("Dias que faltan para llegar a Diciembre en anio no bisiesto  : " + dias);
        }
    }

    public static void main(String[] args) {

        getDiasPasados();
    }
}
