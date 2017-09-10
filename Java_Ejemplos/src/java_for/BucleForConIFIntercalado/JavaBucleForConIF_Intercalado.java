/**
 * @created on : 07-sep-2017, 19:47:48
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_for.BucleForConIFIntercalado;

public class JavaBucleForConIF_Intercalado {

    public static void main(String[] args) {

        for (int f = 0; f < 5; f++) {
            System.out.print(f);
            if (f == 2) {
                for (int c = 0; c < 5; c++) {
                    System.out.print(" | " + c);
                }
            }
            System.out.println("");
        }

        System.out.println("-------------------");
        
        for (int f = 0; f < 5; f++) {
            System.out.print(f);
            if (f == 2) {
                for (int c = 0; c <= 10; c++) {
                    System.out.print(" | " + c);
                }
            }
            System.out.println("");
        }
    }
}
