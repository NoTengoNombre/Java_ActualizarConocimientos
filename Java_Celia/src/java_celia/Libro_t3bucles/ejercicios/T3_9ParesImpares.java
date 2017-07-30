/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_9ParesImpares {

    private int a = 0;
    private int b = 0;

    public T3_9ParesImpares() {
        a = 0;
        b = 0;
    }

    public T3_9ParesImpares(int aa, int bb) {
        a = aa;
        b = bb;
    }

    public void getPares() {
        if (b <= a) {
            System.out.println("La variable 'B' "
                    + "con valor '" + b + "' no puede ser menor");
        } else {
            do {
                if (a % 2 == 0) {
                    System.out.printf("\u001B[32m Par " + a + " \n");
                } else if (a % 2 != 0) {
                    System.out.printf("\u001B[31m Impar " + a + " \n");
                }
                a++;
            } while (a <= b);
        }
    }

    public static void main(String[] args) {

        T3_9ParesImpares t = new T3_9ParesImpares(10, 100);
        t.getPares();

    }
}
