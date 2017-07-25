/**
 * @created on : 23-jul-2017, 19:47:35
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Math;

import java.text.DecimalFormat;
import java.util.Arrays;

public class java_ejemplo_Estadistica_completa {

    private static double media;
    private static double total;
//    private static double[] a = {2, 3, 6, 8, 11};
//    private static double[] a = {12, 6, 7, 3, 15, 10, 18, 5};
//    private static double[] a = {12, 6, 7, 3, 15, 10};
//    private static double[] a = {3, 6, 7, 8, 9, 10};
    private static double[] a = {3, 6, 7, 8, 9};

    public static void main(String[] args) {
//        valores array
        media = media(a);
        System.out.println("• Media : " + media);
        System.out.println("• Desvianción media : " + desviacionMedia(a));
        System.out.println("• Varianza : " + varianza(a));
        System.out.println("• Desviacion tipica : " + desviacionTipica(a));
        System.out.println("• Mediana " + mediana(a));
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

    public static double mediana(double[] a) {
        double valor_final_posicion;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println("= Array : " + a[i]);
        }

        if (a.length % 2 == 0) {
            System.out.println("• Aplicamos la mediana par : " + a.length);

            int posicion0 = ((a.length - 1) / 2);
//            System.out.println("posicion 0 : " + posicion0);
            int posicion_0 = (int) a[posicion0];
            System.out.println("• Valor 1º posicion : " + posicion_0);

            int posicion1 = (((a.length - 1) / 2) + 1);
//            System.out.println("posicion 1 : " + posicion1);
            int posicion_1 = (int) a[posicion1];
            System.out.println("• Valor 2º posicion : " + posicion_1);

            double posicion_final = Math.round(posicion_0 + posicion_1) / 2;
            System.out.println("• Posicion : " + posicion_final);
            valor_final_posicion = posicion_final;
        } else {
            System.out.println("♣ Aplicamos la mediana impar : " + a.length);
            int posicion = ((a.length + 1) / 2);
            System.out.println("♣ Posicion " + posicion);
            System.out.println("♣ Mediana : " + a[posicion]);
            valor_final_posicion = a[posicion];
        }
        System.out.println("------------------------------------------------");
        return valor_final_posicion;
    }

}
