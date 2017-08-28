/**
 * @created on : 28-ago-2017, 19:25:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5ArrayColecciones.Basico.MetodosDeObject;

public class T5ArrayMetodoObjectsClone {

    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        System.out.println("Copiar los elementos de un array a otro ");
        System.out.println("----------------------------------------");

        byte[] v1 = {1, 2, 3};
        for (int i = 0; i < v1.length; i++) {
            System.out.println(v1[i]);
        }
        byte[] v2 = v1.clone();
        System.out.println("--------------");
        for (int i = 0; i < v2.length; i++) {
            System.out.println(v2[i]);
        }

        byte[] v3 = v1;

        System.out.println("--------------");
        for (int i = 0; i < v3.length; i++) {
            System.out.println(v3[i]);
        }

    }
}
