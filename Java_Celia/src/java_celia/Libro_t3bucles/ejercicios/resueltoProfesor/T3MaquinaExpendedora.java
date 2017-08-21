/**
 * @created on : 21-ago-2017, 20:05:52
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3MaquinaExpendedora {

    private static double[] valores = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10};

    /**
     *
     * @param cantidad
     * @return
     */
    public int[] calcularMonedasDevueltas(double cantidad) {

        int[] devolucion = new int[10];
//                   0      1     2    3    4    5   6  7  8   9

        for (int i = 9; i >= 0; i--) {
            devolucion[i] = (int) (cantidad / valores[i]);
            cantidad -= (devolucion[i] * valores[i]);
            i--;
        }
        return devolucion;
    }

    public static void main(String[] args) {
        T3MaquinaExpendedora t3m = new T3MaquinaExpendedora();
        int[] devolucion = t3m.calcularMonedasDevueltas(33);

        for (int i = 9; i >= 0; i--) {

            if (valores[i] == 10) {
                System.out.println("Billete de 10 € - " + devolucion[i]);
            }
            if (valores[i] == 5) {
                System.out.println("Billete de 5 € - " + devolucion[i]);
            }
            if (valores[i] == 2) {
                System.out.println("Monedas de 2 € - " + devolucion[i]);
            }
            if (valores[i] == 1) {
                System.out.println("Monedas de 1 € - " + devolucion[i]);
            }
            if (valores[i] == 0.5) {
                System.out.println("Monedas de 0.5 € - " + devolucion[i]);
            }
            if (valores[i] == 0.1) {
                System.out.println("Monedas de 0.1 € - " + devolucion[i]);
            }
            if (valores[i] == 0.2) {
                System.out.println("Monedas de 0.2 € - " + devolucion[i]);
            }
            if (valores[i] == 0.05) {
                System.out.println("Monedas de 0.05 € - " + devolucion[i]);
            }
        }
    }
}
