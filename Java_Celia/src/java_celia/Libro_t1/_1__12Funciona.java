/**
 * @created on : 14-jul-2017, 22:54:08
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t1;

public class _1__12Funciona {

    public static void main(String[] args) {

        System.out.println("Apartado E ) ");
        System.out.println("boolean adivina = (1 == 'a' == 1); - Error");
        System.out.println("Apartado F ) ");
        System.out.println("boolean adivina = (97 == 'a' == 97); - Error");
        System.out.println("Apartado G ) ");
        boolean adivina = ((97 == 'a') && true);
        System.out.println("adivina = ((97 == 'a') && true); - Resultado : " + adivina);

        System.out.println("Apartado H ) ");
//        int a = 1;
//        int b == a > 1;
//        System.out.println(b);
        System.out.println(""
                + "int a = 1;"
                + "\nint b == a > 1;\n"
                + "System.out.println(b);");
        System.out.println("Apartado I ) ");
        System.out.println("byte a = 200;" + " - Error : Overflow ");

    }
}
