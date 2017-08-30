/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class T56OrdenarArrayGiganteConErrores {

//    private static long[] arrayM = new long[1000000];
    private static long[] arrayM = new long[5];
    private static long x;
    private static long y;

    private static long setNumeroAleatorio() {
//        long x = (long) (Math.random() * (1 + 2000000) + 1);
        x = (long) (Math.random() * (1 + 10) + 1);
        return x;
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
//                       1[0]         1[3]
                if (arrayM[i] == arrayM[j]) {
                    y = (long) (Math.random() * (1 + 10) + 1);
//                                                                 3 
                    System.out.println("♦ Nuevo valor para i : " + y);
                    do {
                        do {
//                                1[0] != 3           1[3] != 3
                            if ((arrayM[i] != y) && (arrayM[j] != y)) {
//                               3[0] = 3
                                arrayM[j] = y;
//                      1[0] == 3          
                            } else {
                                arrayM[j] = (long) (Math.random() * (1 + 10) + 1);
                            }
//                               1            1   and        1     1           1     1
                        } while (arrayM[i] == y && arrayM[j] == y);
                        System.out.println("♦♦♦ Nuevo valor para i : " + y);
                    } while ((arrayM[i] == arrayM[j]));
                }
            }
        }
        getResultado();
    }

    public static void main(String[] args) {
//        setArrayMillon();
        for (int i = 0; i < 12; i++) {
            getCompararArrayMillon();
        }
    }

}
