/**
 * @created on : 21-ago-2017, 0:09:40
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3Impares {

    private static final Scanner SC = new Scanner(System.in);

    public int leerNumero() {
        int n;
        System.out.println("Escribe un numero entero : ");
//        n = Integer.parseInt(System.console().readLine());
        n = SC.nextInt();
        return n;
    }

    /**
     * Si los metodos de instancia son invocados dentro de la misma clase
     * entonces no necesitan objetos
     *
     * @param a
     * @param b
     * @return
     */
    public int getMenor(int a, int b) {
        int menor;
//           1    2      2   1
        if ((a <= b) && (b > a)) {
            menor = a;
        } else {
            menor = b;
        }
        return menor;
    }

    /**
     * Si los metodos de instancia son invocados dentro de la misma clase
     * entonces no necesitan objetos
     *
     * @param a
     * @param b
     * @return
     */
    public int getMayor(int a, int b) {
        int mayor;
//           2    1      1   2
        if ((b <= a) || (a > b)) {
            mayor = a;
        } else {
            mayor = b;
        }
        return mayor;
    }

    /**
     * Muestra los numeros impares por consola
     *
     * @param a
     * @param b
     * @param c
     */
    public void mostrarImpares(int a, int b) {
        int i;
        int inicio = getMenor(a, b);
        int fin = getMayor(a, b);

//        Si es par suma 1 
        if (inicio % 2 == 0) {
            i = inicio + 1;
//        SiNo es impar 
        } else {
            i = inicio;
        }

//        Mostramos los impares a partir de i
        while (i <= fin) {
            i += 2;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        T3Impares impares = new T3Impares();
//        System.out.println("El mayor : " + t3.getMayor(1, 2));
//        System.out.println("El menor : " + t3.getMenor(1, 2));
        impares.mostrarImpares(impares.leerNumero(), impares.leerNumero());

    }

}
