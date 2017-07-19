/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Portatil_Bot
 */
public class t3_2raiz_cuadrada {

    private static int num;

    public static double setNum() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    public static void raizCuadrada() {
        System.out.println("Intro un numero");
        double raiz_cuadrada = Math.sqrt(setNum());
        System.out.println("Raiz Cuadrada : " + raiz_cuadrada);
    }

    public static void main(String[] args) {
        raizCuadrada();
    }
}
