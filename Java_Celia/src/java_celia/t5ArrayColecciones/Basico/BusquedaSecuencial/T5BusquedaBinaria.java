/**
 * @created on : 28-ago-2017, 13:21:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.BusquedaSecuencial;

/**
 * Busqueda realiza muchas veces
 *
 * Arrays gran tamaño
 *
 * EL ARRAY TIENE QUE ESTAR "Ordenado" con algun metodo de ordenacion
 *
 * @author Portatil_Bot
 */
public class T5BusquedaBinaria {

//                                0   1    2   3   4   5   6   7   8   9
    static int[] VECTOR = {90, 50, 100, 70, 80, 60, 20, 10, 30, 40};

    static void setOrdenarArray() {

        int minimo;
        int posicion_minima;
//                      0 < 9
        for (int i = 0; i < VECTOR.length; i++) {
//            90         90[0]
            minimo = VECTOR[i];
//             0              0
            posicion_minima = i;

//                   1 = 0  1 < 9              1->2
//                   0 = 0  0 < 9              0->1
            for (int j = i; j < VECTOR.length; j++) {
//                     50 [1] <   90
//                     90 [0] <   90
                if (VECTOR[j] < minimo) {
//                     50  =     50[1]
                    minimo = VECTOR[j];
//                       [1]        =[1]
                    posicion_minima = j;
                }
            }

//            INTERCAMBIO DE VALORES 
//               90        [1]      =     90[0]
            VECTOR[posicion_minima] = VECTOR[i];
//              50[0] =   50
            VECTOR[i] = minimo;
        }
    }

    /**
     * Busqueda binaria
     *
     * Buscamos el elemento 'busc' en el array 'v' que debe estar ordenado
     *
     * Devolvemos la posicion donde esta 'busc' o si no lo encontramos '-1'
     *
     * @param v
     * @param busc 60
     * @return encontrado
     */
    static int buscar_binario(int v[], int busc) {

        int LONGITUD_array = VECTOR.length;

        int izq, der, mitad, encontrado;
//        Iniciamos una busqueda binaria
        encontrado = 0;
        izq = 0;
//       9  =    10          - 1
        der = LONGITUD_array - 1;
//                0 <  8       &&      0      == 0
        while ((izq < der - 1) && (encontrado == 0)) { // Calculamos la posicion 'mitad'
//             4  =   0 +  ( 9  -  0)  / 2
            mitad = izq + ((der - izq) / 2);
//              80[4]    ==  60
            if (v[mitad] == busc) { // Lo hemos encontrado
                encontrado = 1;
            }
//              80[4]    >  60
            if (v[mitad] > busc) { // Seguimos buscando en la mitad izquierda
//               4  =   4
                der = mitad;
            }
//              80[4]    <  60
            if (v[mitad] < busc) { // Seguimos buscando en la mitad derecha
//               4  =   4
                izq = mitad;
            }
//                  1      == 1
            if (encontrado == 1) {
//                       4
                return mitad;
            } else {
                return -1;
            }
        }
        return encontrado;
    }

    public static void main(String[] args) {

        setOrdenarArray();

        for (int i = 0; i < VECTOR.length; i++) {
            System.out.println("Ordenado : " + VECTOR[i]);
        }

        int x = buscar_binario(VECTOR, 50);
        System.out.println(x);
    }

}
