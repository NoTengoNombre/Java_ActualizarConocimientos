/**
 * @created on : 04-sep-2017, 10:46:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringComprobarValorDentroDeIF {

    static String[] chicos = {"Mateo", "Santiago", "Matías", "Sebastián", "Benjamín", "Martín", "Nicolás", "Alejandro", "Lucas", "Diego"};
    static String[] chicas = {"Ana", "Lucia", "Maria", "Rebeca", "Isabel", "Emilia", "Tania", "Luisa", "Vanesa", "Marina"};

    static String[] parejas = new String[chicos.length];

    public static void main(String[] args) {

        String[] nombre = new String[10];

        if (chicos[0] != null && chicas[0] != null) {
            parejas[0] = chicos[0].concat(" - " + chicas[0]);
            chicos[0] = null;
            chicas[0] = null;
        }

        System.out.println("Pareja : " + parejas[0]);
        System.out.println("Chicos : " + chicos[0]);

        if (chicos[0] != null && chicas[0] != null) {
            parejas[0] = chicos[0];
            chicos[0] = null;
            chicas[0] = null;
        } else {
            System.out.println("chicos[0] : " + chicos[0]);
            System.out.println("chicas[0] : " + chicas[0]);
        }

        System.out.println("------------------");
        for (String i : chicos) {
            System.out.println("valor : " + i);
        }
        System.out.println("------------------");
        for (String y : chicas) {
            System.out.println("valor : " + y);
        }
        System.out.println("------------------");

        for (int i = 0; i < parejas.length; i++) {
            System.out.println(parejas[i]);
        }

    }
}
