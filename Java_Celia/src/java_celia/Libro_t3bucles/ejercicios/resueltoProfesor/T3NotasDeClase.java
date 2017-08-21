/**
 * @created on : 21-ago-2017, 12:17:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Scanner;

public class T3NotasDeClase {

    private static final Scanner SC = new Scanner(System.in);

    private int numSuspensos;
    private int numAprobados;

    public T3NotasDeClase() {
        this.numSuspensos = 0;
        this.numAprobados = 0;
    }

    public void setAddNota(int n) {
        if (n >= 5) {
            numAprobados++;
        }
        if (n <= 4) {
            numSuspensos++;
        }
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public int getNumAprobados() {
        return numAprobados;
    }

    public static void main(String[] args) {
        int i, n = 0;
        T3NotasDeClase notas = new T3NotasDeClase();

        for (i = 0; i <= 4; i++) {
            do {
                System.out.println("Intro una calificacion : ");
//                n = Integer.parseInt(System.console().readLine());
                n = SC.nextInt();
                if ((n < 0) || (n > 10)) {
                    System.out.println("Solo numeros de 0 a 10");
                }
            } while ((n < 0) || (n > 10));
            notas.setAddNota(n);
        }
        System.out.println("Numero de suspensos : " + notas.getNumSuspensos());
        System.out.println("Numero de aprobados : " + notas.getNumAprobados());

    }

}
