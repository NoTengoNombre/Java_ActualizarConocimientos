/**
 * @created on : 01-ago-2017, 23:51:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class T3__30_MaquinaExpendedora {

    public static void getDinero(double resto) {

        if (resto >= 500 && resto <= 1000) {
            int b500 = (int) (resto / 500);
            System.out.println("Billetes de 500 € : " + (int) b500);
            resto = resto % 500;
            System.out.println("Resto de dividir por un billete de 500 € : " + (int) resto);
        }

        if (resto >= 200 && resto < 500) {
            int b200 = (int) (resto / 200);
            System.out.println("Billetes de 200 €: " + (int) b200);
            resto = resto % 200;
            System.out.println("Resto de dividir por un billete de 200 € : " + (int) resto);
        }

        if (resto >= 100 && resto < 200) {
            int b100 = (int) (resto / 100);
            System.out.println("Billetes de 100 € : " + (int) b100);
            resto = resto % 100;
            System.out.println("Resto de dividir por un billete de 100 € : " + (int) resto);
        }

        if (resto >= 50 && resto < 100) {
            int b50 = (int) (resto / 50);
            System.out.println("Billetes de 50 € : " + (int) b50);
            resto = resto % 50;
            System.out.println("Resto de dividir por un billete de 50 € : " + (int) resto);
        }

        if (resto >= 20 && resto < 50) {
            int b20 = (int) (resto / 20);
            System.out.println("Billetes de 20 € : " + (int) b20);
            resto = resto % 20;
            System.out.println("Resto de dividir por un billete de 20 € : " + (int) resto);
        }

        if (resto >= 10 && resto < 20) {
            int b10 = (int) (resto / 10);
            System.out.println("Billetes de 10 € : " + (int) b10);
            resto = resto % 10;
            System.out.println("Resto de dividir por un billete de 10 € : " + (int) resto);
        }

        if (resto >= 5 && resto < 10) {
            int b5 = (int) (resto / 5);
            System.out.println("Billetes de 5 € : " + (int) b5);
            resto = resto % 5;
            System.out.println("Resto de dividir por un billete de 5 € : " + (int) resto);
        }

        if (resto >= 2 && resto < 5) {
            int b2 = (int) (resto / 2);
            System.out.println("Monedas de 2 € : " + (int) b2);
            resto = resto % 2;
            System.out.println("Resto de dividir por las monedas de 2 € : " + (int) resto);
        }

        if (resto >= 1 && resto < 2) {
            int b1 = (int) (resto / 1);
            System.out.println("Monedas de 1 € : " + (int) b1);
            resto = resto % 1;
            System.out.println("Resto de dividir por las monedas de 1 € : " + (int) resto);
        }

        if (resto >= 0.5 && resto < 1) {
            double b05 = (int) (resto / 0.5);
            System.out.println("Monedas de 0.5 € : " + (int) b05);
            resto = resto % 0.5;
            System.out.println("Resto de dividir por las monedas de 0.5 € : " + resto);
        }

        if (resto >= 0.2 && resto < 0.5) {
            double b02 = (int) (resto / 0.2);
            System.out.println("Monedas de 0.2 € : " + (int) b02);
            resto = resto % 0.2;
            System.out.println("Resto de dividir por las monedas de 0.2 : " + resto);
        }

        if (resto >= 0.1 && resto < 0.2) {
            double b01 = (int) (resto / 0.1);
            System.out.println("Monedas de 0.1 : " + (int) b01);
            resto = resto % 0.1;
            System.out.println("Resto de dividir por las monedas de 0.1 : " + resto);
        }

    }

    /**
     *
     * @param x
     * @param places
     * @return
     */
    public static void getRedondeo2Cifras(double x, int places) {
        String val = x + "";
        BigDecimal big = new BigDecimal(val);
        big = big.setScale(2, RoundingMode.HALF_UP);
        double d = big.doubleValue();
        System.out.println("Número : " + d);
    }

    public static void main(String[] args) {
        double x = (Math.random() * (1 + 900) + 1);
        getRedondeo2Cifras(x, 2);
//        getDinero(redondeo2Cifras);
        getDinero(x);   
    }
}
