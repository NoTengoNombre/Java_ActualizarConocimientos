/**
 * @created on : 06-sep-2017, 0:58:44
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.EjerciciosMatrices;

public class T5x16SumarLineas {

}

class SumarLineas {

    private int[][] numeros;

    public SumarLineas() {
        numeros = new int[3][3];
    }

    public SumarLineas(int[][] numeros) {
        this.numeros = numeros;
    }

    public int[][] getArray() {
        return numeros;
    }

    public void setArray(int[][] numeros) {
        this.numeros = numeros;
    }

    public int getSumarFilas(int[][] numerosFilas) {
        int total = 0;
        for (int i = 0; i < numerosFilas.length; i++) {
            numerosFilas[i][0] = i + 1;
            System.out.println("\n-- fila " + i + " --");
            System.out.print(numerosFilas[i][0] + " - ");
            System.out.print(numerosFilas[i][0] + " - ");
            System.out.print(numerosFilas[i][0] + " - ");
            total += numerosFilas[i][0];
        }
        System.out.println("\n• Total de Filas : " + total);
        return total;
    }

    public int getSumarColumnas(int[][] numerosColumnas) {
        int total = 0;
        int i = 0;
        for (i = 0; i < numerosColumnas.length; i++) {
            for (int j = 0; j < numerosColumnas[i].length; j++) {
                numerosColumnas[i][j] = 1;
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

    public void setVerValoresFilas(int[][] numeros) {
        System.out.println("----------------------------");
        System.out.println("Valor total de las filas : " + getSumarFilas(numeros));
    }

    public void setVerValoresColumnas(int[][] numeros) {
        System.out.println("----------------------------");
        System.out.println("Valor total de las columnas : " + getSumarColumnas(numeros));
    }

    public static void main(String[] args) {

        SumarLineas s = new SumarLineas();
        s.setVerValoresFilas(s.getArray());

        SumarLineas s1 = new SumarLineas();
        s1.setVerValoresColumnas(s1.getArray());

        int total = s.getSumarFilas(s.getArray()) + s1.getSumarColumnas(s.getArray());
        System.out.println("---------------------------");
        System.out.println("El total : " + total);

    }
}
