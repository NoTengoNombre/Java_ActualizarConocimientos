/**
 * @created on : 11-sep-2017, 12:45:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays.Char;

public class JavaxArrayManipularCaracteres {

    public static void main(String[] args) {
//                           0    1    2    
        char[] caPalabra = {'d', 'e', 'f'};
        //                  0    1    2    3    4    5    6    7
        char[] caCadena = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        int[] num = new int[caPalabra.length];

//        Sumar caracteres
//        System.out.println("Sumar caracteres : " + c[0] + c[1]);
//        System.out.println("NO SE PUEDEN Restar caracteres : " + c[2] - c[3]);
        int incremento = 0;
        boolean stop = true;

        for (int i = 0; i < caCadena.length; i++) {
            for (int j = i; j < caCadena.length && stop; j++) {
                if (caPalabra[i] == caCadena[j]) {
                    incremento++;
                    System.out.println(j + " " + caCadena[j]);
//                    Tengo la posicion de las letras en el array de carateres grande
                    num[i] = j;
                    if (incremento == 3) {
                        stop = false;
                    }
                }
            }
        }

        System.out.println("----------------");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("----------------");

        for (int i = 0; i < caPalabra.length; i++) { // 0,1,2
            for (int ii = i; ii < caCadena.length; ii++) { //0,1,2,3,4,5,6,7
                if (num[i] == ii) {
                    System.out.println(i + " : Entra " + ii);
                    caCadena[ii] = '*';
                }
            }
            System.out.println("--");
        }

        System.out.println("------------------");

        for (int r = 0; r < caCadena.length; r++) {
            System.out.print(caCadena[r]);
        }

        System.out.println("");

    }
}
