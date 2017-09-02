/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_arrays;

/**
 *
 * @author Portatil_Bot
 */
public class JavaArrayUsarClaseSystemCopyParaCopiarArrays {

    public static void main(String[] args) {

        int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int auxilar[] = new int[v.length];
        int auxilar2[] = new int[v.length];

//                       original
//                       |     recibe datos     
        System.arraycopy(v, 0, auxilar, 0, v.length);

        for (int i : auxilar) {
            System.out.println(i);
        }

        System.out.println("-----------------");
//                       array orignal
//                         |     Indico indice de la posicion '0' comenzar a copiar datos del array original
//                         |      |  array que recibe datos
//                         |      |   |        indice comienza a grabar datos en el 2 array
//                         |      |   |        |  cuantos datos quiero copiar del array original sobre copia
        System.arraycopy(auxilar, 0, auxilar2, 5, 1);

        for (int i : auxilar2) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        System.arraycopy(auxilar, 0, auxilar2, 5, 2);

        for (int i : auxilar2) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        System.arraycopy(auxilar, 0, auxilar2, 5, 3);

        for (int i : auxilar2) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        System.arraycopy(auxilar, 0, auxilar2, 5, 4);

        for (int i : auxilar2) {
            System.out.println(i);
        }

        System.out.println("-----------------");
//Cuando la longitud es '4' 
        System.arraycopy(auxilar, 6, auxilar2, 1, 3);

        for (int i : auxilar2) {
            System.out.println(i);
        }

    }

}
