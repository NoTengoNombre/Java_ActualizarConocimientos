/**
 * @created on : 29-ago-2017, 17:59:53
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5String;

public class t5StringBasicoInstanciacion {

    public static void getDiferencias(int v) {
        System.out.println("¿ Hay ninguna diferencia en la cadena ?");
        if (v == 0) {
            System.out.println("No hay ninguna diferencia");
        } else {
            System.out.println("Hay ninguna diferencia : " + v);
        }
    }

    public static void main(String[] args) {

        String cadena1 = "Hola";
        String cadena2 = new String("Mundo");
        String cadena3 = cadena2;

        String c2 = cadena2.concat(" Feliz");
        System.out.println(c2);

        int valor2 = c2.compareTo(cadena2);
        System.out.println("numero de diferencias es : " + valor2);

        int valor3 = cadena2.compareTo(cadena3);
        System.out.println("numero de diferencias es : ");
        getDiferencias(valor3);

    }
}
