/**
 * @created on : 04-sep-2017, 14:54:30
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_arrays;

public class ArrayAsignacionDeValores {

    public static int getX() {
        int x = (int) (Math.random() * (1 + 3) + 1);
        return x;
    }

    public static int getY() {
        int x = (int) (Math.random() * (1 + 3) + 1);
        return x;
    }

    public static void main(String[] args) {

        System.out.println("----------------------------------------");

        String[] a = {"A1|", "B2|", "C3|", "D4|", "E5|"};
        String[] b = {"z6", "y7", "x8", "w9", "v10"};

        String[] parejas = new String[a.length];

        for (int i = 0; i < parejas.length; i++) {
            for (int j = i; j < parejas.length; j++) {

                System.out.println("Numeros aleatorios X : " + getX());
                System.out.println("Numeros aleatorios Y : " + getY());

                while (("".equals(a[j])) && ("".equals(b[j]))) {
                    if (("".equals(a[j])) && ("".equals(b[j]))) {
                        parejas[i] = a[getX()].concat(b[getY()]);
                    }
                }

                parejas[i] = a[getX()].concat(b[getY()]);
                a[i] = "";
                b[i] = "";
                if (a[i] == "") {
                    if (b[i] == "") {
                        System.out.println("Posicion : " + i + " Estan vacios : a - " + a[i] + " y  b - " + b[i]);
                    }
                }
            }
        }

        System.out.println("----------------------");

        for (int i = 0; i < parejas.length; i++) {
            System.out.println(parejas[i]);
        }

    }
}
