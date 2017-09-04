/**
 * @created on : 04-sep-2017, 0:15:03
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos;

import java.util.Random;

public class T5x13ParejasDeBaile {

//    0 a 9 Elementos           0          1          2          3            4           5         6           7         8          9
    static String[] chicos = {"Mateo", "Santiago", "Matías", "Sebastián", "Benjamín", "Martín", "Nicolás", "Alejandro", "Lucas", "Diego"};
//    0 a 9 Elementos           0       1        2        3         4         5         6       7         8          9
    static String[] chicas = {"Ana", "Lucia", "Maria", "Rebeca", "Isabel", "Emilia", "Tania", "Luisa", "Vanesa", "Marina"};
//    0 a 9 Elementos                           10            10
    static int[][] parejas = new int[chicos.length][chicas.length];

//    static String[][] parejasString = new String[chicos.length][chicas.length];
    private static String[] parejasString = new String[chicos.length];

    public static int getNumero() {
        int n = (int) (Math.random() * (1 + 8) + 1);
        return n;
    }

    public static void main(String[] args) {

        for (int i = 0; i < chicos.length; i++) {
            String pareja1 = chicos[getNumero()].concat(" " + chicas[getNumero()]);
            System.out.println(pareja1);

        }

    }
}
