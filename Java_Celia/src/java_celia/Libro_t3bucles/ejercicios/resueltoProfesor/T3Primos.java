/**
 * @created on : 21-ago-2017, 16:13:11
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.Libro_t3bucles.ejercicios.resueltoProfesor;

public class T3Primos {

    /**
     *
     * @param num
     * @return
     */
    public boolean esPrimo(int num) {
        boolean primo;
        int numDivisores;

        numDivisores = calculaNumDivisores(num);

//        if (numDivisores > 2) {
//            primo = false;
//        } else {
//            primo = true;
//        }
        primo = numDivisores <= 2;
        return primo;
    }

    /**
     * Nota : Podemos resumir todo el codigo anterior asi:
     *
     * @param numero
     * @return
     */
    public boolean esOmirp(int numero) {
        int inverso = getInvertir(numero);
        return ((esPrimo(numero)) && (esPrimo(inverso)));
//        boolean omirp;
//        if (esPrimo(n) && (esPrimo(inverso))) {
//            omirp = true;
//        } else {
//            omirp = false;
//        }
//        return omirp;
        /**
         * Nota : Podemos resumir todo el codigo anterior
         */
    }

    /**
     *
     * @param numero
     * @return
     */
    public int[] listaPrimos(int numero) {
        int contador = 0;
        int indice = 1;
        int[] primos = new int[numero];

        while (contador < numero) {
            if (esPrimo(indice)) {
                primos[contador] = indice;
                contador++;
            }
            indice++;
        }
        return primos;
    }

    /**
     *
     * @param numero
     * @return
     */
    public int getInvertir(int numero) {

        int numDigitos = getContarDigitos(numero);
        int[] digitos = new int[numDigitos];
        int inv = 0;
//                              5
        for (int i = 0; i < numDigitos; i++) {
            digitos[i] = (numero / (int) Math.pow(10, i)) % 10;
        }
//                      0 <     5
        for (int i = 0; i < numDigitos; i++) {
            inv = inv + digitos[i] * (int) Math.pow(10, (numDigitos - i - 1));
        }
        return inv;
    }

    public int calculaNumDivisores(int numero) {
//        Almecena los numeros divisores
        int numDivisoresPositivos = 0;
//        Convierte negativos a positivos
        int numeroPositivo = Math.abs(numero);
        //  1 a n elementos      
        for (int i = 1; i <= numeroPositivo; i++) {
            if (numeroPositivo % i == 0) {
                numDivisoresPositivos++; // Cuenta los numeros pares
            }
        }
        return numDivisoresPositivos;
    }

    /**
     * Devuelve los primeros 'n' numeros Omirps
     *
     * @param n
     * @return
     */
    public int[] listaOmirps(int n) {
        int cont = 0; // Numeros de Omirps encontrados hasta ahora
        int i = 1;
        int[] omirps = new int[n];

        while (cont < n) {
            if (esOmirp(i)) {
                omirps[cont] = i;
                cont++;
            }
            i++;
        }
        return omirps;
    }

    /**
     * Devuelve cuantos digitos se han pasado por parametro
     *
     * @param num
     * @return
     */
    public int getContarDigitos(int num) {
        int contador = 0;
        while (num >= 1) {
            contador++;
            num = num / 10;
        }
        return contador;
    }

    public static void main(String[] args) {

    }

}
