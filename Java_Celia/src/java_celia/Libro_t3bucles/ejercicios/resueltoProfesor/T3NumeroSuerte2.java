/**
 * @created on : 21-ago-2017, 16:09:46
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3NumeroSuerte2 {

    int suma;

    public T3NumeroSuerte2(int d, int m, int a) {
        suma = d + m + a;
    }

    private int sumaCifras(int n) {
        int cifra = 0, acum = 0;

        do {
            cifra = n % 10;
            acum += cifra;
            n /= 10;
        } while ((n != 0));

        return n;
    }

    public int getNumeroSuerte() {

        int acum = sumaCifras(suma);

        if (acum > 10) {
            acum = sumaCifras(acum);
        }
        return acum;
    }

}
