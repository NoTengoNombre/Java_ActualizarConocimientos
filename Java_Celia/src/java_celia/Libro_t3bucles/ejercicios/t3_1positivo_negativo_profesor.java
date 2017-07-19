/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Portatil_Bot
 */
public class t3_1positivo_negativo_profesor {

    public static int setNum() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int num = Integer.parseInt(br.readLine());
        return num;
    }

    public static void getNum() throws IOException {
        int n = setNum();
        System.out.print("Escriba un número entero: ");
        if (n > 0) {
            System.out.println("El número " + n + " es POSITIVO");
        }
        if (n < 0) {
            System.out.println("El número " + n + " es NEGATIVO");
        }
    }

    public static void main(String[] args) throws IOException {
        getNum();
    }

}
