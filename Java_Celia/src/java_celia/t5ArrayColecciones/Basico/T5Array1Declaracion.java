/**
 * @created on : 25-ago-2017, 11:53:58
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico;

public class T5Array1Declaracion {

    public static void main(String[] args) {
// Array es un OBJETO
        int serie1[] = new int[5]; // reserva 5 espacio en la memoria 0 , 1 , 2 , 3 , 4 
        int[] serie2 = new int[5];

        int serie[]; // Declaracion como objeto
        serie = new int[5]; //instanciacion como OBJETO
//          indice = valor
        serie[2] = 20; // valor
        serie[3] = 15; // valor
        serie[4] = serie[2] + serie[3]; // suma valores
        System.out.println(serie[4]);
        
        System.out.println("------------");

        for (int i = 0; i < serie.length; i++) {
            System.out.println(serie[i]);
        }
    }
}
