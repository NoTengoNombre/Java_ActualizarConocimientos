/**
 * @created on : 04-sep-2017, 16:57:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_borradores_ejercicios;

public class T5x13ParejasDeBaile2 {

    private static String[] a = {"|A|", "|B|", "|C|", "|D|", "|E|"};
    private static String[] b = {"z", "y", "x", "w", "v"};
    private static String[] pareja = new String[a.length];
    private static String[] almacenadoA = new String[a.length];
    private static String[] almacenadoB = new String[a.length];

    public static void main(String[] args) {
//                      0      1      2      3      4
        int[] almacenar = new int[a.length];

        for (int i = 0; i < a.length; i++) {
//Generar numero aleatorio
            int x = (int) (Math.random() * (0 + 5) + 0);

            for (int j = 0; j < a.length; j++) {
                if (almacenar[j] == x) {
                    do {
                        x = (int) (Math.random() * (0 + 5) + 0);
                        System.out.println("EL VALOR DE [I] : " + x);
                    } while (almacenar[i] == x);
                }
            }

            System.out.println("◘ Numero aleatorio para b[" + x + "]");
//        Si :  b[0] ESTA VACIO
            if (b[i].equals("")) {
                do {
                    x = (int) (Math.random() * (0 + 5) + 0);
                    System.out.println("♣♣ Numero aleatorio : " + x);
                    if (almacenar[i] == x) {
                        while (almacenar[i] == x) {
                            x = (int) (Math.random() * (0 + 5) + 0);
                        }
                    }
                    System.out.println("♠ Valor de r : " + x);
                    almacenar[i] = x;
                } while (b[x].equals(""));
            }

//                        0           3
            pareja[i] = a[i].concat(b[x]);
//            x = (int) (Math.random() * (0 + 5) + 0);
//          Si :  b[?] NO ESTA VACIO
            if (!b[x].equals("")) {
                System.out.println("• Valor elegido para a es : " + i + "  " + a[i]);
                System.out.println("• Valor elegido para b es : " + x + "  " + b[x]);
                pareja[i] = a[i].concat(b[x]);
                System.out.println("• Pareja creada : " + pareja[i]);
                a[i] = "";
                System.out.println("• Valor Actual de a[i] : " + a[i]);
                b[x] = "";
                System.out.println("• Valor Actual de b[" + x + "] : " + b[x]);
            }
            almacenar[i] = x;
        }

        System.out.println("---------------------------------------");
        System.out.println("Parejas Creadas : ");
        for (int i = 0; i < pareja.length; i++) {
            System.out.println("Valor almacenado : " + almacenar[i] + " ");
            System.out.println(pareja[i] + " ");
        }
        System.out.println("");

    }
}
