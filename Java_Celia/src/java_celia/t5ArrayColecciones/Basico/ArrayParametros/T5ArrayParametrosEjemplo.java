/**
 * @created on : 28-ago-2017, 18:06:47
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.ArrayParametros;

/**
 * Array son OBJETOS y los OBJETOS pasan DIRECCIONES DE MEMORIA
 *
 * Array pueden modificarse en el interior del metodo y esa modificacion afecta
 * al exterior
 *
 * Si algun elemento del array se modifica en un metodo , tambien sera
 * modificado en el metodo desde que fue pasado
 *
 * @author Portatil_Bot
 */
public class T5ArrayParametrosEjemplo {

}

class Estadisticas {

    public static void main(String[] args) {

        float valores[] = new float[50];
        float suma, media, desviacion;

        introducirValores(valores);
        suma = calcularSuma(valores);
        media = calcularMedia(valores, suma);
        desviacion = calcularDesviacion(valores, media);
        System.out.println("La suma es : " + suma);
        System.out.println("La media es : " + media);
        System.out.println("La desviacion es : " + desviacion);
    }

    /**
     * Lee 50 numeros y los almacena en el array N pasado por variable
     *
     * @param valores
     */
    private static void introducirValores(float n[]) {
        int i;
        for (i = 1; i <= 49; i++) {
            System.out.printf("Introduzca el valor de nº %d: ", i);
//            n = Integer.parseInt(System.console().readLine());
//            float x = (float) (Math.random() * (1 + 100) + 1);
        }
    }

    private static float calcularSuma(float n[]) {
        int i;
        float suma;
        suma = 0;

        for (i = 0; i <= 49; i++) {
            suma = suma + n[i];
        }
        return suma;
    }

    /**
     * Devuelve el valor medio de los elementos del array N
     *
     * Necesita conocer la suma de los elementos para calcular la media
     *
     * @param valores
     * @param suma
     * @return
     */
    private static float calcularMedia(float[] n, float suma) {
        int i;
        float media;
        media = suma / 50;
        return media;
    }

    /**
     * Calcula la desviacion tipica de los elementos del Array N
     *
     * Necesita conocer la media para hacer los calculos
     *
     * @param n
     * @param media
     * @return
     */
    private static float calcularDesviacion(float[] n, float media) {
        int i;
        float diferencias;
        diferencias = 0;
        for (i = 1; i <= 49; i++) {
            diferencias += Math.abs(n[i] - media);
            diferencias /= 50;
        }
        return diferencias;
    }

}
