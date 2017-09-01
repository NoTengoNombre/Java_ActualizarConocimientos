/**
 * @created on : 30-ago-2017, 18:14:29
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T57OrdenarArrayGiganteArrayList {

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

    public static ArrayList<Long> setElementosArrayList() {

        for (int i = 0; i < 100; i++) {
//        for (int i = 0; i < 100000; i++) {
//        for (int i = 0; i < 10; i++) {
            Long valorL = (long) (Math.random() * (1 + 2000));
//            Long valorL = (long) (Math.random() * (1 + 2000000));
//            Long valorL = (long) (Math.random() * (1 + 10));
            arrayL.add(valorL);
        }
        return arrayL;
    }

    public static void setVerArray() {
        System.out.println("---------------------- Sin Ordenar --------------------");
        for (Long arrayL1 : arrayL) {
            System.out.print(arrayL1 + " | ");
        }
        System.out.println("");
    }

    public static void setSustuirElemento() {
        System.out.println("---------------------- Ordenado --------------------");
        System.out.println(arrayL);
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < arrayL.size(); i1++) {
                for (int i2 = i1 + 1; i2 < arrayL.size(); i2++) {
                    if (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0) {
//                        System.out.println("indice A : " + i1 + " --> " + arrayL.get(i1) + " |-| indice B : " + i2 + " --> " + arrayL.get(i2));
                        System.out.println("------------------------------------------");
                        System.out.printf(" j '%d' %d k '%d' %d \n", i1, arrayL.get(i1), i2, arrayL.get(i2));
                        do {
//                            arrayL.set(i1, (long) ((Math.random() * (1 + 10) + 1)));
                            arrayL.set(i1, (long) ((Math.random() * (1 + 2000) + 1)));
                            if (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0) {
//                                arrayL.set(i2, (long) ((Math.random() * (1 + 10) + 1)));
                                arrayL.set(i2, (long) ((Math.random() * (1 + 2000) + 1)));
                            }
                        } while (arrayL.get(i1).compareTo(arrayL.get(i2)) == 0);
                    }
                }
            }
        }
        setOrdenarElemento();
        System.out.println(arrayL);
    }

    public static void setOrdenarElemento() {
        Collections.sort(arrayL);
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
        setVerArray();
        setSustuirElemento();
        setOrdenarElemento();
        setBuscarElemento(getNumero());
    }

    public static void main(String[] args) {

        setEjecutar();
    }
}
