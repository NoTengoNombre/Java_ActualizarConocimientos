/**
 * @created on : 02-sep-2017, 20:21:31
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

/**
 * Algoritmo para abrir un hueco en el array e insertar un numero entre el
 * numero mayor y menor que el insertado
 *
 * Ademas elimina el último numero
 *
 * @author Portatil_Bot
 */
public class JavaArrayInsertaUnNumeroEliminaElUltimo {

    public static void main(String[] args) {
// INDICES          0   1  2    3   4  5   6   7   8
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99}; // LONGITUD 9

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();

        int num = 50;
        int varIzquierda = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < num) {
                varIzquierda++;
            }
        }

        System.out.println("varI : " + varIzquierda);

        int varDerecha = 0;

        for (int d = array.length - 1; d > 0; d--) {
            if (num < array[d]) {
                varDerecha++;
            }
        }
        
        System.out.println("varD : " + varDerecha);

        for (int i = array.length - 1; i > 0; i--) {
            if (array[i - 1] > num) {
                array[i] = array[i - 1];
                System.out.println("♦ valor abrir hueco por la IZQUIERDA : " + array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
// Si el numero es menor que el 1º numero - lo asigno directamente            
            if (num <= array[0]) {
                array[0] = num;
            }

            if (varIzquierda > i) {
                array[varIzquierda] = num;
            }
            
            System.out.print(array[i] + " ");
        }

        System.out.println("");
    }

}
