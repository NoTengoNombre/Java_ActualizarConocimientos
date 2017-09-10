/**
 * @created on : 10-sep-2017, 14:23:27
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t5xEjerciciosBasicos.String;

import java.util.Scanner;

public class T5x24ContarVocales {

    public static void main(String[] args) {

        ContarVocales c = new ContarVocales();
        c.getContarVocales(c.setContarVocales());

    }
}

class ContarVocales {

    public String setContarVocales() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase : ");
        String s = sc.nextLine();
        return s;
    }

    public void getContarVocales(String cadena) {

        int la = 0;
        int le = 0;
        int li = 0;
        int lo = 0;
        int lu = 0;

        char[] c = new char[cadena.length()];

        for (int i = 0; i < cadena.length(); i++) {
            c[i] = cadena.charAt(i);
            if ((c[i] == 'a')) {
                la++;
            }
            if ((c[i] == 'e')) {
                le++;
            }
            if ((c[i] == 'i')) {
                li++;
            }
            if ((c[i] == 'o')) {
                lo++;
            }
            if ((c[i] == 'u')) {
                lu++;
            }
        }
        System.out.println("---------------");
        System.out.println("Letra a : " + la);
        System.out.println("Letra e : " + le);
        System.out.println("Letra i : " + li);
        System.out.println("Letra o : " + lo);
        System.out.println("Letra u : " + lu);
        System.out.println("---------------");
    }

}
