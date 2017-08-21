/**
 * @created on : 20-ago-2017, 23:21:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3ContarCifrasPruebas {

    public static void main(String[] args) {
        int n;

        System.out.println("Escribe un numero (0-99999) : ");
//        n = Integer.parseInt(System.console().readLine());
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        T3ContarCifras cf = new T3ContarCifras();
        System.out.println("El numero " + n + " tiene " + cf.calculaNumCifras(n) + " cifras");

        int x1 = cf.calculaNumCifras(n);
        System.out.println("valor de x1 : " + x1);
        int x2 = cf.calculaNumCifras2(n);
        System.out.println("valor de x2 : " + x2);
        int x3 = cf.calculaNumCifras3(n);
        System.out.println("valor de x3 : " + x3);
        int x4 = cf.calculaNumCifras4(n);
        System.out.println("valor de x4 : " + x4);

    }
}
