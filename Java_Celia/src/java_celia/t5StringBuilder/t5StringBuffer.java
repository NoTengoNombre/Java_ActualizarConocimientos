/**
 * @created on : 29-ago-2017, 20:30:14
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5StringBuilder;

/**
 * StringBuffer - Sincroniza y es mutable.
 *
 * No se recomienda usar.
 *
 * !!! Usar StringBuilder - No se sincroniza y es mutable !!!
 *
 * @author Portatil_Bot
 */
public class t5StringBuffer {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Soy el StringBuffer");

        int longitud = sb.length();
        System.out.println("Longitud de la cadena : " + longitud);

        int capacidad = sb.capacity();
        System.out.println("Capacidad : " + capacidad);

        StringBuffer sb1 = new StringBuffer();
        sb1.append("cadena String : ");
        System.out.println(sb1);
        sb1.append(" " + 1);
        System.out.println(sb1);
        sb1.append(" ").append(2);
        System.out.println(sb1);
        sb1.append(" ").append(2.2);
        System.out.println(sb1);
        sb1.append(" ").append(true);
        System.out.println(sb1);
        sb1.append(" " + 'c');
        System.out.println(sb1);

        System.out.println(sb1.insert(0, "!insertar cadena!"));

        StringBuffer sb2 = new StringBuffer("Revertir cadena");
        System.out.println(sb2.reverse());

        StringBuffer sb3 = new StringBuffer("Borrar cadena");
        sb3.delete(0, 7);
        System.out.println(sb3);

        StringBuffer sb4 = new StringBuffer("Subcadena! Devuelve el string que empieza en la posicion i y termina posicion f");
        System.out.println(sb4);

        System.out.println(sb4.substring(0, 10));

        StringBuffer sb5 = new StringBuffer("CharAt Devuelve el caracter situado en la posicion i ");

        char p0 = sb5.charAt(0);
        System.out.print(p0);
        char p1 = sb5.charAt(1);
        System.out.print(p1);
        char p2 = sb5.charAt(2);
        System.out.print(p2);
        char p3 = sb5.charAt(3);
        System.out.print(p3 + "\n");

    }

}
