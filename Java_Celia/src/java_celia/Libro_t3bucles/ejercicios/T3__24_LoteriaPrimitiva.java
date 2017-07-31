/**
 * @created on : 31-jul-2017, 0:07:15
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3__24_LoteriaPrimitiva {

    public static void main(String[] args) {
        System.out.print("- Numero de la lotería primitiva : ");
        for (int i = 0; i < 6; i++) {
            System.out.print((int) (Math.random() * (1 + 49) + 1));
            System.out.print("-");
        }
        System.out.println();
    }
}
