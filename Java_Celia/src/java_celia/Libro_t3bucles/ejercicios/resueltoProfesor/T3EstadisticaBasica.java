/**
 * @created on : 21-ago-2017, 10:34:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

import java.util.Arrays;
import java.util.Scanner;

public class T3EstadisticaBasica {

    private static final Scanner SC = new Scanner(System.in);

    private int suma = 0;
    private int max = -999999;
    private int min = 999999;
    private int[] n;
    private int numValores = 0;

    public T3EstadisticaBasica() {
//        creamos un array de 10 numeros enteros
        n = new int[10];
    }

    /**
     * metodo set para fijar los valores
     *
     * @param num
     */
    public void addNumero(int num) {
        suma += num; // acumulador
//           4   -999999
        if (num > max) {
            max = num; // Calcula el max
        }
//           4    999999
        if (num < min) {
            min = num; // Calcula el minimo
        }
//                       4           
        n[numValores] = num; // almacena el numero en el Array n
        numValores++;
    }

    /**
     *
     * @return
     */
    public int getMaximo() {
        return max;
    }

    /**
     *
     * @return
     */
    public int getMinimo() {
        return min;
    }

    /**
     *
     * @return
     */
    public double getMedia() {
        return (double) suma / 10;
    }

    /**
     *
     * @return
     */
    public double getDesviacion() {
        double desv, media;

//        Valores acumulados en el array n 
//         podemos calcular la desviacion 
        media = getMedia();
        desv = 0;

        for (int i = 0; i < 10; i++) {
            desv += Math.pow(n[i] - media, 2);
        }

        desv /= 10;
        desv = Math.sqrt(desv);

        return desv;
    }

    public double getMediana() {
        Arrays.sort(n);
//        Calculamos la mediana (entre el 5º y 6º numero del array porque empieza por 0) 
        return ((double) (n[4] + n[5])) / 2;
    }

    public static void main(String[] args) {
        int n, i;

        T3EstadisticaBasica est = new T3EstadisticaBasica();

        System.out.println("Introduzca 10 numeros enteros : ");
        for (i = 1; i <= 10; i++) {
            n = i;
//            n = SC.nextInt();
            System.out.println("Numero " + i + " : " + n);
            est.addNumero(n);
        }

        System.out.println("Maximo : " + est.getMaximo());
        System.out.println("Minimo : " + est.getMinimo());
        System.out.println("Media : " + est.getMedia());
        System.out.println("Mediana : " + est.getMediana());
        System.out.println("Desviacion : " + est.getDesviacion());

    }

}
