/**
 * @created on : 31-ago-2017, 13:11:51
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos_busqueda;

public class JavaBusquedaBinaria {

    /**
     * Libro
     *
     * @param v
     * @param busc
     * @return
     */
    public static int getBusquedaBinaria(long v[], int busc) {
        int mitad = 0;
        int encontrado = 0;
        int izq, der;
        encontrado = 0;

//        Empieza por la izquierda
        izq = 0;
//        Empieza por la derecha
        der = v.length - 1;

//      Recorre de izq a derecha hasta el final -1 
        while ((izq < der - 1) && (encontrado == 0)) {
//            9      0  +    19    0    / 2
            mitad = izq + ((der - izq) / 2);
//                   5[9]     ==  13
            if (v[mitad] == busc) {
                encontrado = 1;
            }
//                   5[9]     >  13
            if (v[mitad] > busc) {
//               9  <- 9
                der = mitad;
            }
//                   5[9]     <  13
            if (v[mitad] < busc) {
//               9 <- 9
                izq = mitad;
            }
//                  1      == 1
            if (encontrado == 1) {
//                       9
                return mitad;
            } else {
                mitad = -1;
            }
        }
        return -1;
    }
}
