/**
 * @created on : 29-jul-2017, 14:51:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class MathPrimo1Parte {

    private static int c = 0;

    public static void main(String[] args) {

//        CON ESTO CONSIGO SABER QUE UN NUMERO DIVIDIDO ENTRE 3 
//          TIENE DE COCIENTE < 1 y RESTO == 0 
//          - SE USA PARA ELIMINAR TODOS LOS VALORES  "COMO FILTRO"
        System.out.println("valor de " + 2);
        for (int i = 3; i < 11; i = i + 2) {
            System.out.println("valor de " + i);
        }
        for (int i = 1; i < 100; i++) {
            if (i / 2 >= 1 && i % 2 != 0) { // obtener todos los impares
                if ((i / 3 >= 1) && (i % 3 != 0)) {
                    if ((i / 5 >= 1) && (i % 5 != 0)) {
                        if ((i / 7 >= 1) && (i % 7 != 0)) {
                            if ((i / 11 >= 1) && (i % 11 != 0)) {
                                System.out.println("valor de " + i);
                            }
                        }
                    }
                }
            }
        }

    }
}
