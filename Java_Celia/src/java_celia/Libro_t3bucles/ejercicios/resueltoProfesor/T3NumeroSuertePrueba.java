/**
 * @created on : 21-ago-2017, 16:10:28
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T3NumeroSuertePrueba {

    public static void main(String[] args) {
        System.out.println("Fecha: dia, mes , año");
        int d, m, a;
        System.out.println("Dia");
//        d = Integer.parseInt(System.console().readLine());
        d = SC.nextInt();
        System.out.println("Mes");
//        m = Integer.parseInt(System.console().readLine());
        m = SC.nextInt();
        System.out.println("Año");
//        a = Integer.parseInt(System.console().readLine());
        a = SC.nextInt();
        T3NumeroSuerte2 nSuerte = new T3NumeroSuerte2(d, m, a);
        System.out.print(nSuerte.getNumeroSuerte());
    }

}
