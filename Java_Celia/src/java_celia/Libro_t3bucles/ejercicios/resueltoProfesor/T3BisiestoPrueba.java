/**
 * @created on : 20-ago-2017, 19:58:23
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3BisiestoPrueba {

    public static void main(String[] args) {

        T3Bisiesto t3r = new T3Bisiesto();

        System.out.println(t3r.esBisiesto(1904));
        System.out.println(t3r.esBisiesto2(1904));
        System.out.println(t3r.esBisiesto3(1904));

        System.out.println("----------------------");
        System.out.println(t3r.esBisiesto(2004));
        System.out.println(t3r.esBisiesto2(2004));
        System.out.println(t3r.esBisiesto3(2004));

        if (t3r.esBisiesto3(2004)) {
            System.out.println(" SI es bisiesto");
        } else {
            System.out.println(" No es bisiesto");
        }

    }

}
