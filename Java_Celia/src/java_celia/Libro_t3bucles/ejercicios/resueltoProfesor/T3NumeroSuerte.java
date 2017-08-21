/**
 * @created on : 21-ago-2017, 15:42:43
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3NumeroSuerte {

    private int suma;

    /**
     * Cuando se instancie la clase tendra valores definidos
     *
     * @param d
     * @param m
     * @param a
     */
    public T3NumeroSuerte(int d, int m, int a) {
        suma = d + m + a;
    }

    /**
     *
     * @param n
     * @return
     */
    private int sumaCifras(int n) {

        int cifras, acum = 0;

        do {
            cifras = n % 10;
            acum += cifras;
            n /= 10;
        } while (n != 0);
        return n;
    }

    public int getNumeroSuerte() {
        int acum = sumaCifras(suma);

        if (acum > 10) {
            acum = sumaCifras(acum);
        }
        return acum;
    }

    public static void main(String[] args) {

        System.out.println("Introduce una fecha : ");
        int d, m, a;
        System.out.println("Dia");
//        d = Integer.parseInt(System.console().readLine());
        d = SC.nextInt();
        System.out.println("Dia : " + d);
        System.out.println("Mes");
//        m = Integer.parseInt(System.console().readLine());
        m = SC.nextInt();
        System.out.println("Mes : " + m);
        System.out.println("Anios");
//        a = Integer.parseInt(System.console().readLine());
        a = SC.nextInt();
        System.out.println("Anios : " + a);
        T3NumeroSuerte numeroSuerte = new T3NumeroSuerte(d, m, a);
        System.out.println("Numero de la suerte : " + numeroSuerte.getNumeroSuerte());
    }
}
