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
public class _1__11Generador_de_letras {

    public static char getLetras() {
        return (char) (Math.random() * 26 + 'a');
    }

    public static void main(String[] args) {

        do {
            System.out.println(getLetras());
        } while (getLetras() != 'a');

    }
}
