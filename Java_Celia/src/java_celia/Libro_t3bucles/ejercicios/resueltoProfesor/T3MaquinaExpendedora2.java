/**
 * @created on : 21-ago-2017, 20:22:55
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3MaquinaExpendedora2 {

    public int[] calcularMonedasDevueltas(double cantidad) {

        int[] devolucion = new int[10];
        double[] valores = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10};

        int i = 9;

        for (i = 9; i >= 0; i--) {
            devolucion[i] = (int) (cantidad / valores[i]);
            cantidad = cantidad - (devolucion[i] * valores[i]);
            i--;
        }

        return devolucion;
    }

    public static void main(String[] args) {

        T3MaquinaExpendedora m = new T3MaquinaExpendedora();
        int[] devolucion = m.calcularMonedasDevueltas(14.45);

        for (int i = 9; i >= 0; i--) {
            System.out.println(devolucion[i]);
        }

    }
}
