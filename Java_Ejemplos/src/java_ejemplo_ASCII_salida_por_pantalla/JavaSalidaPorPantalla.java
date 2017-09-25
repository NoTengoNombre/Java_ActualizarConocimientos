/**
 * @created on : 25-sep-2017, 21:22:36
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_ASCII_salida_por_pantalla;

public class JavaSalidaPorPantalla {

    public static void main(String[] args) {
 
        System.out.println("\033[30mEste texto es Negro");
        System.out.println("\033[31mEste texto es Rojo");
        System.out.println("\033[32mEste texto es Verde");
        System.out.println("\033[33mEste texto es Amarillo");
        System.out.println("\033[34mEste texto es Azul");
        System.out.println("\033[35mEste texto es Magenta");
        System.out.println("\033[36mEste texto es Cyan");
        System.out.println("\033[37mEste texto es Blanco");
    }
}
