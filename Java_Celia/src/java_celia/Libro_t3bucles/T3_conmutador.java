/**
 * @created on : 18-jul-2017, 0:35:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles;

import java.util.Scanner;

public class T3_conmutador {

    public static void main(String[] args) {

        int n, suma;
        boolean terminar;
        Scanner sc = new Scanner(System.in);
//        numero cogido por teclado
        n = 0;
//        acumulador
        suma = 0;
//        conmutador
        terminar = false;

        while (terminar == false) {
            System.out.println("Intro un numero : negativo para terminar");
            n = sc.nextInt();
            if (n >= 0) { // n es mayor 
                suma = suma + n; //hace la suma
            } else {   
                terminar = true; //cambia la condicion y sale
            }
        }
        System.out.println("Suma total : " + suma);
    }

}
