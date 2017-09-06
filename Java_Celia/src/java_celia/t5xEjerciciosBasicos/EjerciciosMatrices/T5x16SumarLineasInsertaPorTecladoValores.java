/**
 * @created on : 06-sep-2017, 0:58:44
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

import java.util.Scanner;

public class T5x16SumarLineasInsertaPorTecladoValores {

}

class SumarLineas2 {

    private double[][] numeros;

    public SumarLineas2() {
        numeros = new double[3][3];
    }

    public SumarLineas2(double[][] numeros) {
        this.numeros = numeros;
    }

    public double getNumeroPorTeclado(int i) {
        double x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero por teclado para la posicion " + i + ": ");
        x = sc.nextInt();
        return x;
    }

    public double[][] getArray() {
        return numeros;
    }

    public void setArray(double[][] numeros) {
        this.numeros = numeros;
    }

    public double getSumarFilas(double[][] numerosFilas) {

        int total = 0;
        for (int i = 0; i < numerosFilas.length; i++) {
            System.out.println("<<< Filas >>> ");
            numerosFilas[i][0] = getNumeroPorTeclado(i);
            System.out.println("\n-- fila " + i + " --");
            System.out.print(numerosFilas[i][0] + " - ");
            System.out.print(numerosFilas[i][0] + " - ");
            System.out.print(numerosFilas[i][0] + " - ");
            total += numerosFilas[i][0];
        }
        System.out.println("\n• Total de Filas : " + total);
        return total;
    }

    public int getSumarColumnas(double[][] numerosColumnas) {
        int total = 0;
        int i = 0;
        for (i = 0; i < numerosColumnas.length; i++) {
            System.out.println(">>> Columnas <<< ");
            for (int j = 0; j < numerosColumnas[i].length; j++) {
                numerosColumnas[i][j] = getNumeroPorTeclado(i);
                System.out.println("-- fila " + i + " --");
                System.out.print(numerosColumnas[0][0] + " - ");
                System.out.print(numerosColumnas[0][1] + " - ");
                System.out.print(numerosColumnas[0][2] + " - ");
                System.out.println("\n-- fila " + i + " --");
                System.out.print(numerosColumnas[1][0] + " - ");
                System.out.print(numerosColumnas[1][1] + " - ");
                System.out.print(numerosColumnas[1][2] + " - ");
                System.out.println("\n-- fila " + i + " --");
                System.out.print(numerosColumnas[2][0] + " - ");
                System.out.print(numerosColumnas[2][1] + " - ");
                System.out.print(numerosColumnas[2][2] + " - ");
                total += numerosColumnas[i][j];
                System.out.println("\nTotal de la columna : " + j + " : " + total);
            }
        }
        return total;
    }

    public void setVerValoresFilas(double[][] numeros) {
        System.out.println("----------------------------");
        System.out.println("Valor total de las filas : " + getSumarFilas(numeros));
    }

    public void setVerValoresColumnas(double[][] numeros) {
        System.out.println("----------------------------");
        System.out.println("Valor total de las columnas : " + getSumarColumnas(numeros));
    }

    public static void main(String[] args) {

        SumarLineas2 s = new SumarLineas2();
        s.setVerValoresFilas(s.getArray());

        SumarLineas2 s1 = new SumarLineas2();
        s1.setVerValoresColumnas(s1.getArray());

        double total = s.getSumarFilas(s.getArray()) + s1.getSumarColumnas(s.getArray());
        System.out.println("---------------------------");
        System.out.println("El total : " + total);

    }
}
