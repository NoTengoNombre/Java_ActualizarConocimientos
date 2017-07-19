/**
 * @created on : 18-jul-2017, 0:35:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

public class t3_centinela {

    public static void main(String[] args) {

        int n, suma;
        suma = 0;

        boolean terminar = false;

        do {
            System.out.println("Intro un numero ( negativo ) para terminar");
            n = Integer.parseInt(System.console().readLine());
            if (n >= 0) {
                suma = suma + n;
            }
        } while (n >= 0); // valor del centinela

        System.out.println("La suma total es : " + suma);
    }

}
