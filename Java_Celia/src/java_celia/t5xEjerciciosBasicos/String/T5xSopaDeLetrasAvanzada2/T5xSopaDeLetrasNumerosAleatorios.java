/**
 * @created on : 22-sep-2017, 21:01:42
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String.T5xSopaDeLetrasAvanzada2;

public class T5xSopaDeLetrasNumerosAleatorios {

    /**
     *
     * @param minimo
     * @param maximo
     * @return
     */
    public static int getNumRandomDe0a5() {
        int x = (int) (Math.random() * (0 + 5));
        System.out.println("Numero aleatorio : " + x);
        return x;
    }

    /**
     *
     * @return
     */
    public static int getNumRandomDe5a10() {
        int x = (int) (Math.random() * (5 + 10));
        System.out.println("Numero aleatorio : " + x);
        return x;
    }

    /**
     *
     * @return
     */
    public static int getNumRandomDe10a15() {
        int x = (int) (Math.random() * (10 + 15));
        System.out.println("Numero aleatorio : " + x);
        return x;
    }

    /**
     *
     * @return
     */
    public static int getNumRandomDe15a20() {
        int x = (int) (Math.random() * (15 + 20));
        System.out.println("Numero aleatorio : " + x);
        return x;
    }

}
