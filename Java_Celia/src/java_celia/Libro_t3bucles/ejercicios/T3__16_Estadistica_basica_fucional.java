/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

/**
 *
 */
public class T3__16_Estadistica_basica_fucional {

    public static void main(String[] args) {

        int[] serie = new int[10];
        int max = 0;
        int minimo = serie.length;
        double acumulador = 0;
        double desviacion = 0;
        double medio = 0;

        for (int j = 0; j < serie.length; j++) {
            serie[j] = (int) (Math.random() * (1 + 10));
            System.out.println("El valor es : " + serie[j]);
        }

        for (int a = 0; a < serie.length; a++) {

            if (serie[a] > max) {
                max = serie[a];
                System.out.printf("\u001B[31m Numero maximo es : " + max + "\n");
            }

            if (serie[a] < minimo) {
                minimo = serie[a];
                System.out.printf("\u001B[33m Numero minimo es : " + minimo + "\n");
            }

            medio = medio + serie[a];
        }

        for (int i = 0; i < serie.length; i++) {
            acumulador = acumulador + (double) Math.sqrt(Math.pow(serie[i], 2));
            System.out.println("El acumulador : " + acumulador);
//            desviacion = (acumulador / serie.length);
        }
        System.out.println("La desviación es : " + desviacion);

        System.out.println("---------------------------------------------");
        System.out.printf("\u001B[31m ♦ Numero maximo es : " + max + "\n");
        System.out.printf("\u001B[33m ♦ Numero minimo es : " + minimo + "\n");

        System.out.println("-----------------------------------------------");
        System.out.println("valor medio " + medio);
        System.out.printf("\u001B[36m ♦ Valor medio es : " + medio / serie.length + "\n");
    }
}
