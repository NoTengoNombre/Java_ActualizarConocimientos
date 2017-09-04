/**
 * @created on : 04-sep-2017, 16:57:54
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_String;

public class JavaStringBasico {

    public static void main(String[] args) {

        String[] a = {"A", "B", "C", "D", "E"};
        String[] b = new String[a.length];

//        Inicia el array
        for (int i = 0; i < a.length; i++) {
//            Mientras la posicion del vector esta vacia
            while (a[i] != "") {
//              Si posicion[0] equivale a ""
                if (a[i].equals("")) {
//                    Esta vacio
                    System.out.println("si esta vacio: " + a[i]);
                } else {
//                    Esta no esta vacio
                    System.out.println("no esta vacio : " + a[i]);
//                    lo que hay en a[0] pasa dentro de b[0]
                    b[i] = a[i].concat(" Otro valor " + i);
//                    lo que hay en posicion a[0] = pasa a estar vacio
                    a[i] = "";
                }
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Vector A : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        System.out.println("\nVector B : ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
        System.out.println("");

    }
}
