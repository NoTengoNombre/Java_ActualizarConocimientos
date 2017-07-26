/**
 * @created on : 25-jul-2017, 23:20:11
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 *
 * DecimalFormat f = new DecimalFormat("0.00"); System.out.println("Valores : "
 * + f.format(notas[i]));
 *
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.util.Scanner;

public class T3__17_NotasDeClase {

    private static double[] notas = null;
    private static int c_suspensos = 0;
    private static int c_aprobados = 0;
    private static int c = 0;

    /**
     * Para que funcione la captura por teclado de este valor, este metodo
     * dentro del bucle tiene que ser 'static' para que solo haya una copia del
     * elemento
     *
     * @return valor int
     */
    public static double getTeclado() {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        return valor;
    }

    public static double[] setNota() {

        notas = new double[30];

        for (int i = 0; i < notas.length; i++) {
            c = 1 + i;
            System.out.print("-> Introduce la " + c + "º nota : ");
            notas[i] = getTeclado();

            while (notas[i] > 10 || notas[i] < 1) {
                if (notas[i] > 10) {
                    System.out.println("-> El valor es invalido - Debe de ser menor que 10");
                } else if (notas[i] < 1) {
                    System.out.println("-> El valor es invalido - Debe de ser mayor que 1");
                }
                System.out.print("Introduce una nota aceptada nº" + c + " : ");
                notas[i] = getTeclado();
            }
        }
        System.out.println("-------------------");
        return notas;
    }

    public static int getNota() {
        int totalNotas = 0;
        int notaSuspensas = 0;
        int notaAprobadas = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("• Nota introducida : " + notas[i]);
            notaSuspensas = getSuspensos(i);
            notaAprobadas = getAprobados(i);
            totalNotas++;
        }
        System.out.println("----------------------------------------------");
        System.out.println("• Total de notas introducidas : " + totalNotas);
        System.out.println("♦ Total de notas suspensas : " + notaSuspensas);
        System.out.println("♠ Total de notas aprobadas : " + notaAprobadas);
        return totalNotas;
    }

    public static int getSuspensos(int i) {
        if (notas[i] < 5) {
            c_suspensos++;
            System.out.println("♦ Nota nº" + c_suspensos + " suspensa con : " + notas[i]);
        }
        return c_suspensos;
    }

    public static int getAprobados(int i) {
        if (notas[i] >= 5) {
            System.out.println("♠ Nota nº" + c_aprobados++ + " aprobada con : " + notas[i]);
        }
        return c_aprobados;
    }

    public static void main(String[] args) {

        setNota();
        getNota();

    }
}
