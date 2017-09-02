/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T57OrdenarArrayGiganteArrayList2 {

    private static ArrayList<Long> arrayL = new ArrayList();

    /**
     *
     * @return
     */
    public static long getNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        Long x = sc.nextLong();
        try {
            if (x <= 0) {
                while (x <= 0) {
                    System.out.println("Introduce un numero mayor que 0 ");
                    x = sc.nextLong();
                }
            }
        } catch (Exception e) {
            System.out.println("Mensaje : " + e.getMessage() + " Localizacion :  " + e.getLocalizedMessage());
        }
        return x;

    }

    /**
     *
     * @return
     */
    public static ArrayList<Long> setElementosArrayList() {

//        for (int i = 0; i < 100000; i++) {
        for (int i = 0; i < 10; i++) {
//            Long valorL = (long) (Math.random() * (1 + 2000000));
            Long valorL = (long) (Math.random() * (1 + 10));
            arrayL.add(valorL);
        }
        return arrayL;
    }

    public static void getOrdenar() {
        Collections.sort(arrayL);
    }

    public static void setVerArray() {

        for (Long arrayL1 : arrayL) {
            System.out.println(arrayL1);
        }
    }

    public static void setSustuirElemento() {

        long v1 = 0;
        int incremento = 0;

        System.out.println(arrayL);

        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < arrayL.size(); i1++) {
                for (int i2 = i1 + 1; i2 < arrayL.size(); i2++) {
                    if (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0) {
                        do {
                            int p1 = arrayL.indexOf(arrayL.get(i1));
                            arrayL.set(p1, (long) ((Math.random() * (1 + 10) + 1)));
                            int p2 = arrayL.indexOf(arrayL.get(i2));
                            arrayL.set(p2, (long) ((Math.random() * (1 + 10) + 1)));

                            System.out.printf(" j %d k %d \n", arrayL.get(i1), arrayL.get(i2));
                            if (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0) {
                                arrayL.set(i2, (long) ((Math.random() * (1 + 10) + 1)));
                            }
                        } while (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0);
                    }

                }
            }
        }

        Collections.sort(arrayL);
        System.out.println(arrayL);
    }

    public static void setBuscarElemento(long num) {
        int x = arrayL.indexOf(num);
        if (x == -1) {
            System.out.println("El elemento no existe : " + x);
        } else {
            System.out.println("El elemento existe en la posicion : " + x);
        }
    }

    public static void setEjecutar() {
        setElementosArrayList();
        getOrdenar();
        setVerArray();
        setBuscarElemento(getNumero());
    }

    public static void main(String[] args) {

        setElementosArrayList();
        getOrdenar();
//        setVerArray();
        setSustuirElemento();
    }
}
