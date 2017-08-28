/**
 * @created on : 28-ago-2017, 13:21:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.BusquedaSecuencial;

/**
 * Busquedas que se realizan pocas veces
 *
 * Array Pequeños
 *
 * @author Portatil_Bot
 */
public class T5BusquedaSecuencial {

//                          0   1    2   3   4   5   6   7   8   9
    static int[] vector = {90, 50, 100, 70, 80, 60, 20, 10, 30, 40};

    /**
     * Busqueda secuencial
     *
     * Buscamos el elemento 'dato' en el array 'v'
     *
     * Devolvemos la posicion donde esta 'dato' o si no lo encontramos -1
     *
     * @param v
     * @param dato
     * @return x
     */
    static int buscarSecuencial(int v[], int dato) {
        int i = 0;
        int x = -1;
//              0 < 9                 -1 == -1
//              1 < 9                  1 == -1
        while ((i < vector.length) && (x == -1)) {
//             90[0] == 50 // no entra
//             50[1] == 50 // entra
            if (v[i] == dato) {
//              0 = 0
//              1 = 1
                x = i;
            }
//          1  
            i++;
        }
//             1
        return x;
    }

    public static void main(String[] args) {

        int x = buscarSecuencial(vector, 80);
        System.out.println("Posicion : " + x);
    }

}
