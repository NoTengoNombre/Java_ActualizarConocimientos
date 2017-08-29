/**
 * @created on : 29-ago-2017, 17:59:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

public class t5StringBasicoMetodosEjemplos {

    public static void main(String[] args) {

        String cad1 = "Hola";
        String cad2 = "Mundo";
        String cad3 = cad2;
        System.out.println("¿ Son cad2 y cad3 iguales ? " + cad2.equals(cad3));
        System.out.println("Longitud de cad1 = " + cad1.length());
        System.out.println(cad1.concat(cad2));
        String cad4 = cad1.concat(", ").concat(cad2);
        System.out.println(cad4);
        System.out.println(cad4.toUpperCase());
        System.out.println(cad4.substring(0, 3));

    }
}
