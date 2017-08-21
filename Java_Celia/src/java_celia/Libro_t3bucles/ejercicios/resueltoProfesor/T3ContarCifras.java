/**
 * @created on : 20-ago-2017, 23:21:22
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3ContarCifras {

    public int calculaNumCifras(int n) {
        int numCifras = 0;

        n = (Math.abs(n));

        if (n >= 0 && n <= 9) {
            numCifras = 1;
        }

        if (n >= 10 && n <= 99) {
            numCifras = 2;
        }

        if (n >= 100 && n <= 999) {
            numCifras = 3;
        }

        if (n >= 1000 && n <= 9999) {
            numCifras = 4;
        }

        if (n >= 10000 && n <= 99999) {
            numCifras = 5;
        }

        return numCifras;
    }

    public int calculaNumCifras2(int numero) {

        int numCifras = 1;

        if (numero / 10 != 0) {
            numCifras = 2;
        }
        if (numero / 100 != 0) {
            numCifras = 3;
        }
        if (numero / 1000 != 0) {
            numCifras = 4;
        }
        if (numero / 10000 != 0) {
            numCifras = 5;
        }
        return numCifras;
    }

    public int calculaNumCifras3(int n) {
        int numCifras = 0;

        do {
            n = n / 10;
            numCifras++;
        } while (n != 0);
        return numCifras;
    }

    /**
     * Convertir un numero en String
     *
     * @param n
     * @return
     */
    public int calculaNumCifras4(int n) {
        String x = String.valueOf(Math.abs(n));
        return x.length();
    }

}
