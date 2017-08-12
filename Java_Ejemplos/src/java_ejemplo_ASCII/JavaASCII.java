/**
 * @created on : 29-jul-2017, 18:21:11
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_ASCII;

public class JavaASCII {

    public static void main(String[] args) {
        char letra = 0;
        for (int i = 0; i <= 12042; i++) {
            System.out.println("El codigo ASCII de la letra "
                    + letra++ + " es " + i);
        }
        char v = (char) 0x1F431;
        System.out.println(v);
    }
}
