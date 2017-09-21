/**
 * @created on : 19-sep-2017, 18:22:49
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.llenarPosicionNoElegirMismaPosicion;

/**
 * He creado un metodo que cuando se invoca avanza 1 posicion el indice y guarda
 * su valor
 *
 * Busco no volver a la anterior posicion del array una vez pasado por ese
 * indice
 *
 * @author Portatil_Bot
 */
public class JavallenarArrayNoElegirMismaPosicion {

//  int 'i' static para que nunca sea la misma posicion cuando se reinicie
    private static int i;
    private static final int[] ARRAY = {11, 22, 33, 44, 55, 66, 77, 88};
    private static final int[] CONTENEDOR = new int[ARRAY.length];

    /**
     * En cada llamada incrementar el valor de la variable static 'i' para que
     * no se pierda
     *
     * @return
     */
    public static int incrementarIndiceUnaVezEnCadaInvocacion() {
        int numeroDevuelto = 0;
        System.out.println(i + " Longitud del array : " + ARRAY.length);
        boolean stop = true;

        for (int c = i; c < ARRAY.length && (stop == true); c++) {
            System.out.println("• Entra el valor de la i : " + i);
            System.out.println("♣ Valor de ii : " + ARRAY[c] + " ");
            if (c < ARRAY.length) {
                numeroDevuelto = ARRAY[i];
                i++;
                stop = false;
            }
        }
        System.out.println("♦ Sale el valor de la i : " + i);
        System.out.println();
        return numeroDevuelto;
    }

    /**
     * Se ejecuta 1 vez en cada invocación , incrementando el valor del indice y
     * volviendo a el una vez pasado
     */
    public static void setLanzarMetodo() {
        CONTENEDOR[i] = incrementarIndiceUnaVezEnCadaInvocacion();
    }

    /**
     * Recorre el indice hasta la longitud del array
     */
    public static void setLanzarMetodo2() {
        for (int indice = 0; indice < ARRAY.length; indice++) {
            CONTENEDOR[indice] = incrementarIndiceUnaVezEnCadaInvocacion();
        }
    }

    public static void main(String[] args) {

        setLanzarMetodo();
        System.out.println("valor de i : " + i);
        setLanzarMetodo();
        System.out.println("valor de i : " + i);
        setLanzarMetodo();
        System.out.println("valor de i : " + i);
        setLanzarMetodo();

        System.out.println("Indice avanzados dentro del array ");
        for (int j = 0; j < CONTENEDOR.length; j++) {
            System.out.print(CONTENEDOR[j] + " ");
        }
        System.out.println("\n");
    }
}
