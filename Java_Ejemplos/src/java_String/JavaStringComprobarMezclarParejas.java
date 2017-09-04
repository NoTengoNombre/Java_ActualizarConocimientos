/**
 * @created on : 04-sep-2017, 10:46:01
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringComprobarMezclarParejas {

//                              0           1           2          3          4            5        6          7           8        9
    static String[] chicos = {"Mateo", "Santiago", "Matías", "Sebastián", "Benjamín", "Martín", "Nicolás", "Alejandro", "Lucas", "Diego"};
//                              0       1        2        3         4         5         6        7         8         9
    static String[] chicas = {"Ana", "Lucia", "Maria", "Rebeca", "Isabel", "Emilia", "Tania", "Luisa", "Vanesa", "Marina"};

    static String[] parejas = new String[chicos.length];

    public static int getX() {
        int x = (int) (Math.random() * (1 + 7) + 1);
        return x;
    }

    public static int getY() {
        int x = (int) (Math.random() * (1 + 7) + 1);
        return x;
    }

    public static void main(String[] args) {

//        System.out.println("Valor de x : " + getX() + " - Valor de y : " + getY());
        for (int i = 0; i < parejas.length; i++) {
            if (chicos[getX()] != null && chicas[getY()] != null) {
                System.out.println(" i " + i);
                System.out.println("Valor de x : " + getX() + " - Valor de y : " + getY());
                parejas[i] = chicos[getX()].concat(" - " + chicas[getY()]);
                chicos[getX()] = null;
                chicas[getY()] = null;
            }
        }

        System.out.println("Pareja : " + parejas[0]);
        System.out.println("Chicos : " + chicos[0]);
        System.out.println("Chicas : " + chicas[0]);

        System.out.println("------------------");
        for (String i : chicos) {
            System.out.println("Chicos : " + i);
        }
        System.out.println("------------------");
        for (String y : chicas) {
            System.out.println("Chicas : " + y);
        }
        System.out.println("------------------");

        for (int i = 0; i < parejas.length; i++) {
            System.out.println(parejas[i]);
        }

    }
}
