//Tienes que quitar el paquete para que funcione desde consola
package java_celia.Libro_t2.consola;

import static java.lang.System.out;

public class Leer_consola {

    public static void main(String[] args) {

        out.println("Leer desde teclado : ");
        String dato;
        dato = System.console().readLine();
        out.println("Letra leida : " + dato);

    }
}
