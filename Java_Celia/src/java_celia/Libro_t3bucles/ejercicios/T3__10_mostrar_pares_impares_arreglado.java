/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__10_mostrar_pares_impares_arreglado {

    /**
     *
     * @param a
     * @param b
     * @param paresOImpares
     */
    public void mostrar(int a, int b, String paresOImpares) {
        if (paresOImpares.equals("pares")) {
            Pares p = new Pares();
            p.mostrarPares(a, b);
        }
        if (paresOImpares.equals("impares")) {
            Impares p = new Impares();
            p.mostrarImpares(a, b);
        }
    }
}

class Pares {

    public static int a;
    public static int b;

    public static int leerNumero() {
        int n;
        System.out.println("Escribe un numero entero : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        return n;
    }

    /**
     *
     * @param a
     * @param b
     */
    public void mostrarPares(int a, int b) {
        int i;
        int inicio;
        int fin;

        if (a < b) {
            inicio = a;
            fin = b;
        } else {
            inicio = b;
            fin = a;
        }
        if (inicio % 2 != 0) {
            inicio++;
        }
        i = inicio;
        while (i <= fin) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

class Impares {

    public static int a;
    public static int b;

    public void mostrarImpares(int a, int b) {
        int i;
        MayorMenorMediano mmm = new MayorMenorMediano(a, b, b);
        int inicio = mmm.getMenor();
        int fin = mmm.getMayor();

        if (inicio % 2 == 0) {
            i = inicio + 1;
        } else {
            i = inicio;
        }
        while (i <= fin) {
            System.out.println(i);
            i = i + 2;
        }
    }
}

class MayorMenorMediano {

    private int x, y, z;

//    Constructor sin parametros - Asigna valores 0 a x , y , z
    public MayorMenorMediano() {
        x = 0;
        y = 0;
        z = 0;
    }

//    Constructor parametrizado para establecer valor de x , y , z
    public MayorMenorMediano(int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.z = c;
    }

//    Asigna valores a los 3 numeros
    public void setNumeros(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    /**
     * @return devuelve el menor de los 3 numeros
     */
    public int getMenor() {
        int menor = 0;
        if ((x <= y) && (x <= z)) {
            menor = x;
        }
        if ((y <= x) && (y <= z)) {
            menor = y;
        }
        if ((z <= x) && (z <= y)) {
            menor = y;
        }
        return menor;
    }

    /**
     *
     * @return devuelve el mediano de los 3 numeros
     */
    public int getMediano() {
        int mediano = 0;

        if ((x >= y) && (x <= z) || ((x >= z) && (x <= y))) {
            mediano = x;
        }
        if ((y >= x) && (y <= z) || ((y >= z) && (y <= x))) {
            mediano = y;
        }
        if ((z >= x) && (z <= y) || ((z >= y) && (z <= x))) {
            mediano = z;
        }
        return mediano;
    }

    /**
     *
     * @return devuelve el mayor de los 3 numeros
     */
    public int getMayor() {
        int mayor = 0;
        if ((x >= y) && (x >= z)) {
            mayor = x;
        }
        if ((y >= x) && (y >= z)) {
            mayor = y;
        }
        if ((z >= x) && (z >= y)) {
            mayor = z;
        }
        return mayor;
    }

    public static void main(String[] args) {

        T3__10_mostrar_pares_impares_arreglado t = new T3__10_mostrar_pares_impares_arreglado();
        t.mostrar(1, 100, "pares");

    }
}
