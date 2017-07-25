/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

import java.text.DecimalFormat;
import static java_celia.Libro_t3bucles.ejercicios.T3__16_Estadistica_basica_fucional.media;

/**
 *
 */
public class T3__16_Estadistica_basica_fucional {

    private static double media;
    private static double total;
//    private static double[] a = {2, 3, 6, 8, 11};
    private static double[] serie = {12, 6, 7, 3, 15, 10, 18, 5};

    public static void main(String[] args) {

        //        valores array
        media = media(serie);
        System.out.println("• Media : " + media);
        System.out.println("• Desvianción media : " + desviacionMedia(serie));
        System.out.println("• Varianza : " + varianza(serie));
        System.out.println("• Desviacion tipica : " + desviacionTipica(serie));

        System.out.println("----------------------");

        int[] serie = {12, 6, 7, 3, 15, 10, 18, 5};
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

    //   Media
    public static double media(double[] a) {
        double sumatoria_numerador = 0;
        for (int i = 0; i < a.length; i++) {
            sumatoria_numerador = sumatoria_numerador + a[i];
        }
        return sumatoria_numerador / a.length;
    }

//    Desvianción Media
    public static double desviacionMedia(double[] a) {
        double[] suma_numerador = new double[a.length];
        total = 0.0;
        for (int i = 0; i < a.length; i++) {
            suma_numerador[i] = (a[i] - (media));
            total += Math.abs(suma_numerador[i]);
        }
        return total / a.length;
    }

    public static double varianza(double[] a) {
        total = 0.0;
        double[] num_cuadrado = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            num_cuadrado[i] = Math.pow((a[i]), 2);
//            System.out.println("Valor : " + num_cuadrado[i]);
        }

        for (int i = 0; i < num_cuadrado.length; i++) {
            total += num_cuadrado[i];
//            System.out.println("Suma total : " + total);
        }
//        System.out.println("Potencia : " + Math.pow(-media, 2));
        double num2 = Math.pow(-media, 2);
        double calculo_final = restar_fracciones(total, a.length, num2, 1);
//        System.out.println("Calculo final : " + calculo_final);
        return calculo_final;
    }

    public static double desviacionTipica(double[] a) {
        DecimalFormat df = new DecimalFormat("#.###");
        String valor = df.format(Math.sqrt(varianza(a)));
        System.out.println("• Desviacion típica : " + valor);
        return Math.sqrt(varianza(a));
    }

    public static double restar_fracciones(double num, double dem, double num2, double dem2) {
        double numerador = (num * dem2) - (dem * num2);
        double denominador = (dem * dem2);
//        System.out.println("NUM: " + numerador);
//        System.out.println("DEN: " + denominador);
        double resultado = numerador / denominador;
        return resultado;
    }
}
