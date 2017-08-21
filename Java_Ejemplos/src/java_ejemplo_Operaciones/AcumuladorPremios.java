/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_ejemplo_Operaciones;

/**
 *
 * @author Portatil_Bot
 */
public class AcumuladorPremios {

    public static void main(String[] args) {
        int dineroTotal = 0;
        int premio = 1;

        for (int i = 0; i < 10; i++) {
            dineroTotal = dineroTotal + premio;
            System.out.println("Dinero Disponible : " + dineroTotal);
        }
    }

}
