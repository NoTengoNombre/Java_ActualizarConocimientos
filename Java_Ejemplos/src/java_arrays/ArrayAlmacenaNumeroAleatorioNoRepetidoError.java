/**
 * @created on : 04-sep-2017, 21:26:00
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAlmacenaNumeroAleatorioNoRepetidoError {

//                                  0  1  2  3  4
    private static int[] numeros = {1, 2, 3, 4, 5};
    private static int[] almacenar = {0, 0, 0, 0, 0};

    public static int getNumero() {
        int x = (int) (Math.random() * (1 + numeros.length - 1));
        return x;
    }

    public static void setComprobarNumeroDelArray() {
        int n = getNumero();
        System.out.println(n);
        for (int i = 0; i < numeros.length; i++) {

        }

    }

    public static void setComprobarNumeroError() {
//      Genera un numero
        int x = getNumero();
        System.out.println("El valor de 'x' es : " + x);
        int i = 0;
        while (almacenar[i] == 0) { // compruebo 
            System.out.println("Valor de : " + i);
//         SI :       1[0] == 2             
            if (numeros[i] == x) {
                System.out.println("El valor de " + x + " esta en la posicion : " + numeros[i]);
//              SI :        1[0] == 1           
                if (almacenar[i] == x) {
                    System.out.println("El nuevo numero generado " + x);
                    do {
//                      Genera otro numero
                        x = getNumero();
                        System.out.println("Genera un nuevo numero : " + x);
                    } while (almacenar[i] == x);
                } else {
                    almacenar[i] = x;
                }
            } else {
                System.out.println("Posicion del valor es : " + x);
                almacenar[i] = x;
            }
            i++;
        }
    }

    public static void main(String[] args) {

        setComprobarNumeroDelArray();
    }
}
