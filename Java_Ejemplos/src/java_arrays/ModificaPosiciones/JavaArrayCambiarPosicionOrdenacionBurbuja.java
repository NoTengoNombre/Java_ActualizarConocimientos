/**
 * @created on : 06-sep-2017, 23:40:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.ModificaPosiciones;

/**
 * 
 * Ordenacion burbuja
 *
 * @author Portatil_Bot
 */
public class JavaArrayCambiarPosicionOrdenacionBurbuja {

    public static void main(String[] args) {
        int aux;

//                  0   1   2   3   4   5   6   7
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88};

        for (int j = 0; j < 10; j++) {
            for (int i = j; i < a.length - 1; i++) {
//              11[0]< 22[1]
                if (a[i] < a[i + 1]) {
//               22  = 22[1]
                    aux = a[i + 1];
//              11[1]    = 11[0]
                    a[i + 1] = a[i];
//              22[0] = 22
                    a[i] = aux;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        int[] a1 = {911, 822, 733, 644, 555, 466, 377, 288};

        for (int j = 0; j < a1.length; j++) {
            for (int i = 0; i < a1.length - j - 1; i++) {
                if (a1[i + 1] < a1[i]) {
                    int aux1 = a1[i + 1];
                    a1[i + 1] = a1[i];
                    a1[i] = aux1;
                }
            }
        }

        System.out.println("\n------------------------------");
        
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println("");
    }
}
