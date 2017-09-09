/**
 * @created on : 09-sep-2017, 12:28:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5x20JuegueteandoConMatricesProfesor {

    public static void main(String[] args) {

        Matriz matriz = new Matriz();

        int opc;

        do {
            System.out.println("1º Mostrar matriz");
            System.out.println("2º Perimetro");
            System.out.println("3º Espiral ");
            System.out.println("4º Salir");
            System.out.println();
            System.out.println("Introduzca opcion (1 - 4 ): ");
            opc = SC.nextInt();

            switch (opc) {
                case 1:
                    matriz.mostrar();
                    break;
                case 2:
                    matriz.perimetro();
                    break;
                case 3:
                    matriz.espiral();
                    break;
            }
// CON ESTO PUEDO HACER QUE SE EJECUTE INDEFINIDAMENTE SIN TENER QUE DECIR EL RANGO
        } while (opc != 4);
    }
}

class Matriz {

//    private final int N = (int) ((Math.random() * (1 + 9) + 1));
    private final int N = 6;
    private final int[][] MTRZ;

    public Matriz() {
        int f, c;
        MTRZ = new int[N][N];
//        Rellenamos la matriz con numeros aleatorios
        for (f = 0; f < N; f++) {
            for (c = 0; c < N; c++) {
                MTRZ[f][c] = (int) (Math.random() * 10);
            }
        }
    }

    /**
     * Mostrar la matriz ordenada
     */
    public void mostrar() {
        int fila, col;
        for (fila = 0; fila < N; fila++) {
            for (col = 0; col < N; col++) {
                System.out.format("%4d", MTRZ[fila][col]);
            }
            System.out.println();
        }
    }

    /**
     * Metodo Para lanzar el metodo perimetro sin meterle los parametros y asi
     * invocarlo desde otra clase donde no estan definidos los atributos
     */
    public void perimetro() {
        perimetro(0, N, 0, N);
    }

    /**
     * Metodo sobreCargado
     *
     * @param izq
     * @param der
     * @param arriba
     * @param abajo
     */
    public void perimetro(int izq, int der, int arriba, int abajo) {

        int fila, columna;

        System.out.println("El perimetro es : ");

//        Mostramos la fila superior ( de izquierda a derecha )
        for (columna = izq; columna < der; columna++) {
            System.out.print(MTRZ[arriba][columna] + " ");
        }
//        Mostramos la columna derecha ( de arriba a abajo)
        for (fila = arriba + 1; fila < abajo; fila++) {
            System.out.print(MTRZ[fila][der - 1] + " ");
        }
//        Mostramos la ultima fila ( de derecha a izquierda)
        for (columna = der - 2; columna >= izq; columna--) {
            System.out.print(MTRZ[abajo - 1][columna] + " ");
        }
//        Mostramos la columa izquierda ( de abajo a arriba)
//                               3  >= 
        for (fila = abajo - 2; fila >= arriba + 1; fila--) {
            System.out.print(MTRZ[fila][izq] + " ");
        }
        System.out.println();
    }

    /**
     * Muestra el array de numero en forma de espiral
     *
     */
    public void espiral() {

        System.out.println("La espiral es : ");

        int cont, izq, der, arriba, abajo;

        izq = 0;
        der = N;
        arriba = 0;
        abajo = N;

        for (cont = 0; cont <= (N / 2); cont++) {
//            Actualizamos limites del perimetro
            perimetro(izq, der, arriba, abajo);
            izq++;
            der--;
            arriba++;
            abajo--;
        }
        System.out.println();
    }

}
