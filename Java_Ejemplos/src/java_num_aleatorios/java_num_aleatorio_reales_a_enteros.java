/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_num_aleatorios;

/**
 *
 * @author Portatil_Bot
 */
public class java_num_aleatorio_reales_a_enteros {

    public static void main(String[] args) {

        System.out.println("---- (Math.random() * (0.9)) * 5) ----");
        for (int i = 0; i < 10; i++) {
            System.out.println((double) (Math.random() * (0.9)) * 5);
        }
        System.out.println("----- (Math.random() * (0.5)) * 5) -----");
        for (int i = 0; i < 10; i++) {
            System.out.println((double) (Math.random() * (0.5)) * 5);
        }
        System.out.println("----- (Math.random() * (0.1)) * 5) -----");
        for (int i = 0; i < 10; i++) {
            System.out.println((double) (Math.random() * (0.1)) * 5);
        }
    }

}
