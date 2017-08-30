/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

public class T56OrdenarArrayGigante {

    private static long[] arrayM = new long[1000000];
//    private static long[] arrayM = new long[5];
    private static long y;

    private static long setNumeroAleatorio() {
        long valor = (long) (Math.random() * (1 + 2000000) + 1);
//        long valor = (long) (Math.random() * (1 + 10) + 1);
        return valor;
    }

    private static void setArrayMillon() {
        System.out.println("\n------ INICIO -------");
        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = setNumeroAleatorio();
            System.out.printf(" \u001B[35m " + arrayM[i]);
        }
        System.out.println("");
    }

    private static void getResultado() {
        for (int i = 0; i < arrayM.length; i++) {
            System.out.printf(" \u001B[32m " + arrayM[i]);
        }
        System.out.println("\n........FIN...........");
    }

    private static void getCompararArrayMillon() {
        setArrayMillon();
        for (int i = 0; i < arrayM.length; i++) {
            for (int j = i + 1; j < arrayM.length; j++) {
                while (arrayM[i] == arrayM[j]) {
                    if (arrayM[i] == arrayM[j]) {
                        y = (long) (Math.random() * (1 + 10) + 1);
                        System.out.println("♦ Nuevo valor para i : " + y);
                        do {
                            if ((arrayM[i] != y) && (arrayM[j] != y)) {
                                arrayM[j] = y;
                            } else {
                                arrayM[i] = (long) (Math.random() * (1 + 10) + 1);
                            }
                        } while (arrayM[i] == y && arrayM[j] == y);
//                        System.out.println("♦♦♦ Nuevo valor para i : " + y);
                    }
                }
            }
        }
        getResultado();
    }

    public static void main(String[] args) {
        getCompararArrayMillon();
    }

}
