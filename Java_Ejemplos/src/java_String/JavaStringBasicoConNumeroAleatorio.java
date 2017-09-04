/**
 * @created on : 04-sep-2017, 16:57:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringBasicoConNumeroAleatorio {

    private static int r;

    private static int x = (int) (Math.random() * (0 + 5) + 0);

    public static void main(String[] args) {

//                     0     1     2     3     4
        String[] a = {"A|", "B|", "C|", "D|", "E|"};
//                     0    1    2    3    4
        String[] b = {"z", "y", "x", "w", "v"};
        String[] pareja = new String[a.length];

        System.out.println("Longitud de a : " + a.length);
        System.out.println("----------------------------");

//        Inicia el array
        for (int i = 0; i < a.length; i++) {
//      Mientras :  a[0] NO ESTA VACIA
            while (!a[i].equals("")) {
                System.out.println("No esta vacio : " + a[i]);
                System.out.println("Numero aleatorio : b[x] = " + x);
//             Si :  a[?] NO ESTA VACIA
                if (!a[i].equals("")) {
//            Si :  b[?] NO ESTA VACIO
                    if (!b[x].equals("")) {
                        System.out.println("• Valor elegido para a : " + a[i]);
                        System.out.println("• Valor elegido para b : " + b[x]);
                        pareja[i] = a[i].concat(b[x]);
                        System.out.println("• Pareja creada : " + pareja[i]);
                        a[i] = "";
                        b[i] = "";
                    }
//            Si :  b[?] ESTA VACIO
                    if (b[x].equals("")) {
                        do {
                            r = (int) (Math.random() * (0 + 5) + 0);
                            x = r;
                            System.out.println("Valor de r : " + r);
                        } while (b[x].equals(""));
                    }
                    pareja[i] = a[i].concat("Otro valor " + b[i]);
//                    lo que hay en posicion a[0] = pasa a estar vacio
                }

                if (a[i].equals("")) {
//                    Esta vacio
                    System.out.println("si esta vacio: " + a[i]);
                } else {
                    while (b[i].equals("")) {
                        if (b[x].equals("")) {

                        }
                    }
                }
                a[i] = "";
                b[i] = "";
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Vector A : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println("\nParejas Creadas : ");
        for (int i = 0; i < pareja.length; i++) {
            System.out.println(pareja[i] + " ");
        }
        System.out.println("");

    }
}
