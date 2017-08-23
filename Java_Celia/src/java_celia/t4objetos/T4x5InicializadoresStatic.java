/**
 * @created on : 22-ago-2017, 10:57:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos;

public class T4x5InicializadoresStatic {

}

class Ejemplo {

    static int a;
    int b;

    public Ejemplo() {
        b = a * 2;
        System.out.println("Valor de a : " + a + " Valor de b:  " + b);
    }

    /**
     * Este es el inicializador Static , se ejecutara antes de cualquier
     * instancia de la clase Ejemplo y antes del Constructor
     */
    static {
        a = 1;
    }

}
