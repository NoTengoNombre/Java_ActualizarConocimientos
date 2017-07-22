/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__12_Dibujando_Asteriscos {

    public static void main(String[] args) {

//      Se posiciona en la fila 
        for (int f = 1; f <= 3; f++) {
//      Se posiciona en la columna 
//        Aquí se aumenta hasta 3
            for (int c = f + 1; c <= 3; c++) {
                System.out.print(" ");
            }
//            Pinta los asteriscos 
            for (int i = 1; i <= 2 * (f - 1) + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("---------------------");

        int i, j, k;
        for (i = 1; i <= 3; i++) { // elijo fila
//            Aqui se reduce 
            for (k = 1; k <= 3 - i; k++) { // elijo columna
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * (i - 1) + 1; j++) { // dibujo
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
