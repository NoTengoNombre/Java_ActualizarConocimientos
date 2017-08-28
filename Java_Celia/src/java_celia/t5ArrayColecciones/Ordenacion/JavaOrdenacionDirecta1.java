/**
 * @created on : 28-ago-2017, 9:35:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Ordenacion;

public class JavaOrdenacionDirecta1 {

    public static void main(String[] args) {

//            0
        int minimo;
//                       0   1   2   3   4   5   6   7   8 -> longitud 9
        int[] vector = {14, 92, 85, 43, 53, 21, 12, 03, 45};
//                      0 < 9
        for (int i = 0; i < vector.length; i++) {
//            GUARDAMOS EL 1º VALOR DE LA POSICION 0
//            14   =  v14  [0]
            minimo = vector[i];
//            GUARDAMOS LA POSICION 0
//                 0   = 0
            int maximo = i;
//                   0 = 0  6 < 9
            for (int j = i; j < vector.length; j++) {
//SI POSICION ADELANTADA es MENOR QUE LA 1º
//                     12 [6] <   14
                if (vector[j] < minimo) {
//                    GUARDAMOS VALOR E INTERCAMBIAMOS
//                    12   =    12 [6]
                    minimo = vector[j];
//                    GUARDAMOS 2ºPOSICION EN EL MENOR INDICE
//                     6   = 6
                    maximo = j;
                }
//                INTERCAMBAMOS VALORES 
//                EN LA POSICION ADELANTADA GUARDAMOS EL MAYOR VALOR 
//                 v14  [6]    =   v14 [0]
                vector[maximo] = vector[i];
//                INTERCAMBIAMOS VALORES 
//                EN LA 1º POSICION GUARDAMOS EL MENOR VALOR
//                v12 [0] =  v12
                vector[i] = minimo;
            }
        }

    }
}
