/**
 * @created on : 23-jul-2017, 18:31:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_salida_teclado_color;

public class java_ejemplo_salida_teclado_color {

    public static void main(String[] args) {

        for (int j = 0; j < 10; j++) {
            System.out.println("----------------------------------------");
            for (int i = 0; i < 10; i++) {
                System.out.printf(j + "-" + i + " Colores de teclado \u001B[" + j + i + "m");
                System.out.println("----------------------------------------");
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Colores de teclado \u001B[3" + i + "m");
            System.out.println("");
        }

    }

}
