/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplos.Operaciones_basicas;

public class Java_Operadores {

    public static void main(String[] args) {

        int x;
        int xx = 4;
        System.out.println("Asignacion dentro println");
        System.out.println(x = 3);
        System.out.println("x = 3");
        System.out.println("x += 2");
        System.out.println("-----------");
        System.out.println("x = 3 + 2");
        System.out.println("x = x + 2");
        System.out.println("-----------");
        System.out.println(x += 2);
        xx += 2;
        System.out.println(""
                + "Mostrar valor xx = 4; \n"
                + xx + " <-- xx += 2  ");

    }
}
