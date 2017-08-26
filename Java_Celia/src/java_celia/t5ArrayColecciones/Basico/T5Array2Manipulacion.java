/**
 * @created on : 25-ago-2017, 11:53:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico;

import static java_celia.Libro_t3bucles.ejercicios.T3__43_TragaPerrasFinal.SC;

public class T5Array2Manipulacion {

    public static void main(String[] args) {

        int[] serie = new int[5];
        serie[0] = 5;
        serie[1] = 3;
        serie[2] = 7;

        for (int i = 0; i < serie.length; i++) {
            System.out.println(serie[i]);
        }

        System.out.println("----------------------");
//        En una sola linea 
        int serie_directa[] = {5, 3, 7, 9, 14};

        for (int i = 0; i < serie_directa.length; i++) {
            System.out.print(serie_directa[i] + ",");
        }

//        Usar array como elemento independiente
        serie_directa[0] = 21;
        System.out.println("\nSerie directa : " + serie_directa[0]);

        int[] serie2 = new int[5];
        serie2[0] = SC.nextInt();
        serie2[1] = serie2[0] + 15;
        System.out.println("serie[1] : " + serie[1]);
        
        
    }
}
