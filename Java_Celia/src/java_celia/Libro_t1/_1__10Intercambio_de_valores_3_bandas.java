/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t1;

/**
 *
 * @author Portatil_Bot
 */
public class _1__10Intercambio_de_valores_3_bandas {

    public static void main(String[] args) {

        byte a = 2;
        byte b = 7;
        byte c = 4;
        byte aux;

        System.out.println(" soy a " + a);
        System.out.println(" soy b " + b);
        System.out.println(" soy c " + c);

        aux = a;
        a = c;
        c = b;
        b = aux;

        System.out.println("• b tome el valor de a");
        System.out.println("• c tome el valor de b");
        System.out.println("• a tome el valor de c");

        System.out.println(" soy a " + a);
        System.out.println(" soy b " + b);
        System.out.println(" soy c " + c);

    }
}
