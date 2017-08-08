/**
 * @created on : 03-ago-2017, 8:55:42
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_metodo_Anio_Mes_DiaBisiesto;

import java.util.Scanner;

public class JavaMetodoAnioMesDiaBisiesto {

    private static int diaStatic;
    private static int mes;
    private static int anio;

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

    public static int getTecladoAnio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un Anio > 1917 : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    public static int getTecladoDiaBisiesto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro un valor entre 1 y 29 : ");
        int teclado = sc.nextInt();
        return teclado;
    }

    //    Para el mes de febrero de 29 dias
    public static boolean getAnioBisiesto(int anio) {
        if ((anio % 4 == 0) || ((anio % 100 != 0) && (anio % 400 == 0))) { // bisiesto
            return true;
        }
        return false;
    }

    public static void setDiaEnAnioBisiesto(int anioLocal, int mesLocal) {
        int numLocal;
        mes = mesLocal;
        anio = anioLocal;
        if ((getAnioBisiesto(anioLocal) == true) && (mesLocal == 2)) {
            do {
                numLocal = getTecladoDiaBisiesto();
            } while (numLocal < 1 || numLocal > 29);
            diaStatic = numLocal;
        }
        if ((getAnioBisiesto(anioLocal) == false) && (mesLocal == 2)) {
            do {
                numLocal = getTeclado28();
            } while (numLocal < 1 || numLocal > 28);
            diaStatic = numLocal;
        }
        if (mesLocal == 1 || mesLocal == 3 || mesLocal == 5 || mesLocal == 7 || mesLocal == 8 || mesLocal == 10 || mesLocal == 12) {//31
            do {
                numLocal = getTeclado31();
            } while (numLocal < 1 || numLocal > 31);
            diaStatic = numLocal;
        }
        if (mesLocal == 4 || mesLocal == 6 || mesLocal == 9 || mesLocal == 11) {//30
            do {
                numLocal = getTeclado30();
            } while (numLocal < 1 || numLocal > 30);
            diaStatic = numLocal;
        }
    }

    public static void getAnioBisiesto() {
        if (getAnioBisiesto(anio)) {
            System.out.println("Anio : " + anio);
            if (mes == 2) {
                System.out.println("Mes : Febrero");
            }
            if ((getAnioBisiesto(anio) == true) && (mes == 2)) {
                System.out.println("dia del año Bisiesto : " + diaStatic);
            }
        }
    }

    public static void main(String[] args) {

        setDiaEnAnioBisiesto(getTecladoAnio(), getTecladoMes());

        System.out.println("Dia estatico : " + diaStatic);

//        getAnioBisiesto();
    }

}
