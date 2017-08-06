/**
 * @created on : 03-ago-2017, 18:30:21
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__33ContarDias {

    public static boolean getBisiesto(int anio) {
        boolean verdadero = false;
        if ((anio % 4 == 0) && ((anio % 400 == 0) || (anio % 100 != 0))) {
            verdadero = true;
        }
        return verdadero;
    }

    public static boolean getNoBisiesto(int anio) {
        boolean verdadero = false;
        if (!(anio % 4 == 0) && ((anio % 400 == 0) || (anio % 100 != 0))) {
            verdadero = true;
        }
        return verdadero;
    }

    public static int diasTranscurridos(int anio, int mes) {
        int total = 0;
        int c = 0;
        for (int i = 1; i <= mes; i++) {
            if (mes < 13) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    total += 31;
                }
                if ((i == 2 && getBisiesto(anio)) && (c == 0)) {
                    total += 29;
                    c++;
                }
                if ((i == 2 && getNoBisiesto(anio)) && (c == 0)) {
                    total += 28;
                    c++;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    total += 30;
                }

                System.out.println("Mes : " + i + " Dia : " + total);
            }
        }
        return total;
    }

    public static int diasTranscurridosDesdeDiaFijado(int anio, int mes, int dia) {
        int total = 0;
        int c = 0;
        for (int i = 1; i <= mes; i++) {
            if (mes < 13) {
                if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                    System.out.println("DIA : " + dia); 
                    total += dia;
                }
                if ((i == 2 && getBisiesto(anio)) && (c == 0)) {
                    System.out.println("DIA : " + dia);
                    total += dia;
                    c++;
                }
                if ((i == 2 && getNoBisiesto(anio)) && (c == 0)) {
                    System.out.println("DIA : " + dia);
                    total += dia;
                    c++;
                }
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    System.out.println("DIA : " + dia);
                    total += dia;
                }

                System.out.println("Mes : " + i + " Dia : " + total);
            }
        }
        return total;
    }

    public static int dia(int dia) {

        return dia;
    }

    public static void main(String[] args) {

        int mes = diasTranscurridos(2000, 2);
        System.out.println("Valor : " + mes);

        System.out.println("---------------------");
        int mes2 = diasTranscurridosDesdeDiaFijado(2000, 2, 13);
        System.out.println("Valor : " + mes2);

    }

}
