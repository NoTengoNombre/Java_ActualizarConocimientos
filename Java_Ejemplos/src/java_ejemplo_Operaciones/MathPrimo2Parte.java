/**
 * @created on : 29-jul-2017, 14:51:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

public class MathPrimo2Parte {

    public static void main(String[] args) {

//        CON ESTO CONSIGO SABER QUE UN NUMERO DIVIDIDO ENTRE 3 
//          TIENE DE COCIENTE < 1 y RESTO == 0 
//          - SE USA PARA ELIMINAR TODOS LOS VALORES  "COMO FILTRO"
        int n = 6;
        boolean v = (((n / 3) >= 2) && (n % 3 == 0));
        System.out.println("Valor : " + v);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0 && i / 2 >= 1) { // elimina todos los pares
                if ((i / 3 >= 1) && (i % 3 != 0)) {
                    if ((i / 5 >= 1) && (i % 5 != 0)) {
                        if ((i / 7 >= 1) && (i % 7 != 0)) {
//                            if ((i / 11 >= 1) && (i % 11 != 0)) {
//                                if ((i / 13 >= 1) && (i % 13 != 0)) {
                            System.out.println("El valor de " + i);
                        }
                    }
                }
            }
        }

//        for (int i = 0; i < 20; i++) {
//            double v2 = i % 3;
//            System.out.println(i + " - " + v2);
//        }
    }
}
