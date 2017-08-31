/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.Scanner;

public class T57OrdenarArrayGigante {

    private static long[] arrayM = new long[1000000];
//    private static long[] arrayM = new long[10];
//    private static long[] arrayM = {1, 3, 5, 6, 7, 8, 9, 11};

    /**
     *
     * @return
     */
    public static long getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        long x = sc.nextLong();
        try {
            if (x <= 0) {
                while (x <= 0) {
                    System.out.println("Introduce un numero mayor que 0 ");
                    x = sc.nextInt();
                }
            }
        } catch (Exception e) {
            System.out.println("Mensaje : " + e.getMessage() + " Localizacion :  " + e.getLocalizedMessage());
        }
        return x;

    }

    /**
     *
     */
    public static void setArrayMillon() {
        System.out.println("\n------ INICIO -------");
        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = (long) (Math.random() * (1 + 2000000) + 1);
        }
    }

    /**
     *
     * @param izquierda
     * @param derecha
     */
    public static void ordenaArray(int izquierda, int derecha) {
        int izq, der, mitad, numero;

        izq = izquierda;
        der = derecha;

        mitad = (int) arrayM[(izquierda + derecha) / 2];

        do {
            while (arrayM[izq] < mitad) {
                izq++;
            }
            while (mitad < arrayM[der]) {
                der--;
            }
            if (izq <= der) {
                numero = (int) arrayM[izq];
                arrayM[izq] = arrayM[der];
                arrayM[der] = numero;
                izq++;
                der--;
            }
        } while (izq <= der);

        numero = (int) arrayM[izq];
        arrayM[izq] = arrayM[derecha];
        arrayM[derecha] = numero;

        if (izquierda < der) {
            ordenaArray(izquierda, der);
        }
        if (izq < derecha) {
            ordenaArray(izq, derecha);
        }
    }

    /**
     * http://usandojava.blogspot.com.es/2012/11/busqueda-binaria-en-un-arreglo-usando.html
     *
     * @param vector
     * @param dato
     * @return
     */
    public static int setBusquedaBinaria2(long[] vector, int dato) {
        int longitud = vector.length;
        int inferior = 0;
        int superior = longitud - 1;
        int centro;
//                   0  <= 10
        while (inferior <= superior) {
//             5   =             ( 0 +  10  / 2)   
            centro = (inferior + superior) / 2;
//                        5        6
            if (vector[centro] == dato) {
//                        5
                return centro;
//                       6              5
            } else if (dato < vector[centro]) {
//                    4  =    5   - 1
                superior = centro - 1;
            } else {
//                    6  =    5   + 1
                inferior = centro + 1;
            }
        }
        return -1;
    }

    public static void getArray() {
        for (int i = 0; i < arrayM.length; i++) {
//            System.out.printf(" \u001B[32m %d \u001B[32m %d \u001B[32m %d \u001B[32m %d \n", arrayM[i], arrayM[i], arrayM[i], arrayM[i]);
        }
        System.out.println("\n");
    }

    public static void setPlay() {
        setArrayMillon();
        ordenaArray(0, arrayM.length - 1);
        getArray();
        long x = setBusquedaBinaria2(arrayM, (int) getNumero());
        System.out.println(x);
    }

    public static void main(String[] args) {

        setPlay();
    }
}
