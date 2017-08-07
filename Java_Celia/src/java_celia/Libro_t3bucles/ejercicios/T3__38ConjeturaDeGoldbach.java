/**
 * @created on : 07-ago-2017, 23:14:06
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__38ConjeturaDeGoldbach {

    public static int getPar() {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Intro un numero : ");
        num = sc.nextInt();
        while ((num % 2 != 0) || (num < 4)) { // mientra sea impar
            System.out.println("Intro un numero mayor que 4 y que sea PAR : ");
            num = sc.nextInt();
        }
        return num;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void setGoldbach2(int num) {
        int numero = num;
        for (int indice1 = 2; indice1 < num; indice1++) {
            for (int indice2 = 2; indice2 < num; indice2++) {
                if (esPrimo(indice1)) {
                    int valor1 = indice1;
                    if (esPrimo(indice2)) {
                        int valor2 = indice2;
                        if (((numero % (valor1 + valor2)) == 0) && (numero / (valor1 + valor2) < 2)) {
                            System.out.println("Los numeros son " + valor1 + " y " + valor2);
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {

        setGoldbach2(getPar());

    }
}
