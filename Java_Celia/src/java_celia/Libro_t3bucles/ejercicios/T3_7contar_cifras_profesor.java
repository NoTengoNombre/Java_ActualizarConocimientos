/**
 * @created on : 14-jul-2017, 23:42:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios;

public class T3_7contar_cifras_profesor {

    /**
     *
     * @param n
     * @return
     */
    public int calculaNumDiviendoRangos(int n) {

        int numCifras = 0;

        n = (int) (Math.abs(n));

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

    public int calculaDividiendoDistintoCero(int n) {
        int numCifras = 1;

        if (numCifras / 10 != 0) {
            numCifras = 2;
        }
        if (numCifras / 100 != 0) {
            numCifras = 3;
        }
        if (numCifras / 1000 != 0) {
            numCifras = 4;
        }
        if (numCifras / 10000 != 0) {
            numCifras = 5;
        }
        return numCifras;
    }

    public int calculaNumConBucle(int n) {

        int numCifras = 0;

        do {
            n = n / 10;
            numCifras++;
        } while (n != 0);

        return numCifras;
    }

    public int calculaNumConString(int n) {
        Integer str = (int) (Math.abs(n));
        String cadena = String.valueOf(str);
        int longitud = cadena.length();
        return longitud;
    }

    public static void main(String[] args) {

        T3_7contar_cifras_profesor t3 = new T3_7contar_cifras_profesor();
        int calculaNumCifras = t3.calculaNumDiviendoRangos(-100);
        System.out.println("longitud del numero : " + calculaNumCifras);

        int calculaNumCifras1 = t3.calculaDividiendoDistintoCero(100);
        System.out.println("longitud del numero : " + calculaNumCifras1);

        int calculaNumCifras2 = t3.calculaNumConBucle(-100);
        System.out.println("longitud del numero : " + calculaNumCifras2);

        int calculaNumCifras3 = t3.calculaNumConString(-100);
        System.out.println("longitud del numero : " + calculaNumCifras3);
    }

}
